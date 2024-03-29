package dia8;
import java.util.Scanner;
public class EjercicioPropuesto1 {

	public static void main(String[] args) {
		
		double resultado = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		double num1 = sc.nextLong();
		System.out.println("Ingrese otro número: ");
		double num2 = sc.nextLong();
		
		System.out.println("Menú de acciones \n 1. Sumar \n 2. Restar \n 3.Multiplicar \n 4. Dividir \n 5.Salir \n");
		System.out.println("Ingrese el numero de la accion que desea relizar: ");
		
		do {
			int accion = sc.nextInt();
			if (accion==1) {
				System.out.println("seleccion la suma");
				resultado=num1+num2;
				break;
			}
			else if (accion==2) {
				System.out.println("seleccion la resta");
				resultado = num1 - num2;
				break;
			}
			else if (accion==3) {
				System.out.println("seleccion la multiplicación");
				resultado = num1 * num2;
				break;
			}
			else if (accion==4) {
				System.out.println("seleccion la división");
				resultado = num1/num2;
				break;
			}
			else if (accion==5) {
				System.out.println("seleccion salir ");
				System.out.println("Estamos saliendo... ");
				System.out.println("Bye ");
				break;
			}
			else {
				System.out.println("Seleccione correctamente ");
			}
			
		} while (true);
		System.out.println("El resultado es:  "+resultado);
	}

}
