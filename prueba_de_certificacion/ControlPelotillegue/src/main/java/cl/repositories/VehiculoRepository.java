package cl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.models.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String>  {
	
}