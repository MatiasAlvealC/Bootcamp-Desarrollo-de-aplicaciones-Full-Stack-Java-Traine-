package Desafio;

public class Bus extends Vehiculo{
	private int cantidadDeAsientos;

	// constructor
	public Bus(String color, String patente, int cantidadDeAsientos) {
		super(color, patente);
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	
	// método
	
	public int asientosDisponibles() {
		return cantidadDeAsientos;
	}

	// getter and setter
	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}	
}
