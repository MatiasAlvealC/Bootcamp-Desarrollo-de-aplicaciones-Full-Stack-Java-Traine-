package Ejercicio2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio {

	public static void main(String[] args) {
		// 1
		Set<String> invitados = new TreeSet<>();
		
		// 2
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
		
		System.out.println(invitados);
		
		// 3
		Set<String> invitadosPosibles = new HashSet<>(Arrays.asList("Jorge","Francisco","Marcos"));
		
		invitados.addAll(invitadosPosibles);
		System.out.println(invitados);
		
		// 4
		invitados.remove("Jorge");
		System.out.println(invitados);
	}

}
