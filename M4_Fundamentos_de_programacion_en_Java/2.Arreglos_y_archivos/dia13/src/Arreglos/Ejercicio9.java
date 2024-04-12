package Arreglos;
import java.util.ArrayList;
public class Ejercicio9 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList <String>();
		
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("c");
		a.add("c");
		a.add("c");
		a.add("a");
		a.add("d");
		
		System.out.println(a); //[a, b, c, c, c, c, a, d]
		
		ArrayList<String> elementosABorrar = new ArrayList<String>();
		
		elementosABorrar.add("a");
		elementosABorrar.add("c");
		
		a.removeAll(elementosABorrar);
		
		System.out.println(a); //[b, d]
	}

}
