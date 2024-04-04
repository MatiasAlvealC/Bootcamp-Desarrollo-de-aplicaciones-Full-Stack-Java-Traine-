package metodos;

public class SumaDeNumeros {

	public static void main(String[] args) {
		/*Crea un método llamado imprimirSuma que tome dos
		 * números enteros como parámetros, calcule su suma y 
		 * muestre el resultado. Asegúrate de llamar a este 
		 * método desde el main, pasando dos números de tu elección.*/
		System.out.println(imprimirSuma(5,6));
		
	}
	
	public static long imprimirSuma(long n1,long n2) {
		long resultado;
		resultado = n1 + n2;
		return resultado;
	}

}
