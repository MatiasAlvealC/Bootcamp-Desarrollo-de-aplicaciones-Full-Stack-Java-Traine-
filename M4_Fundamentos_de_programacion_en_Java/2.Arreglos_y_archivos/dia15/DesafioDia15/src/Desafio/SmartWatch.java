package Desafio;

import java.util.ArrayList;

public class SmartWatch {

	private static final int ArrayList = 0;
	public static void main(String[] args) {
		ArrayList<Integer> pasos = new ArrayList <Integer>();

		pasos.add(300);
		pasos.add(405);
		pasos.add(403);
		pasos.add(506);
		pasos.add(100020040);
		pasos.add(45006);
		pasos.add(-1044);
		
		System.out.println("El arreglo filtrado seria: "+clearSteps(pasos));
		System.out.println("El pomedio de los pasos es "+promedio(pasos));
		
	}
	public static ArrayList <Integer> clearSteps(ArrayList <Integer> arreglo) {
		for (int i = 0;i<arreglo.size();i++) {
			if (arreglo.get(i)<200 || arreglo.get(i)>100000) {
				arreglo.remove(i);
			}
		}
		return arreglo;
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
