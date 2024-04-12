package GuiaEjercicios;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300,
				700450, 442300 };
		System.out.println("El promedio de los sueldos es "+promedioSueldo(sueldos));
	}
	
	public static double promedioSueldo(int[] sueldos) {
		int sumaSueldo = 0;
		for (int i =0;i<sueldos.length;i++) {
				if (sueldos[i]>500000) {
					sumaSueldo += sueldos[i];
				}
			}
		double promedio;
		double sumaSueldoDouble=sumaSueldo;
		return promedio = sumaSueldoDouble/sueldos.length;
		}
	}
