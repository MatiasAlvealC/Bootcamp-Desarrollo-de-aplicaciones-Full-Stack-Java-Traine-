package Desafio;

import java.util.ArrayList;

public class Visitas {

	public static void main(String[] args) {
		ArrayList<Integer> visitas = new ArrayList <Integer>();

		visitas.add(3001);
		visitas.add(1402);
		visitas.add(1304);
		visitas.add(1505);
		
		System.out.println("Para la entrada anterior, el resultado es "+promedio(visitas));
		
	}
	public static double promedio(ArrayList <Integer> arreglo) {
		int visitaSuma=0;
		double prom;
		for (int i =0;i<arreglo.size();i++) {
			visitaSuma+=arreglo.get(i);
		}
		
		return prom=visitaSuma/arreglo.size();
		
	}

}
