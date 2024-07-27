package cl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.models.Usuario;
import cl.services.UserDetailsServiceImpl;
import cl.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    // Mostrar formulario de registro
    @GetMapping("/registrarse")
    public String registerForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "Registro"; // Nombre de la vista Thymeleaf para el formulario de registro
    }

    // Manejar solicitud de registro (POST)
    @PostMapping("/registrarse")
    public String registerUsuario(@ModelAttribute("usuario") Usuario usuario,
                                  @RequestParam("rol") String rolNombre,
                                  Model model) {
        usuarioService.saveWithUsuarioRol(usuario, rolNombre); // Guarda usuario con el rol seleccionado
        return "redirect:/usuario/iniciarSesion"; // Redirigir a la página de inicio de sesión
    }
    // Mostrar formulario de login
    @GetMapping("/iniciarSesion")
    public String loginPage(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "logout", required = false) String logout,
                            Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Credenciales inválidas. Intenta nuevamente.");
        }
        if (logout != null) {
            model.addAttribute("logoutMessage", "Logout correcto.");
        }
        return "IniciarSesion"; // Nombre de la vista Thymeleaf para el formulario de login
    }
    
    @PostMapping("/iniciarSesion")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {

        try {
            // Cargar detalles del usuario
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);

            // Verificar la contraseña
            // if (!passwordEncoder.matches(password, userDetails.getPassword())) {
            //     throw new BadCredentialsException("Credenciales inválidas");
            // }

            // Autenticar manualmente
            Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);

            // Redirigir según el tipo de usuario o página de inicio
            return "redirect:/usuario/home"; // Redirige a la página de inicio después del login exitoso

        } catch (UsernameNotFoundException | BadCredentialsException e) {
            model.addAttribute("errorMessage", "Credenciales inválidas. Intenta nuevamente.");
            return "IniciarSesion"; // Vuelve al formulario de login con un mensaje de error
        }
    }

    // Mostrar página de inicio después del login
    @GetMapping("/home")
    public String home(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        Usuario currentUser = usuarioService.findByUsername(username);
        model.addAttribute("currentUser", currentUser);
        return "home"; // Nombre de la vista Thymeleaf para la página de inicio
    }
}
