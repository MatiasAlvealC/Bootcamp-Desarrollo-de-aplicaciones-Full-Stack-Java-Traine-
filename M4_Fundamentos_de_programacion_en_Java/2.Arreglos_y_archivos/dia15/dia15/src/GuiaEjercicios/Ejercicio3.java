package GuiaEjercicios;

import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Float> notas = new ArrayList<Float>();
		notas.add((float) 4.7);
		notas.add((float) 2.2);
		notas.add((float) 5.4);
		notas.add((float) 6.9);
		notas.add((float) 4.4);
		notas.add((float) 2.6);
		

		notaMinMax(notas);

	}
	public static void notaMinMax(ArrayList<Float>arreglo) {
		float min = arreglo.get(0); // Obtenemos el primer elemento como mínimo inicial
        float max = arreglo.get(0); // Obtenemos el primer elemento como máximo inicial
        for (float nota : arreglo) {
            if (nota < min) {
                min = nota;
            }
            if (nota > max) {
                max = nota;
            }
        }
        System.out.println("El valor minimo es " + min);
        System.out.println("El valor maximo es " + max);
	}

}
