package Anidado;
import java.util.Scanner;

public class Escalera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Ingrese un numer: ");
		int n =sc.nextInt();
		for (int j=0;j<n;j++) {
			for (int i =0;i<=j;i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
