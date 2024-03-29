package Ejercicio3;
import java.util.Scanner;
public class SumaImparLimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Sumaremos los numeros impares que haya entre dos numeros\n");
		System.out.printf("Ingrese el limite inferios: ");
		int LimMin = sc.nextInt();
		System.out.printf("\nIngrese el limite superior:");
		int LimMax = sc.nextInt();
		
		int i =LimMin;
		int suma=0; // suma de numeros impares
		do {
			if (i%2 != 0) { // si es impar 
				suma += i;
			}
			i++; // suma un numero al contador general
		} while (i<=LimMax); // mientras la cantidad de impares contados sea menor o igual a n
		System.out.printf("La suma de los impares dentro de los limites es: "+suma);

	}

}
