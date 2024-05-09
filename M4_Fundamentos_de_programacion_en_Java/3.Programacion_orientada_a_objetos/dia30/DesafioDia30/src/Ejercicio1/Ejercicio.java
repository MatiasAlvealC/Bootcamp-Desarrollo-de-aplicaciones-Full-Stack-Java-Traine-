package Ejercicio1;

import java.util.ArrayList;

public class Ejercicio {

	public static void main(String[] args) {
		// 1
		ArrayList<String> marcas = new ArrayList<>();
		
		// 2
		marcas.add("Nokia");
		marcas.add("Kodak");
		marcas.add("Atari");
		marcas.add("Alcatel");
		marcas.add("Polaroid");
		marcas.add("BlackBerry");
		marcas.add("Motorola");
		marcas.add("FoxKids");
		marcas.add("Boomerang");
		marcas.add("Qubo");
		System.out.println(marcas);
		
		// 3
		ArrayList<String> marcas2 = new ArrayList();
		marcas2.add("Blockbaster");
		marcas2.add("Carrefour");
		marcas2.add("Jetix");
		
		marcas.addAll(marcas2);

		System.out.println(marcas);
		
		// 4
		marcas.set(marcas.indexOf("Blockbaster"), "Blockbuster");
		System.out.println(marcas);
		
		// 5
		//marcas.remove(11)
		System.out.println(marcas.remove("Carrefour"));
		System.out.println(marcas);
		
		// 6
		ArrayList<String> posiblesMarcas = new ArrayList();
		posiblesMarcas.add("Nickelodeon");
		posiblesMarcas.add("LG");
		posiblesMarcas.add("Sony Ericsson");
		
		marcas.addAll(posiblesMarcas);

		System.out.println(marcas);
		
		// 7
		System.out.println("marcas contiene : "+marcas.size()+" elementos");

	}

}
