package Ejercicio2;
import java.util.Scanner;

public class SoloPares2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Ingrese la cantidad de numeros pares desea ver : ");
		int n = sc.nextInt();
		
		int i=1; //contador de numeros, parte del 1 para no considerar el 0
		int cont=1;  // contador de numeros pares
		
		System.out.printf("Los primeros "+n+" numero pares son:\n");
		do {
			if (i%2 == 0) { // si es par 
				System.out.println(i);
				cont++; // se suma un numero par
			}
			i++; // suma un numero al contador general
		} while (cont<=n); // mientras la cantidad de pares contados sea menor o igual a n
	}

}
