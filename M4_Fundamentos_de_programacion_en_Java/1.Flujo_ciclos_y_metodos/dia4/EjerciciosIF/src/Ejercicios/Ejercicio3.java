package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 3: Máximo de Dos Números
		 * Desarrolla un programa que lea dos números del usuario 
		 * y muestre el número más grande.
		 * Utiliza una condicional para determinar cuál número 
		 * es mayor y muestra el resultado.
		 */
		
		double num1;
		double num2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		num1 = sc.nextDouble();
		
		System.out.println("Ingrese otro numero");
		num2 = sc.nextDouble();
		
		if (num1 == num2) {
			System.out.println("Los numeros ingresados son iguales");
		}
		else if (num1>num2) {
			System.out.println("El numero "+num1+" Es mayor a "+num2);
		}
		else {
			System.out.println("El numero "+num2+" Es mayor a "+num1);
		}
	}

}
