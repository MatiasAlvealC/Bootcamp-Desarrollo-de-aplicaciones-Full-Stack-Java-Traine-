package cl.desafiolatam.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.proyecto.models.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
