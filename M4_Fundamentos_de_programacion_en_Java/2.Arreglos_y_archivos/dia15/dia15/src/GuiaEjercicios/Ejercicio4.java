package GuiaEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un nuevo ingrediente: ");
		String ingrediente = sc.nextLine();
		buscar(ingrediente);
	}
	
	public static void buscar(String ingrediente) {
		ArrayList <String> ingredientes = new ArrayList <String> ();
		
		ingredientes.add("piña");
		ingredientes.add("jamón");
		ingredientes.add("salsa");
		ingredientes.add("queso");
		
		
		if (ingredientes.contains(ingrediente)) {
			System.out.printf("El ingrediente ya se encuentra dentro de la pizza \n");
		}
		else {
			ingredientes.add(ingrediente);
			System.out.printf("El ingrediente %s fue agregado\n", ingrediente);
		}
		System.out.println(ingredientes);
	}

}
