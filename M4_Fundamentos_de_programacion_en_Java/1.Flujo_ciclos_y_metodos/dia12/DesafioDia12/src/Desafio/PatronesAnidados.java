package Desafio;
import java.util.Scanner;

public class PatronesAnidados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingrese un numero: ");
		int n =sc.nextInt();
		
		// se imprime el metodo 1, llamando al metodo
		System.out.println("Patron 1:");
		ImprimirPatron1(n);
		// se imprime el metodo 2, llamando al metodo
		System.out.println("Patron 2:");
		ImprimirPatron2(n);
		// se imprime el metodo 3, llamando al metodo
		System.out.println("Patron 3:");
		ImprimirPatron3(n);
		// se imprime el metodo 4, llamando al metodo
		System.out.println("Patron 4:");
		ImprimirPatron4(n);
	}
	
	
	// metodo del patron 1
	public static void ImprimirPatron1(int n) {
		for (int j = 0;j<n;j++) {
			for (int i=0;i<n;i++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");

				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	
	// metodo del patron 2
	public static void ImprimirPatron2(int n) {
		for (int j = 0;j<n;j++) {
			for (int i=0;i<n;i++) {
				if (j!=0 && j!=n-1 &&  i + j == n - 1) {
					System.out.printf("*");
				}
				else if (j==0 || j==n-1) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	// metodo del patron 3
	public static void ImprimirPatron3(int n) {
		for (int j = 0;j<n;j++) {
			for (int i=0;i<n;i++) {
				if (i == j || i + j == n - 1) {
		            System.out.print("x");
		        }
				else {
		            System.out.print(" ");
		        }
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");		
	}
	
	// metodo del patron 4
	public static void ImprimirPatron4(int n) {
		for (int j = 0;j<n;j++) {
			for (int i=0;i<n;i++) {
				if (j==0 && i<n-1) {
					System.out.printf("*");
				}
				else if (j==n-1 && i>0) {
					System.out.printf("*");
				}
				else if (j>0 && j!=n-1 && i>0 && i<n-1) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");

				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}

}
