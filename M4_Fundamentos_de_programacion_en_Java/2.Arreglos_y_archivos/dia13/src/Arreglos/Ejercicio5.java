package Arreglos;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		ArrayList <String> ingredientes = new ArrayList <String> ();
		Scanner sc = new Scanner(System.in);
		
		ingredientes.add("piña");
		ingredientes.add("jamón");
		ingredientes.add("salsa");
		ingredientes.add("queso");
		
		System.out.println("ingrese un nuevo ingrediente: ");
		String ingrediente = sc.nextLine();
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
