package cl.desafiolatam.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.proyecto.models.Paciente;
import cl.desafiolatam.proyecto.repositories.PacienteRepository;


@Service
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;

	public List<Paciente> obtenerTodosLosPacientes() {
		return pacienteRepository.findAll();
	}

	public Paciente obtenerPacientePorId(Long id) {
		return pacienteRepository.findById(id).orElse(null);
	}

	public Paciente guardarPaciente(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public void eliminarPaciente(Long id) {
		pacienteRepository.deleteById(id);
	}
}
