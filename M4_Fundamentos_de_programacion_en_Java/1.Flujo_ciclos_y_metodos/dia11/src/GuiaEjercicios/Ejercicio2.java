package GuiaEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Se declaran las variables a utilizas
				// El número que ingrese el usuario debe ser float
				float numero = 0f;
				float resultado = 0;
				// Variable tipo String, ya que puede ser un operador o un número
				String ingreso = null;
				// Variable que guardará el código ascii de cada ingreso del usuario
				int ascii = 0;
				/* Se crea variables contador, para identificar si es el primer ingreso
				 * de usuario, el cual debe ser un número, y luego un operador, número
				 * así sucesivamente. Si contaador es cero es inicio y debe ser un 
				 * número. Si es impar, debe ser un operador +,-,= */
				 int contador = 0;
				 Scanner sc = new Scanner (System.in); // se crea objeto Scanner
				 
				 do {
					// Si contador es par el usuario debe ingresar un número, de lo contrario debe ingresar un operador
					 if ((contador %2) == 0) {
						 System.out.println("Ingrese un número: ");
					 }
					 else {
						 System.out.println("Ingrese un operador (+, -,*, /, =): ");
						 contador++;
					 }
					 
					 // se lee por patalla el ingreso del usuario, operador o número
					 ingreso = sc.next();
					 // Codigo ascii para opreadores 
					 /* + --> 43, * - --> 45, * * = --> 42 , * --> 47 , * = --> 61 */
					 ascii = (int) ingreso.charAt(0);
					 /* Si el programa inicio, es decir, el contador está en cero y el usuario 
					  * no ingreso un operador  (+, -, =) */
					 if (contador == 0 && ascii != 43 && ascii != 45 && ascii != 42 && ascii != 47 && ascii != 61) {
						 /* Se hace un cast de ingreso (String) a float. Todas las clases tienen un parse,
						 Integer.parseInteger, * Double.parseDouble * etc. Se hace de esta manera, porque un String no se
						 puede transformar en un número, sin embargo si el String no es un número, el programa dará un
						 error. */
						 numero = Float.parseFloat(ingreso); //Se asigna a resultado el primer numero ingresado
						 resultado = numero;
						 contador++;
					 }
					 else {
						 // De lo contario, es el segundo ingreso de usuario 
						 // suma
						 if (ascii == 43) {
							 System.out.println("Ingrese un número: ");
							 ingreso = sc.next(); // Debiese ser un nuemro o si no error
							 numero = Float.parseFloat(ingreso);
							 resultado = resultado + numero;
							 contador++;
						 }
						 // resta
						 if(ascii == 45) {
							 System.out.println("Ingrese un número: ");
							 ingreso = sc.next(); //Debiese ser un número o si no error
							 numero = Float.parseFloat(ingreso);
							 resultado = resultado - numero;
							 contador++;
							 }
						 // multiplicacion
						 if(ascii == 42) {
							 System.out.println("Ingrese un número: ");
							 ingreso = sc.next(); //Debiese ser un número o si no error
							 numero = Float.parseFloat(ingreso);
							 resultado = resultado * numero;
							 contador++;
							 }
						 // division
						 if(ascii == 47) {
							 System.out.println("Ingrese un número: ");
							 ingreso = sc.next(); //Debiese ser un número o si no error
							 numero = Float.parseFloat(ingreso);
							 resultado = resultado / numero;
							 contador++;
							 }
						 
					 }
				 } while((int)ingreso.charAt(0) !=61);
				 System.out.printf("El Resultado es: %f", resultado);
	}

}
