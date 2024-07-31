package cl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.models.Estacionamiento;


public interface EstacionamientoRepository extends JpaRepository<Estacionamiento, Long>  {
	Estacionamiento findByNombre(String nombre);
}
