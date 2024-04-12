package Arreglos;
import java.util.ArrayList;

public class Ejercicio10 {

	public static void main(String[] args) {
		agregarNumeroPar(4);
	}
	
	public static void agregarNumeroPar(int num) {
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		if (num%2 == 0) {
			numeros.add(num);
		}
		System.out.println(numeros);
	}

}
