package metodos;

public class MetodoConValorRetorno {

	public static void main(String[] args) {
		/* Diseña un método llamado multiplicar que acepte dos 
		 * números enteros como argumentos, los multiplique y 
		 * devuelva el resultado. Desde el método main, llama a
		 *  multiplicar con dos números, imprime el resultado devuelto.
		 */
		
		System.out.println(multiplicar(5,9));
	}
	
	public static long multiplicar(long n1,long n2) {
		long resultado = n1 * n2;
		return resultado;
	}

}
