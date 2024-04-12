package Arreglos;
import java.util.ArrayList;
public class Ejercicio6 {

	public static void main(String[] args) {
		// Crear arreglo nombres
		ArrayList<String> nombres = new ArrayList<String> ();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Luis");
		nombres.remove(1); // "Pedro"
		System.out.println(nombres);
	}

}
