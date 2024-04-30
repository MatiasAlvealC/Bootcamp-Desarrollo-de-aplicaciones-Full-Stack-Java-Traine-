package abstracciones;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Leon leon = new Leon();
		Tigre tigre = new Tigre();
		
		ArrayList<Animal> listaAnimales = new ArrayList<>();
		ArrayList<Carnivoro> listaCarnivoros = new ArrayList<>();
		
		listaAnimales.add(leon);
		listaAnimales.add(tigre);
		listaCarnivoros.add(leon);
		listaCarnivoros.add(tigre);
		
		System.out.println(listaAnimales);
		System.out.println(listaCarnivoros);
	}

}
