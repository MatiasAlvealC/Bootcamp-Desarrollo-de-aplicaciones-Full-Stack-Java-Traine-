package dia7;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu \n Opcion 1 \n Opcion 2 \n Salir");

		do {
			System.out.println("Que desea hacer: ");
			opcion=sc.nextLine();
			if (opcion.equals("1")) {
				System.out.println("Usted ingreso la opcion 1");
			}
			else if (opcion.equals("2")) {
				System.out.println("Usted ingreso la opcion 2");
			}
			else if (opcion.equals("salir")){
				System.out.println("Saliendo...");
				break;
			}
			else {
				System.out.println("Ingrese una opcion valida");
			}
			
		} while (true);
	}
}
