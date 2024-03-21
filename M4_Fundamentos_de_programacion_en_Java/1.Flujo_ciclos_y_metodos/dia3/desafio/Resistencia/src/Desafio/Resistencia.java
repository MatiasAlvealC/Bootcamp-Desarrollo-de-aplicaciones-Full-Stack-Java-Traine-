package Desafio;
import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// definimos las variables
		double R1;
		double R2;
		double R3;
		double RT; // Resistencia total
		
		// se utiliza scanner para solicitar al usuario
		Scanner sc = new Scanner(System.in);
		
		// se solicita al usuario los valores de las resistencias
		System.out.println("Hola, calcularemos la resistencia total");
		do {
			System.out.println("Ingrese resistencia 1: ");
			R1 = sc.nextDouble();
			
			System.out.println("Ingrese resistencia 2: ");
			R2 = sc.nextDouble();
			
			System.out.println("Ingrese resistencia 3: ");
			R3 = sc.nextDouble();
			
			if (R1 <=0) {
				System.out.println("Dato Inválido: Resistencia 1");
			}
			if (R2<=0) {
				System.out.println("Dato Inválido: Resistencia 2");
			}
			if (R3<=0) {
				System.out.println("Dato Inválido: Resistencia 3");
			}
		} while (R1<=0 || R2<=0 || R3<=0);
		
		RT =1/(1/R1 + 1/R2 + 1/R3); 
		
		System.out.println("La resistencia total es de "+RT);
		
	}
}