package cl.desafiolatam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.models.Mensaje;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long>{

}
