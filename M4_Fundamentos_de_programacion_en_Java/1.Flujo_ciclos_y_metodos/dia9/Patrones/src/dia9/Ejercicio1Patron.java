package dia9;
import java.util.Scanner;
public class Ejercicio1Patron {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Dibujaremos un patron \n Ingrese el largo que desea el patron: ");
		int N = sc.nextInt();
		String patron="";
		for (int i=1;i<=N;i++) {
			if (i%2 != 0) {
				patron += "*";
			}
			else {
				patron += ".";
			}
		}
		System.out.printf(patron);

	}

}
