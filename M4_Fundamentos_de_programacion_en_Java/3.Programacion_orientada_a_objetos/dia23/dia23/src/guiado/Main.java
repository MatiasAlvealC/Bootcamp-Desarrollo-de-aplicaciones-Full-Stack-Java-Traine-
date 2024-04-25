package guiado;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cerveza torobayo = new Cerveza("rubia","kursman",3500);
		Cerveza calafate= new Cerveza("rubia","kurshman",3500);
		Cerveza cristal = new Cerveza("morena","cristal",3500);
		
		ArrayList<Cerveza> cervezas = new ArrayList<>();
		cervezas.add(torobayo);
		cervezas.add(calafate);
		cervezas.add(cristal);

		Botilleria bar = new Botilleria(cervezas,"nombre123");
		
		System.out.println(bar.getNombre());
		bar.mostrarCervezas();
	}

}
