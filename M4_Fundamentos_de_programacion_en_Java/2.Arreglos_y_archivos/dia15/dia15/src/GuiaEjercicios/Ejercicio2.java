package GuiaEjercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un nuevo elemento a la casa: ");
		String elemento = sc.nextLine();
		
		agregaElemento(elemento);
		
	}
	
	public static void agregaElemento(String elemento) {
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("mesa");
		elementos.add("Refrigerador");
		elementos.add("Cocina");
		elementos.add("lavadora");
		
		if (elementos.contains(elemento)){
			System.out.printf("Elemento ya existe \n");			
		}
		else {
			elementos.add(elemento);
			System.out.printf("El elemento %s fue agregado\n", elemento);
		}
		System.out.println(elementos);
	}
}
