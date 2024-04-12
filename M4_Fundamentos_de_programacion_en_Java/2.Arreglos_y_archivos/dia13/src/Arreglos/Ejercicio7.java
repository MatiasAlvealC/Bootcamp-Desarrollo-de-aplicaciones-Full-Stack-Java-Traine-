package Arreglos;
import java.util.ArrayList;
public class Ejercicio7 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList <String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		System.out.println(a);
		String borrado = a.remove(1); // "b"
		System.out.println(a);
		System.out.println("Elemento borrado: " + borrado);
	}

}
