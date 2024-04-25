package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		Auto instancia = new Auto();
		
		// encendemos el moto y aceleramos hasta 100
		instancia.setMotorEncendido(true);
		instancia.setVelocidadActual(100);
		
		// vamos a imprimir el estado de nuestra instancia:
		System.out.println("Auto: ");
		System.out.println("Velocidad: "+instancia.getVelocidadActual());
		System.out.println("Motor Encendido: "+instancia.isMotorEncendido());
		
		// Intentamos apagar el moto
		instancia.apagarMotor();
		// vamos a imprimir el estado de nuestra instancia:
		System.out.println("Auto: ");
		System.out.println("Velocidad: "+instancia.getVelocidadActual());
		System.out.println("Motor Encendido: "+instancia.isMotorEncendido());
	}

}
