package Ejercicio3;
import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Ingrese la cantidad de numeros impares que desea sumar: ");
		int n = sc.nextInt();
		
		int i=0; //contador de numeros
		int suma=0; // suma de numeros impares
		do {
			if (i%2 != 0) { // si es impar 
				suma += i;
			}
			i++; // suma un numero al contador general
		} while (i<=n); // mientras la cantidad de impares contados sea menor o igual a n
		System.out.printf("La suma de los impares dentro de los primeros "+n+" numero es: "+suma);
	}

}
