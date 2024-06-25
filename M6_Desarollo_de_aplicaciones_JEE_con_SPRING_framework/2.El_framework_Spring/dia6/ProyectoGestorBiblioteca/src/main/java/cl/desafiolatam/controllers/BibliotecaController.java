package cl.desafiolatam.controllers;

import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
	private static final Logger logger = LogManager.getLogger(BibliotecaController.class);
	
	// metodo de saludo
	@GetMapping("/saludar")
	public ResponseEntity<String> saludarUsuario(){
		String saludo ="Hola, Usuario!";
		logger.info("Saludar al usuario");
		return ResponseEntity.ok(saludo);
	}
	
	// metodo para obtener la fecha actual
	@GetMapping("/fechaActual")
	 public ResponseEntity<LocalDate> obtenerFecha() {
	        LocalDate fechaActual = LocalDate.now();
			logger.info("La fecha actual es"+fechaActual);
	        return ResponseEntity.ok(fechaActual);
	    }

	// metodo de despedida
	@GetMapping("/despedir")
	public ResponseEntity<String> despedirUsuario(){
		String despedida ="Adios, Usuario!";
		logger.info("Despedida al usuario");
		return ResponseEntity.ok(despedida);
	}
}