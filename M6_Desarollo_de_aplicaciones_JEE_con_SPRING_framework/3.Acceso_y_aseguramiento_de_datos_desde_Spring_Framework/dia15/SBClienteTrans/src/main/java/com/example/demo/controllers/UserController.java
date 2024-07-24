package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Users;
import com.example.demo.services.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String listarUsuarios(Model model) {
        List<Users> usuarios = userService.obtenerTodosLosUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "lista-usuarios";
    }

    @GetMapping("/new")
    public String mostrarFormularioDeNuevoUsuario(Model model) {
        model.addAttribute("user", new Users());
        return "formulario-usuario";
    }
    
    @PostMapping
    public String guardarUsuario(@RequestParam String nombre, @RequestParam String email) {
    	
    	Users usuario = new Users();
    	usuario.setEmail(email);
    	usuario.setName(nombre);
    	    	
        userService.guardarUsuario(usuario);
        return "redirect:/users";
    }
    
    @GetMapping("/edit/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable("id") Long id, Model model) {
        Users user = userService.obtenerUsuarioPorId(id);
        model.addAttribute("user", user);
        return "formulario-usuario";
    }
    
    @PostMapping("/update/{id}")
    public String actualizarUsuario(@PathVariable("id") Long id, @ModelAttribute("user") Users user) {
        user.setId(id);
        userService.guardarUsuario(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id) {
        userService.eliminarUsuario(id);
        return "redirect:/users";
    }

    

    @GetMapping("/find/name")
    public String buscarUsuarioPorNombre(@RequestParam String nombre,Model model) {
        Users usuario = userService.buscarUsuarioPorNombre(nombre);
        
        model.addAttribute("usuario", usuario);
        return "mostrarusuario";
    }   
}