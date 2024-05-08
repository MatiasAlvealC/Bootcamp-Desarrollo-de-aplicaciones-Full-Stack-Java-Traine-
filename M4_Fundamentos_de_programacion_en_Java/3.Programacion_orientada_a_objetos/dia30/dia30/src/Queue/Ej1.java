package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Ej1 {

	public static void main(String[] args) {
		// Queue
		Queue continentes = new LinkedList<>(); 
		continentes.add("África");
		continentes.add("América");
		continentes.add("Europa");
		continentes.add("Oceanía");
		continentes.add("Asia");
		continentes.add("Antártica");
		System.out.println(continentes);
		
		// Para poner un elemento específico del encolamiento continentes,
		// podemos usar el método remove()
		
		System.out.println(continentes.remove("Antártica"));
		System.out.println(continentes);
		
		// Para eliminar un encabezado, es decir, el primero de la lista 
		// se elimina, podemos usar el método poll().
		
		System.out.println(continentes.poll());
		System.out.println(continentes);
		
		// Para obtener el encabezado de la cola sin eliminarlo podemos 
		// usar el método peek()
		
		System.out.println("peek : " + continentes.peek());
		System.out.println(continentes);
		
		// Para encontrar un elemento, al igual que peek se puede 
		// hacer sin eliminar el objeto con el método element()
		
		System.out.println("element: "+continentes.element());
		System.out.println(continentes);
		
		// Para encontrar el tamaño de un encolado, podemos 
		//utilizar el método size()
		
		System.out.println(continentes.size());
	}

}
