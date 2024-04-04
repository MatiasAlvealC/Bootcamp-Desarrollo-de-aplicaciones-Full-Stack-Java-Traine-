package Anidado;

import java.util.Scanner;

public class CuadradoVacio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingrese un numer: ");
		int n =sc.nextInt();
		
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
		}

}
