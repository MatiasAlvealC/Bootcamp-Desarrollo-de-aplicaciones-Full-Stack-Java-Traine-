package cl.desafiolatam.proyecto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cl.desafiolatam.proyecto.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
	//Usamos entidad Cliente
	@Query("SELECT a FROM Cliente a WHERE a.nombre = ?1")
	List<Cliente> findAllClienteNombre(String nombre);
	//Query comun
	@Query(value="SELECT * FROM clientes c WHERE c.nombre =?1",nativeQuery = true)
	List<Cliente> buscarNombre(String nombre);
}
