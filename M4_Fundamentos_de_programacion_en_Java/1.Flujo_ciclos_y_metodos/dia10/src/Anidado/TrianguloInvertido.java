package Anidado;
import java.util.Scanner;

public class TrianguloInvertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Ingrese un numer: ");
		int n =sc.nextInt();
		for (int j=	n;j>0;j--) {
			for (int i=j;i>0;i--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
