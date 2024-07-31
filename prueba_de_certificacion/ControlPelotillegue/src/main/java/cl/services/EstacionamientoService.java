package cl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.models.Estacionamiento;
import cl.repositories.EstacionamientoRepository;



@Service
public class EstacionamientoService {
	@Autowired
	private EstacionamientoRepository estacionamientoRepository;

	public List<Estacionamiento> obtenerTodosLosEstacionamientos() {
		return estacionamientoRepository.findAll();
	}

	public Estacionamiento obtenerEstacionamientoPorId(Long id) {
		return estacionamientoRepository.findById(id).orElse(null);
	}

	public Estacionamiento guardarEstacionamiento(Estacionamiento estacionamiento) {
		return estacionamientoRepository.save(estacionamiento);
	}
	
	public void eliminarEstacionamiento(Long id) {
		estacionamientoRepository.deleteById(id);
	}
	public Estacionamiento obtenerEstacionamientoPorNombre(String nombre) {
        return estacionamientoRepository.findByNombre(nombre);
    }
}
