package Desafio;
import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {
		/*
		 * Patrón 1
		 *	*.*.*.*.*.*.*
		 *	Patrón 2
		 * 	12341234
		 * 	Patrón 3
		 *	||*||*||*||*
		 */
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingrese un numero: ");
		int n =sc.nextInt();
		
		System.out.println("Patron 1: ");
		// patron 1
		for (int i = 1;i<=n;i++) {
			if (i%2 !=0 ) {
				System.out.printf("*");
			}
			else {
				System.out.printf(".");
			}
		}
		System.out.printf("\n");
		// patron 2
		System.out.println("Patron 2: ");
		String pat2="1234";
		for (int i =0;i<n;i++) {
			System.out.print(pat2);
		}
		
		System.out.printf("\n");
		
		// patron 3
		
		System.out.println("Patron 3: ");
		for (int i =1;i<=n;i++) {
			if (i%3==0) {
				System.out.printf("*");
			}
			else {
				System.out.printf("|");

			}
		}
	}

}
