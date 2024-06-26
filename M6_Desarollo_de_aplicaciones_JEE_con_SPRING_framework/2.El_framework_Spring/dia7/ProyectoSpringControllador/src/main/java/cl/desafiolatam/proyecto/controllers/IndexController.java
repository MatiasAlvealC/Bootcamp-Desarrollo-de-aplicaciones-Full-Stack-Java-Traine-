package cl.desafiolatam.proyecto.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.desafiolatam.proyecto.modelo.Persona;

@Controller
public class IndexController {
	@GetMapping("/lista")
	public String Personas(Model model) {
		model.addAttribute("personas", getPersonas());
		return "lista";
	}

	private List<Persona> getPersonas() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Ejemplo1", 33));
		personas.add(new Persona("Ejemplo2", 23));
		return personas;
	}
}
