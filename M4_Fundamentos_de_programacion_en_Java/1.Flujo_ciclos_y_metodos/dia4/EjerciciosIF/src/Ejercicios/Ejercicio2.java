package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 2: Clasificador de Números
		 * Desarrolla un programa que pida tres números al usuario y 
		 * los clasifique en orden ascendente o descendente,
		 * según prefiera el usuario. Utiliza condicionales para 
		 * comparar los números y realizar el ordenamiento
		 */
		
		// definimos variable
		double n1;
		double n2;
		double n3;
		String ordenar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese tres numeros");
		System.out.println("Numero 1:");
		n1 = sc.nextDouble();
		
		System.out.println("Numero 2:");
		n2 = sc.nextDouble();
		
		System.out.println("Numero 3:");
		n3 = sc.nextDouble();
		
		System.out.println("Desea ingresar ordenar los numero Ascendente (A) o Descendente (D): ");
		ordenar = sc.next();
		
			if (n1<n2 && n2<n3 && n3<n1) {
				System.out.println(""+n1+""+n2+""+n3);
			}
			else if (n1<n2 && n2>n3 && n3<n2) {
				System.out.println(""+n1+""+n3+""+n2);
			}
			else if (n2>n1 && n1<n3 && n3>n2) {
				System.out.println(""+n2+""+n1+""+n3);
			}
			else if (n2<n3 && n3>n1 && n1<n2) {
				System.out.println(""+n2+""+n3+""+n1);
			}
			else if (n3>n2 && n2<n1 && n1<n2) {
				System.out.println(""+n3+""+n2+""+n1);
			}
			else if (n3>n1 && n1<n3 && n3>n1) {
				System.out.println(""+n3+""+n1+""+n2);
			}		
	}

}
