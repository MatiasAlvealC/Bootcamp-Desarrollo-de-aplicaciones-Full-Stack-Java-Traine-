package Arreglos;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<String> random = new ArrayList<String>();
		random.add("Primero");
		random.add("Segundo");
		random.add("Tercero");
		random.add("Cuarto");
		random.add("Quinto");
		
		for (Iterator iterator = random.iterator(); iterator.hasNext();) {
			String elemento = (String) iterator.next();
			System.out.println("El elemento es "+ elemento);
		}
	}

}
