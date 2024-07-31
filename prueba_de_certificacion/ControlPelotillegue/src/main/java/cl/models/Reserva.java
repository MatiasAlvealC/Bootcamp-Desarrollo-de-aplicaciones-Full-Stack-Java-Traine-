package cl.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reserva {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String fecha_hora_inicio;
    private String fecha_hora_fin;
    private String estado_reserva;
    
    @ManyToOne(fetch = FetchType.LAZY)
   	@JoinColumn(name = "usuario_id")
   	@JsonBackReference
   	private Usuario usuario;
    
    @ManyToOne(fetch = FetchType.LAZY)
   	@JoinColumn(name = "vehiculo_id")
   	@JsonBackReference
   	private Vehiculo vehiculo;
    
    @ManyToOne(fetch = FetchType.LAZY)
   	@JoinColumn(name = "estacionamiento_id")
   	@JsonBackReference
   	private Estacionamiento estacionamiento;
	
    // getters and setters
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFecha_hora_inicio() {
		return fecha_hora_inicio;
	}
	public void setFecha_hora_inicio(String fecha_hora_inicio) {
		this.fecha_hora_inicio = fecha_hora_inicio;
	}
	public String getFecha_hora_fin() {
		return fecha_hora_fin;
	}
	public void setFecha_hora_fin(String fecha_hora_fin) {
		this.fecha_hora_fin = fecha_hora_fin;
	}
	public String getEstado_reserva() {
		return estado_reserva;
	}
	public void setEstado_reserva(String estado_reserva) {
		this.estado_reserva = estado_reserva;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Estacionamiento getEstacionamiento() {
		return estacionamiento;
	}
	public void setEstacionamiento(Estacionamiento estacionamiento) {
		this.estacionamiento = estacionamiento;
	}    
}
