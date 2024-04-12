package Arreglos;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio2 {

	public static void main(String[] args) {
		ordenar();
	}
	public static void ordenar() {
ArrayList<String> platos = new ArrayList<String>();
		
		platos.add("Cazuela");
		platos.add("Porotos");
		platos.add("Pastel de Choclo");
		platos.add("Ají de gallina");
		platos.add("Ceviche");
		platos.add("Arepas");
		Collections.sort(platos,String.CASE_INSENSITIVE_ORDER);
		System.out.println("La lista de comida es "+platos);
	}

}
