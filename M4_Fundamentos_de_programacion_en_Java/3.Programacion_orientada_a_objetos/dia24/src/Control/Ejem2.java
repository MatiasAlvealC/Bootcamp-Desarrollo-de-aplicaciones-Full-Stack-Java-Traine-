package Control;

import java.util.Scanner;

public class Ejem2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String variable = sc.nextLine();
			if (variable.isEmpty()) {
				variable = null; 
			}
			int total = 3 / Integer.parseInt(variable);
		} catch(NullPointerException ex1) {
			System.out.println("No se puede dividir por un valor nulo.");
			int total = 0;
		} catch(NumberFormatException ex2) {
			System.out.println("El valor de variable no es un número.");
			int total = 0;
		} catch(Exception ex3){
			System.out.println("Error inesperado: "+ex3.getMessage());
			int total = 0;
		}
	}

}
