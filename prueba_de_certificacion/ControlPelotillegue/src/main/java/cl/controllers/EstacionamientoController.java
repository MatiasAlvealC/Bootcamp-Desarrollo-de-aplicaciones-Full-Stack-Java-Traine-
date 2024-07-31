package cl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.models.Estacionamiento;
import cl.services.EstacionamientoService;

@Controller
@RequestMapping("/estacionamientos")
public class EstacionamientoController {

    @Autowired
    private EstacionamientoService estacionamientoService;

    @GetMapping
    public String listarEstacionamientos(Model model) {
        List<Estacionamiento> estacionamientos = estacionamientoService.obtenerTodosLosEstacionamientos();
        model.addAttribute("estacionamientos", estacionamientos);
        return "estacionamientos/lista-estacionamientos";
    }

    @GetMapping("/new")
    public String mostrarFormularioDeNuevoEstacionamiento(Model model) {
        model.addAttribute("estacionamiento", new Estacionamiento());
        return "estacionamientos/formulario-estacionamiento";
    }

    @PostMapping
    public String guardarEstacionamiento(@RequestParam String nombre, @RequestParam String direccion,
                                         @RequestParam int capacidad, @RequestParam String tarifa_hora,
                                         @RequestParam String hora_cierre) {
        Estacionamiento nuevoEstacionamiento = new Estacionamiento();
        nuevoEstacionamiento.setNombre(nombre);
        nuevoEstacionamiento.setDireccion(direccion);
        nuevoEstacionamiento.setCapacidad(capacidad);
        nuevoEstacionamiento.setTarifa_hora(tarifa_hora);
        nuevoEstacionamiento.setHora_cierre(hora_cierre);

        estacionamientoService.guardarEstacionamiento(nuevoEstacionamiento);
        return "redirect:/estacionamientos";
    }

    @GetMapping("/edit/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable("id") Long id, Model model) {
        Estacionamiento estacionamiento = estacionamientoService.obtenerEstacionamientoPorId(id);
        model.addAttribute("estacionamiento", estacionamiento);
        return "estacionamientos/edicion-estacionamiento";
    }

    @PostMapping("/update/{id}")
    public String actualizarEstacionamiento(@PathVariable("id") Long id, @RequestParam String nombre,
                                            @RequestParam String direccion, @RequestParam int capacidad,
                                            @RequestParam String tarifa_hora, @RequestParam String hora_cierre) {
        Estacionamiento estacionamiento = estacionamientoService.obtenerEstacionamientoPorId(id);
        estacionamiento.setNombre(nombre);
        estacionamiento.setDireccion(direccion);
        estacionamiento.setCapacidad(capacidad);
        estacionamiento.setTarifa_hora(tarifa_hora);
        estacionamiento.setHora_cierre(hora_cierre);

        estacionamientoService.guardarEstacionamiento(estacionamiento);
        return "redirect:/estacionamientos";
    }

    @GetMapping("/delete/{id}")
    public String eliminarEstacionamiento(@PathVariable("id") Long id) {
        estacionamientoService.eliminarEstacionamiento(id);
        return "redirect:/estacionamientos";
    }
}
