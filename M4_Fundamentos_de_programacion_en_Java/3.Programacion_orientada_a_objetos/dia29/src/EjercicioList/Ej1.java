package EjercicioList;

import java.util.ArrayList;

public class Ej1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Scala");
		list.add("Kotlin");
		System.out.println(list);
		
		// en get le ingresamos la posicion
		System.out.println(list.get(0));
	}

}
