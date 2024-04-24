package Modelo;

public class Persona {
	private String nombre;
	private String rut;
	private double altura;
	
	// contructores
	public Persona(String nuevoNombre, String nuevoRut, double nuevaAltura) {
		this.nombre = nuevoNombre;
		this.rut = nuevoRut;
		this.altura = nuevaAltura;
	}
	 
	public Persona instanciaClase() {
		Persona personita = new Persona ("Juan","1-9",12.2);
		return personita;
	}

	// es posible tener mas de un constructor si es necesario.
	// en este ejemplo necesitamos un constructor que solo reciba nombre y altura
	
	public Persona(String nuevoNombre, double nuevaAltura) {
		this.nombre = nuevoNombre;
		this.altura = nuevaAltura;
	}
	
}
