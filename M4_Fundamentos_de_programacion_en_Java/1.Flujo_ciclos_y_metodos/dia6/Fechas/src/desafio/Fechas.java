package desafio;
import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// se definen las variables
		String fecha1;
		String fecha2;
		
		// se usa Scanner 
		Scanner sc= new Scanner(System.in);
		
		
		// se le solicita la usuario las fechas
		
		System.out.println("Hoy compararemos dos personas");
		System.out.println("Ingrese la primera fecha como DD/MM/AAAA: ");
		fecha1 = sc.nextLine();
		
		System.out.println("Ingrese la segunda fecha como DD/MM/AAAA: ");
		fecha2 = sc.nextLine();
		
		// Usamos el Interger.parseInt para transformar a entero
		// pero antes extraemos parte de la fecha con substring 
		int dia1 = Integer.parseInt(fecha1.substring(0, 2)); // el dia primera posicion hasta la segunda
        int mes1 = Integer.parseInt(fecha1.substring(3, 5)); // de la cuarta posicion hasta la quinta
        int anio1 = Integer.parseInt(fecha1.substring(6,9)); // de la sexta posicion hasta la novena
		
        int dia2 = Integer.parseInt(fecha2.substring(0, 2)); 
        int mes2 = Integer.parseInt(fecha2.substring(3, 5)); 
        int anio2 = Integer.parseInt(fecha2.substring(6,9)); 
		
        // Calculamos que fecha es mayor
        // partimos comparando los años
        if (anio1 > anio2) {
            System.out.println("La persona 2 es mayor.");
        } 
        else if (anio1 < anio2) {
            System.out.println("La personas 1 es mayor.");
        } 
        // ahora vemos si tiene el mismo año, comparamos los meses
        else {
            if (mes1 > mes2) {
                System.out.println("La persona 2 es mayor.");
            } 
            else if (mes1 < mes2) {
                System.out.println("La persona 1 es mayor.");
            }
            // En el caso que los meses sean igual, y los años tambien, se pasa a comparar los dias
            else {
                if (dia1 > dia2) {
                    System.out.println("La persona 2 es mayor.");
                } 
                else if (dia1 < dia2) {
                    System.out.println("La persona 1 es mayor.");
                } 
                // En el caso que los dias, meses y años sean iguales 
                else {
                    System.out.println("Tienen la misma edad.");
                }
            }
        }

	}

}