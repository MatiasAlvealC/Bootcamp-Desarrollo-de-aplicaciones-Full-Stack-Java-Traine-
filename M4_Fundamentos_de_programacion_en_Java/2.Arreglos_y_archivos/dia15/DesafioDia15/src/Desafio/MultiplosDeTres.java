package Desafio;

import java.util.ArrayList;

public class MultiplosDeTres {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList <Integer>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(33);
		numeros.add(21);
		numeros.add(8);
		numeros.add(2);
		numeros.add(61);
		
		System.out.println("La suma de los multiplos de 3 del arreglo es "+suma(numeros));
		System.out.println("El promedio de los multiplos de 3 del arreglo es "+promedio(numeros));

	}
	public static int suma(ArrayList <Integer> arreglo) {
		int sumaMultiplos=0;
		for (int i = 0; i<arreglo.size();i++) {
			if (arreglo.get(i)%3 == 0) {
				sumaMultiplos += arreglo.get(i);
			}
		}
		return sumaMultiplos;
	}
	public static int promedio(ArrayList <Integer> arreglo) {
		int prom;
		int sumaMultiplos=0;
		int cont=0;
		for (int i = 0; i<arreglo.size();i++) {
			if (arreglo.get(i)%3 == 0) {
				sumaMultiplos += arreglo.get(i);
				cont++;
			}
		}
		
		return prom=sumaMultiplos/cont;
	}

}
