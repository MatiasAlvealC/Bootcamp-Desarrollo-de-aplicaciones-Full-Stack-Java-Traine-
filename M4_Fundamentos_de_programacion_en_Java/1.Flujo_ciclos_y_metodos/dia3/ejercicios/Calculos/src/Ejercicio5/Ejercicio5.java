package Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 5: Perímetro de un Rectángulo con Entrada del Usuario
		 * Enunciado: Actualiza el programa de cálculo del perímetro de un rectángulo
		 * para que los valores de largo y ancho sean ingresados por el usuario.
		 * Emplea la clase Scanner para leer estos valores desde la consola. 
		 * Calcula el perímetro y muestra el resultado.
		 */
		
		double lado;
		double ancho;
		double perimetro;
		// se utiliza scanner para solicitar al usuario
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Hola, calcularemos el perimetro de un rectangulo");
			System.out.println("Ingrese el lado del rectangulo: ");
			lado = sc.nextDouble();
			
			System.out.println("Ingrese el ancho: ");
			ancho = sc.nextDouble();
			
			if (lado <=0) {
				System.out.println("Dato Inválido: lado");
			}
			if (ancho<=0) {
				System.out.println("Dato Inválido: ancho");
			}
		} while (lado<=0 || ancho<=0);
		
		//se calcula el perimetro
		perimetro = (2*lado)+(2*ancho);
		System.out.println("El perimetro del rectangulo es: "+perimetro);
	}

}
