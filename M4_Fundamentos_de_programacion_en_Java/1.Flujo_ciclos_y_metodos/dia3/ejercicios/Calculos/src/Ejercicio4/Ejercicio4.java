package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Ejercicio 4: Convertir Fahrenheit a Celsius con Entrada del Usuario
		 * Enunciado: Cambia el programa de conversión de Fahrenheit a Celsius 
		 * para que el valor inicial de fahrenheit sea proporcionado por el usuario.
		 * Utiliza la clase Scanner para capturar este valor desde la consola. 
		 * Realiza la conversión y muestra el valor en Celsius en la consola.
		 */
		
		double Fahrenheit;
		double Celsius;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Tranformaremos de Fahrenheit a Celsius, porque somos sudakas");
		System.out.println("Ingrese Fahrenheit: ");
		Fahrenheit = sc.nextDouble();
		
		Celsius = (Fahrenheit-32)/1.8;
		System.out.println("Los "+Fahrenheit+"F que ingreso son "+Celsius+" C");
		
	}
}
