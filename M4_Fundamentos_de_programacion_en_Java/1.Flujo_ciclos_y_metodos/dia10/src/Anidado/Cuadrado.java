package Anidado;
import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingrese un numero: ");
		int n = sc.nextInt();
		for (int j = 0;j<n;j++) {
			for (int i=0;i<n;i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
