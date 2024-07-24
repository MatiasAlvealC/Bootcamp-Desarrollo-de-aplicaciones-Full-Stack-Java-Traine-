package cl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.models.Curso;


public interface CursoRepository extends JpaRepository<Curso, Long> {
	Curso findByNombre(String nombre);
}
