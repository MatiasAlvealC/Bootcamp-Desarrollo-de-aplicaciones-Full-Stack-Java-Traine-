package cl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.models.Reserva;
import cl.repositories.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;

	public List<Reserva> obtenerTodasLasReservas() {
		return reservaRepository.findAll();
	}

	public Reserva obtenerReservaPorId(Long id) {
		return reservaRepository.findById(id).orElse(null);
	}

	public List<Reserva> obtenerReservasPorUsuario(Long usuarioId) {
		return reservaRepository.findByUsuarioId(usuarioId);
	}

	public Reserva guardarReserva(Reserva reserva) {
		return reservaRepository.save(reserva);
	}

	public void eliminarReserva(Long id) {
		reservaRepository.deleteById(id);
	}
}
