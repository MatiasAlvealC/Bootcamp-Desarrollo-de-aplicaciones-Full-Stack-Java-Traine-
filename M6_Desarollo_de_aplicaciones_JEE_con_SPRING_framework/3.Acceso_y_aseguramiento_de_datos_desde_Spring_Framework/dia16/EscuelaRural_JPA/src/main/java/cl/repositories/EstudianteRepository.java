package cl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.models.Estudiante;


public interface EstudianteRepository extends JpaRepository<Estudiante, Long>  {

}
