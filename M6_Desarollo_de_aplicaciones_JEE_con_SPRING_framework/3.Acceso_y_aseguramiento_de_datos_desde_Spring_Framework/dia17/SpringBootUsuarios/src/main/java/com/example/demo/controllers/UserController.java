package com.example.demo.controllers;

import com.example.demo.models.Users;
import com.example.demo.services.UserDetailsServiceImpl;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    // Mostrar formulario de registro
    @GetMapping("/registration")
    public String registerForm(Model model) {
        model.addAttribute("user", new Users());
        return "registrationPage"; // Nombre de la vista Thymeleaf para el formulario de registro
    }

    // Manejar solicitud de registro (POST)
    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("user") Users user, Model model) {
        userService.saveWithUserRole(user); // Lógica para guardar usuario con rol de usuario
        return "redirect:/users/login"; // Redirigir a la página de inicio de sesión
    }

    // Mostrar formulario de login
    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "logout", required = false) String logout,
                            Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Credenciales inválidas. Intenta nuevamente.");
        }
        if (logout != null) {
            model.addAttribute("logoutMessage", "Logout correcto.");
        }
        return "loginPage"; // Nombre de la vista Thymeleaf para el formulario de login
    }
    
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {

        try {
            // Cargar detalles del usuario
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);

			/*
			 * // Verificar la contraseña if (!password.equals(userDetails.getPassword())) {
			 * throw new BadCredentialsException("Credenciales inválidas"); }
			 */

            // Autenticar manualmente
            Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);

            // Redirigir según el tipo de usuario o página de inicio
            model.addAttribute("currentUser", userService.findByUsername(userDetails.getUsername()));
            return "redirect:/users/home"; // Redirige a la página de inicio después del login exitoso

        } catch (UsernameNotFoundException | BadCredentialsException e) {
            model.addAttribute("errorMessage", "Credenciales inválidas. Intenta nuevamente.");
            return "loginPage"; // Vuelve al formulario de login con un mensaje de error
        }
    }
    // Mostrar página de inicio después del login
    @GetMapping("/home")
    public String home(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        Users currentUser = userService.findByUsername(username);
        model.addAttribute("currentUser", currentUser);
        return "home"; // Nombre de la vista Thymeleaf para la página de inicio
    }
}
