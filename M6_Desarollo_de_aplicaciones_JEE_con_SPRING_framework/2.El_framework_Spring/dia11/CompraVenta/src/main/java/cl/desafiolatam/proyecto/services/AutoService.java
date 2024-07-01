package cl.desafiolatam.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.proyecto.models.Auto;
import cl.desafiolatam.proyecto.repositories.AutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
@Transactional
public class AutoService {
	@Autowired
	AutoRepository autoRepository;

	public void guardarAuto(@Valid Auto auto) {
		autoRepository.save(auto);
	}

	public List<Auto> findAll() {
		return autoRepository.findAll();
	}

	public Auto buscarId(Long id) {
		return autoRepository.findById(id).get();
	}

	public void eliminarPorId(Long id) {
		autoRepository.deleteById(id);
	}
}