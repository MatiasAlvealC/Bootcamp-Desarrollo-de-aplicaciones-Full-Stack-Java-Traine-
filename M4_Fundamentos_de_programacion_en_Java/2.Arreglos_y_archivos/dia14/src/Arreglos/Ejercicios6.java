package Arreglos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ejercicios6 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(26);
		numeros.add(34);
		numeros.add(14);
		numeros.add(55);
		
		System.out.println("Los numeros pares son");
		for (Iterator iterator = numeros.iterator(); iterator.hasNext();) {
			int elemento = (int) iterator.next();
			if (elemento%2 == 0) {
				System.out.println(elemento);
			}
		}
		System.out.println("Los numeros ordenad");
		Collections.sort(numeros);
		System.out.println(numeros);
	}

}
