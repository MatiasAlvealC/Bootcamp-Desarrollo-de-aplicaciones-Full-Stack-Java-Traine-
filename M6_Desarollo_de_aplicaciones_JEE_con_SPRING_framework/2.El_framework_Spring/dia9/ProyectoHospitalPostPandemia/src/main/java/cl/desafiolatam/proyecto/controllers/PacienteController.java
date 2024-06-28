package cl.desafiolatam.proyecto.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import cl.desafiolatam.proyecto.models.Paciente;
import cl.desafiolatam.proyecto.services.PacienteService;



@Controller
@RequestMapping("")
public class PacienteController {

	private static final Logger logger = LogManager.getLogger(PacienteController.class);

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public String listarPacientes(Model model) {
        List<Paciente> pacientes = pacienteService.obtenerTodosLosPacientes();
        model.addAttribute("pacientes", pacientes);
		logger.info("Paciente listados");
        return "lista-pacientes";
    }

    @GetMapping("/new")
    public String mostrarFormularioDeNuevoPaciente(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "formulario-paciente";
    }
    
    @PostMapping
    public String guardarUsuario(@RequestParam String nombre, @RequestParam String email,@RequestParam int edad,@RequestParam String fecha_ingreso) {
    	Paciente nuevoPaciente = new Paciente();
    	nuevoPaciente.setName(nombre);
    	nuevoPaciente.setEmail(email);
    	nuevoPaciente.setEdad(edad);
    	nuevoPaciente.setFecha_ingreso(fecha_ingreso);
    	
        pacienteService.guardarPaciente(nuevoPaciente);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPaciente(@PathVariable("id") Long id) {
        pacienteService.eliminarPaciente(id);
        return "redirect:/";
    }
}
