package cl.desafiolatam.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.proyecto.model.Cliente;


@Repository
public interface ClinteRepository extends JpaRepository<Cliente, Long>{

}

