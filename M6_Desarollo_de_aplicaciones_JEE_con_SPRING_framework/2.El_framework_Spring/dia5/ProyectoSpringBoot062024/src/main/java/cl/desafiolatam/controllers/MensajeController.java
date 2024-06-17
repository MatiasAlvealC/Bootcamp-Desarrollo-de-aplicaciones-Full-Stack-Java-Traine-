package cl.desafiolatam.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cl.desafiolatam.models.Mensaje;
import cl.desafiolatam.services.MensajeService;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {

	@Autowired
	private MensajeService mensajeService;
	
	@GetMapping
	public List<Mensaje> obtenerMensajes(){
		return mensajeService.obteneMensaje();
	}
	
	@GetMapping("/{id}")
	public Optional<Mensaje> obtenerMensajePorId(@PathVariable Long id){
		return mensajeService.obtenerMensajePorId(id);
	}
	
	@PostMapping
	public Mensaje crearMensajes(@RequestBody Mensaje mensaje){
		return mensajeService.crearMensaje(mensaje);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarMensajePorId(@PathVariable Long id){
		mensajeService.eliminarMensaje(id);
	}
	
	@PutMapping("/{id}")
	public Mensaje actualizarMensaje(@PathVariable Long id, @RequestBody Mensaje nuevoMensaje){
		return mensajeService.actualizarMensaje(id, nuevoMensaje);
	}
	
	@GetMapping("/hola")
	public String holaMundo() {
		return "Hola Mundo";
	}
	
}
