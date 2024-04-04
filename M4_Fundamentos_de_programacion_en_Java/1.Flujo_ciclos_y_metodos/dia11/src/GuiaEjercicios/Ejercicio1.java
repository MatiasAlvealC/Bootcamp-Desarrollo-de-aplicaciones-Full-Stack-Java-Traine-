package GuiaEjercicios;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Ingrese un numero: ");
		int n =sc.nextInt();
		for (int j=1;j<=n;j++) {
			for (int i =1;i<=j;i++) {
				System.out.printf("%d",i);
			}
			System.out.printf("\n");
		}
	}

}
