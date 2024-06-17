package cl.desafiolatam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.models.Mensaje;
import cl.desafiolatam.repositories.MensajeRepository;

@Service
public class MensajeService {
	@Autowired
	private MensajeRepository mensajeRepository;
	
	public List<Mensaje> obteneMensaje(){
		return mensajeRepository.findAll();
	}
	
	public Optional<Mensaje> obtenerMensajePorId(Long id){
		return mensajeRepository.findById(id);
	}
	
	public Mensaje crearMensaje(Mensaje mensaje) {
		return mensajeRepository.save(mensaje);
	}
	
	public void eliminarMensaje(Long id) {
		mensajeRepository.deleteById(id);
	}
	
	public Mensaje actualizarMensaje(Long id, Mensaje nuevoMensaje) {
		return mensajeRepository.findById(id)
				.map(mensaje -> {
					mensaje.setTexto(nuevoMensaje.getTexto());
					return mensajeRepository.save(mensaje);
				})
				.orElseGet(() -> {
					nuevoMensaje.setId(id);
					return mensajeRepository.save(nuevoMensaje);
				});
	}
}
