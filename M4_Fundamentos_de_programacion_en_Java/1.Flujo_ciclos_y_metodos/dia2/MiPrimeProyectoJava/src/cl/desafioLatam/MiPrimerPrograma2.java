package cl.desafioLatam;

import java.util.Scanner;

public class MiPrimerPrograma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		long numero = sc.nextLong();
		System.out.println("Numero: "+numero);
		
		long resultado = numero * numero;
		
		double resultado2= Math.sqrt(numero);
		System.out.println("El resultado es: "+resultado);
		System.out.println("La raiz es: "+resultado2);
	}

}
