package TrabajarConDirectorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> notas = new ArrayList<Integer>(Arrays.asList(5,9,6,8,4));
		ArrayList<String> alumnos = new
		ArrayList<String>(Arrays.asList("Julia","María","Teresa","Diego","Pedro"));
		String nombreABuscar = sc.nextLine();
		
		int indice = alumnos.indexOf(nombreABuscar);
		if(indice != -1) {
			System.out.printf ("La nota de %s es: %d\n",nombreABuscar,notas.get(indice));
		}
		else {
			System.out.println("Alumno no encontrado");
		}
		

	}

}
