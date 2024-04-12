package Arreglos;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("La suma es: "+suma());
	}
	// creamos un método llama suma que retorne un numero entero de la suma
	public static int suma() {
		int suma =0;
		int[] arreglo = {1,5,11,33,4,6,7,44,6,1,-1};
		for (int x = 0; x < arreglo.length; x++) {
			if (arreglo[x] >= 1 && arreglo[x]<=5) {
				suma = suma + arreglo[x];
			}
		}
		return suma;
	}

}