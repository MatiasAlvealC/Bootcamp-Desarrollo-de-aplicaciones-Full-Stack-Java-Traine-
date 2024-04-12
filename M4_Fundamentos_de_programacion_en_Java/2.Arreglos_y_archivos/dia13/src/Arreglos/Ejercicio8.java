package Arreglos;
import java.util.ArrayList;
public class Ejercicio8 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList <String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		System.out.println(a); //[a,b,c,d]
		a.remove("a");
		System.out.println(a); //[b,c,d]
	}

}
