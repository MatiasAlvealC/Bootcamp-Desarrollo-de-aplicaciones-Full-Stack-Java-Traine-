package cl.desafiolatam.utiles;

public class UtilesGeneral {
	public int getFactorial(int num) {
		int factorial=1;
		if (num==0) {
			factorial=0;
		} else {
			int cont=1;
			while (cont<=num) {
				factorial*=cont;
				cont++;
			}
		}	
		// retorna el numero factorial
		return factorial;
	}
	public String getParImpar(int num) {
		String resolucion;
		if (num%2==0) {
			resolucion= "Par";
		} else {
			resolucion= "Impar";
		}
		// retorna si es par o impar
		return resolucion;
	}
}
