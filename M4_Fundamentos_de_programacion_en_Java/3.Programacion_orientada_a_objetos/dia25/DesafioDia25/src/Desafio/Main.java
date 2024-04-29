package Desafio;

public class Main {

	public static void main(String[] args) {
		// Crear un cliente
        Cliente cliente1 = new Cliente("11222333-4","Juan",30,30); 
        
        // Crear un vehículo
        Vehiculo vehiculo1 = new Vehiculo("Gris","ABC123"); 
        
        // Crear una venta
        
        LibroVenta libroVenta1 = new LibroVenta("Venta 1","22042024");
        
        libroVenta1.guardarVenta(cliente1, vehiculo1);
	}

}
