package dia7;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.printf("Ingrese un numero entre 1 y 10:");
			num = sc.nextInt();
		} while (num<1 || num>10);
		
		System.out.printf("El número ingresado es: %d\n",num);
	}

}
