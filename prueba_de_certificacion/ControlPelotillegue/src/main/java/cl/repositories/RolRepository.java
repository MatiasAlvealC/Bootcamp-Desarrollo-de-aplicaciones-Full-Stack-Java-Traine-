package cl.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cl.models.Rol;


public interface RolRepository extends CrudRepository<Rol, Long> {

	List<Rol> findAll();
	Rol findByNombre(String nombre);
	
}