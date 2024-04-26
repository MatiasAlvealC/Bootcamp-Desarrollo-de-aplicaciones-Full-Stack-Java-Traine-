package Desafio;

public class MiniBus extends Bus {
	private String tipoViaje;
	
	// constructor
	public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
		super(color, patente, cantidadDeAsientos);
		this.tipoViaje = tipoViaje;
	}

	// métodos
	public void imprimeBus() {
		System.out.println("MiniBus:");
        System.out.println("Color: " + getColor());
        System.out.println("Patente: " + getPatente());
        System.out.println("Cantidad de Asientos: " + getCantidadDeAsientos());
        System.out.println("Tipo de Viaje: " + tipoViaje);
  	}

	// getter and setter
	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}
	
	
	
	
}
