package cl.desafiolatam.proyecto.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String nombre;
	private String apellido;
	private String fono;
	private String direccion;
	private String email;
	public Cliente(String nombre, String apellido, String fono, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fono = fono;
		this.direccion = direccion;
		this.email = email;
	}
	public Cliente() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFono() {
		return fono;
	}
	public void setFono(String fono) {
		this.fono = fono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
