package modelo;

public class Operaciones {
	
	// suma
	public int getSuma(int num1, int num2) {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}
	
	// resta
	public int getResta(int num1, int num2) {
		int resultado;
		resultado = num1 - num2;
		return resultado;
	}
	
	// multiplicacion
	public int getMultiplicacion(int num1, int num2) {
		int resultado;
		resultado = num1 * num2;
		return resultado;
	}
	
	// división
	public double getDivision(int num1, int num2) {
		double resultado;
		resultado = (double) num1 / num2;
		return resultado;
	}
	
	// ordenar
	public int[] getOrdenar(int num1, int num2) {
        int[] resultado = new int[2];
        if (num1 > num2) {
            resultado[0] = num1;
            resultado[1] = num2;
        } else {
            resultado[0] = num2;
            resultado[1] = num1;
        }
        return resultado;
    }
	// par o impar
	
	public String getParImpar(int num1) {
        String resolucion;
        // usando operador ternario
        // es la primera vez que lo uso puede que salga mal 
        resolucion = (num1 % 2 == 0) ? "Par" : "Impar";
        return resolucion;
    }
}
