package cl.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.models.Cliente;

@RestController
@RequestMapping("/api/cliente")
public class ClienteApiController {
	
	@GetMapping("/{id}")
	public Cliente encontrarPorId(@PathVariable String id) {
		return null;
	}
	
	@PutMapping("/actualizar/{id}")
	public void actualizarCliente(@PathVariable( "id" ) String id, @RequestBody Cliente cliente) {
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id" ) String id) {
	}

}
