package cl.desafiolatam.proyecto.controllers;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import cl.desafiolatam.proyecto.models.Auto;
import cl.desafiolatam.proyecto.services.AutoService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class AutoController {
	@Autowired
	AutoService autoService;

	@RequestMapping("")
	public String inicio(@ModelAttribute("auto") Auto auto) {
		return "auto.jsp";
	}

	@PostMapping("/guardar")
	public String guardarAuto(@Valid @ModelAttribute("auto") Auto auto, BindingResult resultado, Model model) {
	    if (resultado.hasErrors()) {
	      // model.addAttribute("msgError", "Datos erróneos");
	        return "autos.jsp";
	    } else {
	        autoService.guardarAuto(auto);
	        java.util.List<Auto> listaAutos = autoService.findAll();
	      //model.addAttribute("autosCapturados", listaAutos);
	        return "mostrarAutos.jsp";
	    }
	}

}