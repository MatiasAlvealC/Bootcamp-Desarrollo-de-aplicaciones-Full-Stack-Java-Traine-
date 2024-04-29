package Desafio;

public class Cliente extends Persona{
	private int edad;

	// constructor
	public Cliente(String rut, String nombre, int edad, int edad2) {
		super(rut, nombre, edad);
		this.edad = edad2;
	}

	// getter and setter
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
