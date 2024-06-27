package cl.desafiolatam.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import cl.desafiolatam.proyecto.models.Useres;
import cl.desafiolatam.proyecto.services.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping
    public String listarUsuarios(Model model) {
        List<Useres> usuarios = userService.obtenerTodosLosUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "lista-usuarios";
    }

    @GetMapping("/new")
    public String mostrarFormularioDeNuevoUsuario(Model model) {
        model.addAttribute("user", new Useres());
        return "formulario-usuario";
    }
    
    @PostMapping
    public String guardarUsuario(@RequestParam String nombre, @RequestParam String email) {
    	
    	Useres usuario = new Useres();
    	usuario.setEmail(email);
    	usuario.setName(nombre);
    	    	
        userService.guardarUsuario(usuario);
        return "redirect:/users";
    }
    
    @GetMapping("/edit/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable("id") Long id, Model model) {
        Useres user = userService.obtenerUsuarioPorId(id);
        model.addAttribute("user", user);
        return "formulario-usuario";
    }
    
    @PostMapping("/update/{id}")
    public String actualizarUsuario(@PathVariable("id") Long id, @ModelAttribute("user") Useres useres) {
        useres.setId(id);
        userService.guardarUsuario(useres);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id) {
        userService.eliminarUsuario(id);
        return "redirect:/users";
    }

    

    @GetMapping("/find/name")
    public String buscarUsuarioPorNombre(@RequestParam String nombre,Model model) {
        Useres usuario = userService.buscarUsuarioPorNombre(nombre);
        
        model.addAttribute("usuario", usuario);
        return "mostrarusuario";

    }
}
