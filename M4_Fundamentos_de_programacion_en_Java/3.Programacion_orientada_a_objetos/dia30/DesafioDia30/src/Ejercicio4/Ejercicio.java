package Ejercicio4;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio {

	public static void main(String[] args) {
		// 1
		Queue<String> juegos = new LinkedList<>();
		
		// 2
		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachipún");
		juegos.add("Pillarse");
		
		System.out.println(juegos);
		
		// 3
		int cantidadJuegos= juegos.size();
		System.out.println("La cantidad de juegos es: "+cantidadJuegos);
	}

}
