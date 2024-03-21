package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 4: Comprobación de Par o Impar
		 * Escribe un programa que solicite al usuario un número 
		 * y determine si es par o impar.
		 * Usa el operador módulo (%) para esta comprobación.
		 */
		
		double num;
		String mensaje;

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		num = sc.nextDouble();
		
		if (num%2==0) {
			mensaje = "par";
		}
		else {
			mensaje = "Impar";
		}
		System.out.println("El numero "+num+" es "+mensaje);
	}

}
