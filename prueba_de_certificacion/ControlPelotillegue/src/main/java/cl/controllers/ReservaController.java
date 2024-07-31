package cl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.models.Estacionamiento;
import cl.models.Reserva;
import cl.models.Usuario;
import cl.models.Vehiculo;
import cl.services.EstacionamientoService;
import cl.services.ReservaService;
import cl.services.UsuarioService;
import cl.services.VehiculoService;

@Controller
@RequestMapping("/reservas")
public class ReservaController {
	@Autowired
	private ReservaService reservaService;
	    
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@Autowired
    private EstacionamientoService estacionamientoService;

	@GetMapping
	public String listarReservas(Model model) {
		List<Reserva> reservas = reservaService.obtenerTodasLasReservas();
		model.addAttribute("reservas", reservas);
		return "/reservas/lista-reservas";
	}

	@GetMapping("/edit/{id}")
	public String mostrarFormularioDeEdicion(@PathVariable("id") Long id, Model model) {
		Reserva reserva = reservaService.obtenerReservaPorId(id);
		model.addAttribute("reserva", reserva);
		return "/reservas/edicion-reserva";
	}

	@PostMapping("/update/{id}")
	public String actualizarReserva(@PathVariable Long id,
	        @RequestParam String fecha_hora_inicio, @RequestParam String fecha_hora_fin,
	        @RequestParam String estado_reserva, @RequestParam String vehiculo_id,
	        @RequestParam String nombreEstacionamiento, Model model) {

	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    String email = auth.getName();
	    Usuario usuario = usuarioService.findByUserEmail(email);

	    Reserva reserva = reservaService.obtenerReservaPorId(id);
	

	    // Actualizar campos

	    if (estado_reserva.equals("Pendiente") || reserva.getEstado_reserva().equals("Confirmada")) {
	    	Estacionamiento estacionamiento = estacionamientoService.obtenerEstacionamientoPorNombre(nombreEstacionamiento);
	        reserva.setEstacionamiento(estacionamiento);
	    } else {
	    	  model.addAttribute("errorMessage", "No es posible modificar el estacionamiento");
	    }
	    
	    if (estado_reserva.equals("Cancelado") && reserva.getEstado_reserva().equals("Pendiente")) {
	    	reserva.setEstado_reserva(estado_reserva);
	    } else if(estado_reserva.equals("Pendiente") && reserva.getEstado_reserva().equals("Cancelado")) {
	    	reserva.setEstado_reserva(estado_reserva);
	    }
	    if (estado_reserva.equals("Confirmado") && reserva.getEstado_reserva().equals("Pendiente")) {
	    	reserva.setEstado_reserva(estado_reserva);
	    } else if(estado_reserva.equals("Pendiente") && reserva.getEstado_reserva().equals("Confirmado")) {
	    	reserva.setEstado_reserva(estado_reserva);
	    }
	    reservaService.guardarReserva(reserva);

	    return "redirect:/reservas";
	}
	    


	@GetMapping("/delete/{id}")
	public String eliminarReserva(@PathVariable("id") Long id) {
		reservaService.eliminarReserva(id);
		return "redirect:/reservas";
	}
}

