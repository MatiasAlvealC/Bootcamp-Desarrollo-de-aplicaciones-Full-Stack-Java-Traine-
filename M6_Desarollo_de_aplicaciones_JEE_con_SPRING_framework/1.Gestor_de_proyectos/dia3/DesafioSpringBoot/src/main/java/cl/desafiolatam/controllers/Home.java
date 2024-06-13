package cl.desafiolatam.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.model.Persona;

@RestController
public class Home {

	private static final Logger logger = LogManager.getLogger(Home.class);

	@GetMapping("/persona")
	public String personal() {
		Persona alumno = new Persona("AlumnoNombre","AlumnoApellido",20);
		
		logger.info("Información del personal");
		logger.info("Nombre:"+alumno.getNombre());
		logger.info("Apellido:"+alumno.getApellido());
		logger.info("Edad:"+alumno.getEdad());

		
		String msj = "Nombre:" + alumno.getNombre() + "<br/>" +
                "Apellido:" + alumno.getApellido() + "<br/>" +
                "Edad:" + alumno.getEdad();
		return msj;
	}
}
