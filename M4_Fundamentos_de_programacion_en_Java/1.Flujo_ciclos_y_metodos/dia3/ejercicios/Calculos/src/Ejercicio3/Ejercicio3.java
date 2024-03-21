package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejercicio 3: Promedio de Tres Números con Entrada del Usuario
		 * Enunciado: Modifica el programa del cálculo del promedio para que los valores
		 * de num1, num2, y num3 sean ingresados por el usuario.
		 * Usa la clase Scanner para leer estos valores. Calcula el promedio y 
		 * asegúrate de que el resultado sea de tipo flotante.
		 *  Muestra el promedio en la consola. 
		 */
		
		// variables
		
		double num1;
		double num2;
		double num3;
		double promedio;
		
		// se utiliza scanner para solicitar al usuario
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Calcularemos el promedio de tres numeros");
		System.out.println("Ingrese el numero 1: ");
		num1= sc.nextDouble();
		System.out.println("Ingrese el numero 2: ");
		num2= sc.nextDouble();
		System.out.println("Ingrese el numero 3: ");
		num3= sc.nextDouble();
		
		promedio = (num1+num2+num3)/3;
		System.out.println("El promedio de los tres numeros es: "+promedio);
	}

}
