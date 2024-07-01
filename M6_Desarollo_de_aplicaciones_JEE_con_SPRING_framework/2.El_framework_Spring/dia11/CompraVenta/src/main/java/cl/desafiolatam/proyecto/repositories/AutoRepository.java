package cl.desafiolatam.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.proyecto.models.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long>{
}

