package cl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.models.Estudiante;
import cl.repositories.EstudianteRepository;

@Service
public class EstudianteService {
	@Autowired
	private EstudianteRepository estudianteRepository;

	public List<Estudiante> obtenerTodosLosEstudiantes() {
		return estudianteRepository.findAll();
	}

	public Estudiante obtenerEstudiantePorId(Long id) {
		return estudianteRepository.findById(id).orElse(null);
	}

	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}
	
	public void eliminarEstudiante(Long id) {
		estudianteRepository.deleteById(id);
	}
}
