package cl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.models.Ciudad;
import cl.repositories.CiudadRepository;

@Service
public class CiudadService implements ICiudadService {
	@Autowired
	CiudadRepository cRepository;

	@Override
	public List<Ciudad> getCiudades() {
		return cRepository.findAll();
	}

	@Override
	public void saveCiudad(Ciudad ciudad) {
		cRepository.save(ciudad);
	}
}
