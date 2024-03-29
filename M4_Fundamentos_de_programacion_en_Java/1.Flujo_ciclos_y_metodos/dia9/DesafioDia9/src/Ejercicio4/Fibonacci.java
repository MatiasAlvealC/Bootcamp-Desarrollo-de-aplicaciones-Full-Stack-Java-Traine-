package Ejercicio4;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Calcularemos la secuencia de Fibonacci ");
		System.out.printf("Ingrese cuantos elementos desea ver: ");
		int n = sc.nextInt(); // se solicita el numero de secuencia
		
		System.out.println("Secuencia Fibonacci de " + n + " términos:");

        int n1 = 0;
        int n2 = 1;	
        
        // Mostrar los dos primeros números
        System.out.println(n1);
        System.out.println(n2);
        
        // Calcular y mostrar el resto de la secuencia
        for (int i = 0; i < n-1; i++) { // restamos, dado que  los primeros 2 terminos ya estan mostrados
            int suma = n1 + n2; // F(n) = F(n-1)+F(n-2)
            System.out.println(suma);
            n1 = n2;
            n2 = suma;
        }

	}

}