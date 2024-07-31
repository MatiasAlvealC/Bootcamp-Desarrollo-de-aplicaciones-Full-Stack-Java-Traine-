package cl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.models.Usuario;
import cl.models.Vehiculo;
import cl.services.UsuarioService;
import cl.services.VehiculoService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @Autowired
    private UsuarioService usuarioService; // Asumiendo que necesitarás esto para asociar vehículos a usuarios

    @GetMapping
    public String listarVehiculos(Model model) {
        List<Vehiculo> vehiculos = vehiculoService.obtenerTodosLosVehiculos();
        model.addAttribute("vehiculos", vehiculos);
        return "/vehiculos/lista-vehiculos";
    }

    @GetMapping("/new")
    public String mostrarFormularioDeNuevoVehiculo(Model model,Usuario usuario) {
        model.addAttribute("vehiculo", new Vehiculo());
        return "/vehiculos/formulario-vehiculo";
    }

    @PostMapping
    public String guardarVehiculo(@RequestParam String matricula, @RequestParam String marca,
                                  @RequestParam String modelo, @RequestParam int ano,
                                  @RequestParam String color, @RequestParam String tipo_vehiculo, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        
        Usuario usuario = usuarioService.findByUserEmail(email);
        
        Vehiculo nuevoVehiculo = new Vehiculo();
        nuevoVehiculo.setMatricula(matricula);
        nuevoVehiculo.setMarca(marca);
        nuevoVehiculo.setModelo(modelo);
        nuevoVehiculo.setAno(ano);
        nuevoVehiculo.setColor(color);
        nuevoVehiculo.setTipo_vehiculo(tipo_vehiculo);
        nuevoVehiculo.setUsuario(usuario);
    

        vehiculoService.guardarVehiculo(nuevoVehiculo);
        return "redirect:/vehiculos";
    }

    @GetMapping("/edit/{matricula}")
    public String mostrarFormularioDeEdicion(@PathVariable("matricula") String matricula, Model model) {
        Vehiculo vehiculo = vehiculoService.obtenerVehiculoPorId(matricula);
        model.addAttribute("vehiculo", vehiculo);
        return "/vehiculos/edicion-vehiculo";
    }

    @PostMapping("/update/{matricula}")
    public String actualizarVehiculo(@PathVariable("matricula") String matricula,
                                     @RequestParam String marca, @RequestParam String modelo,
                                     @RequestParam int ano, @RequestParam String color,
                                     @RequestParam String tipo_vehiculo, @RequestParam String usuarioEmail) {
        Vehiculo vehiculo = vehiculoService.obtenerVehiculoPorId(matricula);
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setAno(ano);
        vehiculo.setColor(color);
        vehiculo.setTipo_vehiculo(tipo_vehiculo);

        Usuario usuario = usuarioService.findByUserEmail(usuarioEmail);
        vehiculo.setUsuario(usuario);

        vehiculoService.guardarVehiculo(vehiculo);
        return "redirect:/vehiculos";
    }

    @GetMapping("/delete/{matricula}")
    public String eliminarVehiculo(@PathVariable("matricula") String matricula) {
        vehiculoService.eliminarVehiculo(matricula);
        return "redirect:/vehiculos";
    }
}
