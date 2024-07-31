package cl.models;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Estacionamiento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nombre;
	private String direccion;
	private int capacidad;
	private String tarifa_hora;
	private String hora_cierre;

	@OneToMany(mappedBy = "estacionamiento", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<Reserva> reservas = new HashSet<>();

	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getTarifa_hora() {
		return tarifa_hora;
	}

	public void setTarifa_hora(String tarifa_hora) {
		this.tarifa_hora = tarifa_hora;
	}

	public String getHora_cierre() {
		return hora_cierre;
	}

	public void setHora_cierre(String hora_cierre) {
		this.hora_cierre = hora_cierre;
	}

	public Set<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}
}
