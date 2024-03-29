package dia7;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingrese la contraseña: ");
		String password = sc.nextLine();
		while (password.compareTo("password")!=0) {
			System.out.printf("La contraseña es incorrecta \n",password);
			System.out.printf("Ingrese la contraseña: ");
			password = sc.nextLine();
		}
		System.out.printf("La contraseña ingresada es correcta \n");
	}

}
