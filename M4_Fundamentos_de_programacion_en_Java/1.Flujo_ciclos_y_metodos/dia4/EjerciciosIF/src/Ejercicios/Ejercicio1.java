package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 1: Calculadora de Índice de Masa Corporal (IMC)
		 * Crea un programa que calcule el Índice de Masa Corporal (IMC) 
		 * basado en el peso (en kilogramos) y la altura (en metros)
		 * ingresados por el usuario. El IMC se calcula dividiendo el peso 
		 * en kilogramos por el cuadrado de la altura en metros. 
		 * Además, el programa debe indicar en qué categoría de peso 
		 * se encuentra el usuario según su IMC:
		 * Menor a 18.5: Bajo peso
		 * Entre 18.5 y 24.9: Normal
		 * Entre 25 y 29.9: Sobrepeso
		 * 30 o más: Obesidad
		 */
		
		// variables
		double peso;
		double altura;
		double IMC;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Calcularemos el IMC");
		System.out.println("Ingrese su peso en kilogramos: ");
		peso=sc.nextDouble();
		
		System.out.println("Ingrese su altura en metros: ");
		altura=sc.nextDouble();
		
		// se calcula el IMC
		
		IMC = peso /Math.pow(altura,2);
		
		if (IMC<18.5) {
			System.out.println("Su IMC es "+IMC+" clasifica como Bajo peso ");
		}
		else if (IMC>=18.5 && IMC<24.9) {
			System.out.println("Su IMC es "+IMC+" clasifica como Normal");
		}
		else if (IMC>=25 && IMC<29.9) {
			System.out.println("Su IMC es "+IMC+" clasifica como Sobrepeso");
		}
		else if (IMC>=30) {
			System.out.println("Su IMC es "+IMC+" clasifica como Obesidad");
		}
		else {
			System.out.println("IMC Invalido");
		}		
	}

}
