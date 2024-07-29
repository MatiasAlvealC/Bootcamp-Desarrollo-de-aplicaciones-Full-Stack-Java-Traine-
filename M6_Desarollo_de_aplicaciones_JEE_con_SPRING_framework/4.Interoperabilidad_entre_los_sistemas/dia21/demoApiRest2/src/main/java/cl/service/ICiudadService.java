package cl.service;

import java.util.List;

import cl.models.Ciudad;

public interface ICiudadService {
	List<Ciudad> getCiudades();
	void saveCiudad(Ciudad ciudad);
}
