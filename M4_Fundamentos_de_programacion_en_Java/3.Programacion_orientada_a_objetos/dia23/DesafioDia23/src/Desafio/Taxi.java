package Desafio;

public class Taxi extends Vehiculo{
	private int valorPasaje;

	// constructor
	public Taxi(String color, String patente, int valorPasaje) {
		super(color, patente);
		this.valorPasaje = valorPasaje;
	}
	// método
	
	public int pagarPasaje(int pasaje) {
		if (pasaje >=valorPasaje) {
			int vuelto = pasaje - valorPasaje;
			return vuelto;
		}
		else {
			return pasaje;
		}
	}
	
	// Getter and Setter

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
}
