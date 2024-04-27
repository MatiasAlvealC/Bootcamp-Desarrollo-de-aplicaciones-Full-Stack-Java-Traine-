package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		Auto instanciaAuto = new Auto();
		System.out.println("Auto creado");
		instanciaAuto.aumentarVelocidad();
		System.out.println(instanciaAuto.toString());
		
		
		Auto instancia = new Auto();
		instancia.setMarca("Opel");
		instancia.setModelo("Corsa");
		instancia.setColor("Blanco");
		Conductor conductor = new Conductor();
		conductor.setAutoConducido(instancia);
		conductor.setNombre("Juan");
		System.out.println("Auto y conductor creados");
		System.out.println(conductor.toString());
	}

}
