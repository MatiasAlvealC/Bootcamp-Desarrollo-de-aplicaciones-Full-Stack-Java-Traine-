package Ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 1: Suma de Dos Números con Entrada del Usuario
		Enunciado: Modifica el programa anterior para que ahora los valores
		de las variables a y b sean ingresados por el usuario a través de la consola. 
		Utiliza la clase Scanner para leer los valores. Calcula la suma de estas dos
		variables y almacena el	resultado en una variable llamada suma. Imprime el 
		resultado en la consola
		*/
		
		// se definen las variables
		double n1;
		double n2;
		double suma;
		
		// se utiliza scanner para solicitar al usuario
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese un numero: ");
		n1 = sc.nextDouble();
		System.out.println("Ingrese otro numero: ");
		n2 = sc.nextDouble();
		
		suma = n1 + n2;
		
		System.out.println("La suma de los numeros ingresados es: "+suma);
	}

}
