package cl.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.models.Reserva;


public interface ReservaRepository extends JpaRepository<Reserva, Long>  {
	List<Reserva> findByUsuarioId(Long usuarioId);
}