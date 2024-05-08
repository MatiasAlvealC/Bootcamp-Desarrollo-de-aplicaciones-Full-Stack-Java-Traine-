package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ej3 {

	public static void main(String[] args) {
		// TreeSet
		// Almacena sus elementos en un árbol rojo-negro, es decir,
		// ordena sus elementos en función de sus valores.
		// Es sustancialmente más lento que HashSet
		Set<String> capitales = new TreeSet<>();
		capitales.add("Buenos Aires");
		capitales.add("Brasilia");
		capitales.add("Asunción");
		capitales.add("Lima");
		System.out.println(capitales);
		
		// hay otra forma de ingresar los elementos 
		// como una lista
		Set<String> capitales2 = new HashSet<>(Arrays.asList("Caracas", "Bogotá",
				"Montevideo","Quito", "Brasilia"));
		// unimos ambas colecciones
		// primero redefinimos capitales
		Set<String> capitalesUnidas = new TreeSet<>(capitales);
		// se añade
		capitalesUnidas.addAll(capitales2);
		
		// veremos como a pesar de no ser treeset capitales2 
		// al ser añadida a capitalesunidas que si es treeset se comporta como tal
		System.out.println(capitalesUnidas);
		
		// Si queremos borrar una colección completa de la lista, 
		// debemos usar el método removeAll()
		
		Set<String> removerCapitales = new HashSet<>(capitales);
		removerCapitales.removeAll(capitales2);
		// solo se remueve una colleccion, no todas
		System.out.println(removerCapitales);
		
		// Para encontrar valores en común entre colecciones, 
		// se puede usar el método retainAll()
		
		Set<String> interseccionCapitales = new HashSet<>(capitales);
		interseccionCapitales.retainAll(capitales2);
		System.out.println(interseccionCapitales);
	}

}
