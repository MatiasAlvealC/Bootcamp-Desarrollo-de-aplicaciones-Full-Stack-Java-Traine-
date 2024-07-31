package cl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.models.Vehiculo;
import cl.repositories.VehiculoRepository;

@Service
public class VehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;

	public List<Vehiculo> obtenerTodosLosVehiculos() {
		return vehiculoRepository.findAll();
	}

	public Vehiculo obtenerVehiculoPorId(String matricula) {
		return vehiculoRepository.findById(matricula).orElse(null);
	}

	public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
		return vehiculoRepository.save(vehiculo);
	}

	public void eliminarVehiculo(String matricula) {
		vehiculoRepository.deleteById(matricula);
	}
}
