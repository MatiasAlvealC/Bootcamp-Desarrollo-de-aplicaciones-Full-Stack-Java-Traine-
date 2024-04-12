package Arreglos;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList <String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		System.out.println(a); //[a, b, c, d]
		
		// set()
		a.set(1, "k");
		System.out.println(a); //[a, k, c, d]
		
		// size()
		System.out.println(a.size()); //4
		
		// sort()
		ArrayList<String> paises = new ArrayList<String>();
		paises.add("Chile");
		paises.add("Argentina");
		paises.add("Colombia");
		paises.add("Perú");
		paises.add("Venezuela");
		
		System.out.println(paises); 
		Collections.sort(paises);
		System.out.println(paises); //[Argentina, Chile, Colombia, Perú,Venezuela]
		
		// minuscula va a al final
		paises.add("chile");
		Collections.sort(paises);
		System.out.println(paises);
		
		// para solucionar el tema de minusculas y mayusculas
		Collections.sort(paises,String.CASE_INSENSITIVE_ORDER);
		System.out.println(paises);
		
		
		// en reversa o order descendente
		
		Collections.reverse(paises);
		System.out.println(paises);
		
		
		
		// Minimos y maximos
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(1);
		numeros.add(4);
		numeros.add(1);
		numeros.add(2);
		numeros.add(6);
		System.out.println(numeros);
		System.out.println(Collections.min(numeros)); //1
		System.out.println(Collections.max(numeros)); //6
		
		// obtener la frecuencia o cuanto se repeti un elemento
		System.out.println(Collections.frequency(numeros, 1));
	}

}
