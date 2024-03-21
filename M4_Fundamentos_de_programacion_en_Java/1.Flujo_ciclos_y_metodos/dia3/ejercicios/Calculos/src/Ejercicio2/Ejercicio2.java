package Ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 2: Área de un Círculo con Entrada del Usuario
		 * Enunciado: Adapta el programa del cálculo del área de un círculo para que 
		 * el valor del radio sea proporcionado por el usuario.
		 *  Utiliza la clase Scanner para obtener el valor del radio desde la consola.
		 *   Calcula el área utilizando la fórmula del área de un círculo y muestra 
		 *   el resultado en la consola. area=pi*r2
		 */
		
		// de finicion de variables
		double r;
		final double Pi=3.14;
		double area;
		
		// se utiliza scanner para solicitar al usuario
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Calcularemos el area de un circulo");
		System.out.println("Ingrese el radio: " );
		r=sc.nextDouble();
		
		area = Pi * Math.pow(r, 2);
		
		System.out.println("El area del circulo de radio "+r+" es: "+area);
		
	}

}