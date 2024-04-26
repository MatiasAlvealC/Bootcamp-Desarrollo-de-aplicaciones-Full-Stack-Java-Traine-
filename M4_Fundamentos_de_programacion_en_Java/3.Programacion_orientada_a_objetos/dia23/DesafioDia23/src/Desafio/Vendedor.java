package Desafio;

public class Vendedor extends Persona{
	private String direccion;

	// constructor
	public Vendedor(String rut, String nombre, int edad, String direccion) {
		super(rut, nombre, edad);
		this.direccion = direccion;
	}

	// getter and setter
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
