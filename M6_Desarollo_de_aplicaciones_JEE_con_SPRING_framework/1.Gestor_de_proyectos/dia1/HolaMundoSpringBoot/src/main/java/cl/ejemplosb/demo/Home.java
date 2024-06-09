package cl.ejemplosb.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	@GetMapping("/saludar")
	public String hola() {
		return "Hola Mundo";
	}
	
	@GetMapping("/adios")
	public String adios() {
		return "Adios Mundo";
	}
}
