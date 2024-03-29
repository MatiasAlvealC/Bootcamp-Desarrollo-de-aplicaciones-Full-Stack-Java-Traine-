package dia7;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingresa un número del 1 al 10: ");
		int num = sc.nextInt();
		while (num <1 || num>10) {
			System.out.printf("El numero no está entre 1 y 10 \n");
			System.out.printf("Ingresa un numero del 1 al 10: ");
			num = sc.nextInt();
		}
		System.out.printf("El numero ingresado fue: %d \n",num);

	}

}
