package Desafio;

public class Vehiculo {
	private String color;
	private String patente;
	
	// constructor
	public Vehiculo(String color, String patente) {
		this.color = color;
		this.patente = patente;
	}

	// getter and setter

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
		
	
}
