package Arreglos;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio54 {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Juan de Dios");
		nombres.add("Diego Almagro");
		nombres.add("Valesca Del Carmen");
		nombres.add("Pedro Jitano");
		nombres.add("Margarita Jesus");
		System.out.println("Los nombres son");
		for (Iterator iterator = nombres.iterator(); iterator.hasNext();) {
			String elemento = (String) iterator.next();
			System.out.println(elemento);
		}
	}

}
