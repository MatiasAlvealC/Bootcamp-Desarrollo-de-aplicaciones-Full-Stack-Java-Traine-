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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cl.models.Estacionamiento;
import cl.models.Reserva;
import cl.models.Usuario;
import cl.models.Vehiculo;

import cl.services.EstacionamientoService;
import cl.services.ReservaService;
import cl.services.UsuarioService;
import cl.services.VehiculoService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/misreservas")
public class MisReservasController {

    @Autowired
    private ReservaService reservaService;
    
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private VehiculoService vehiculoService;
    @Autowired
    private EstacionamientoService estacionamientoService;

    @GetMapping
    public String listarMisReservas(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();
        Usuario usuario = usuarioService.findByUserEmail(email);
        
        if (usuario == null) {
            return "redirect:/usuario/iniciarSesion"; // Redirige si no hay usuario autenticado
        }
        
        List<Reserva> misReservas = reservaService.obtenerReservasPorUsuario(usuario.getId());
        model.addAttribute("misReservas", misReservas);
        model.addAttribute("reserva", new Reserva());
        return "reservas/misReservas";
    }

    @PostMapping
    public String guardarOActualizarReserva(@RequestParam(required = false) Long id,
            @RequestParam String fecha_hora_inicio, @RequestParam String fecha_hora_fin, @RequestParam String estado_reserva,
            @RequestParam String vehiculo_id, @RequestParam String nombreEstacionamiento, HttpServletRequest request, RedirectAttributes redirectAttributes) {
      
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        
        Usuario usuario = usuarioService.findByUserEmail(email);
        
        Reserva reserva;
        if (id != null) {
            reserva = reservaService.obtenerReservaPorId(id);
            
            // Validaciones de estado
            if (reserva.getEstado_reserva().equals("Cancelada")) {
                redirectAttributes.addFlashAttribute("errorMessage", "No se puede cambiar una reserva cancelada.");
                return "redirect:/misreservas";
            }
            
            if (reserva.getEstado_reserva().equals("Confirmada") && estado_reserva.equals("Pendiente")) {
                redirectAttributes.addFlashAttribute("errorMessage", "No se puede cambiar una reserva confirmada a pendiente.");
                return "redirect:/misreservas";
            }
        } else {
            reserva = new Reserva();
        }
        
        reserva.setFecha_hora_inicio(fecha_hora_inicio);
        reserva.setFecha_hora_fin(fecha_hora_fin);
        reserva.setEstado_reserva(estado_reserva);
        reserva.setUsuario(usuario);
        
        if (estado_reserva.equals("Pendiente")) {
            // Permitir actualización de matrícula y estacionamiento solo si el estado es Pendiente
            Vehiculo vehiculo = vehiculoService.obtenerVehiculoPorId(vehiculo_id);
            reserva.setVehiculo(vehiculo);
            Estacionamiento estacionamiento = estacionamientoService.obtenerEstacionamientoPorNombre(nombreEstacionamiento);
            reserva.setEstacionamiento(estacionamiento);
        } else {
            // Si el estado no es Pendiente, no se actualizan matrícula y estacionamiento
            if (id != null) {
                reserva.setVehiculo(reservaService.obtenerReservaPorId(id).getVehiculo());
                reserva.setEstacionamiento(reservaService.obtenerReservaPorId(id).getEstacionamiento());
            }
        }
        
        reservaService.guardarReserva(reserva);
        
        return "redirect:/misreservas";
    }


    @GetMapping("/edit/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable("id") Long id, Model model) {
        Reserva reserva = reservaService.obtenerReservaPorId(id);
        model.addAttribute("reserva", reserva);
        List<Reserva> misReservas = reservaService.obtenerReservasPorUsuario(usuarioService.findByUserEmail(SecurityContextHolder.getContext().getAuthentication().getName()).getId());
        model.addAttribute("misReservas", misReservas);
        return "reservas/misReservas";
    }

    @GetMapping("/delete/{id}")
    public String eliminarReserva(@PathVariable("id") Long id) {
        reservaService.eliminarReserva(id);
        return "redirect:/misreservas";
    }
}
