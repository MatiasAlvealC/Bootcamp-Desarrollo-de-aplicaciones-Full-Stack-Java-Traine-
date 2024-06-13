package cl.ejemplosb.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	private static final Logger logger = LogManager.getLogger(Home.class);

	@GetMapping("/saludar")
	public String hola() {
		logger.info("Acceso a la URL /saludar");
		return "Hola Mundo";
	}
	
	@GetMapping("/adios")
	public String adios() {
		logger.info("Acceso a la URL /adios");
		return "Adios Mundo";
	}
}
