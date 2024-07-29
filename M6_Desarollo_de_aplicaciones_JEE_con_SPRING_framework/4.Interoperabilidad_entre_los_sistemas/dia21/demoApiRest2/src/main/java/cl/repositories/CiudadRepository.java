package cl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.models.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long>{
}