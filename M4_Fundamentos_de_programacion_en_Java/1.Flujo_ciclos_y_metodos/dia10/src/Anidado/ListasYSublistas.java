package Anidado;
import java.util.Scanner;

public class ListasYSublistas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingrese un numero: ");
		int n =sc.nextInt();
		System.out.printf("Ingrese otr numero: ");
		int m =sc.nextInt();

		for (int j = 1;j<=n;j++) {
			System.out.printf("<li>\n");
			System.out.printf("\t<ul>\n");
			for (int i = 1;i<=m;i++) {
				System.out.printf("\t\t<li> %d.%d</li>\n",j,i);
			}
			System.out.printf("\t</ul>\n");
			System.out.printf("</li>\n");
		}
	}

}
