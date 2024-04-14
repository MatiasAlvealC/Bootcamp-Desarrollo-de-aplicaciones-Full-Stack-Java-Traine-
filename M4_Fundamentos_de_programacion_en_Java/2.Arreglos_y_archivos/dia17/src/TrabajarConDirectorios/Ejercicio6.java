package TrabajarConDirectorios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ejercicio6 {

	public static void main(String[] args) {
		String nombre = "data2.txt";
		ArrayList<Integer> numeros = readFile("C:\\Users\\matia\\eclipse-workspace\\Dia17\\src\\data2.txt");
		int i;
		for(i=0;i<numeros.size();i++) {
		if(numeros.get(i) >20) {
		numeros.set(i, 20);
		}
		}
		System.out.println(numeros);
	}
	
	public static ArrayList<Integer> readFile(String nombre) {
		String nombreArchivo = nombre;
		FileReader fr = null;
		BufferedReader br = null;
		String data = "";
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		try {
			fr = new FileReader(nombreArchivo);
			br=new BufferedReader(fr);
			data = br.readLine();
			while (data != null) {
				numeros.add(Integer.parseInt(data));
				data = br.readLine();
			}
			br.close();
			fr.close();
		}
		catch (Exception e){
		System.out.println("Excepcion leyendo fichero "+ nombreArchivo + ": " + e);
		}
		System.out.println(numeros); //[21, 10, 6, 9, 11, 0, 2, 3, 50]
		return numeros;
	}
	void writeFile(String nombreArchivo, ArrayList<Integer> numeros) {
		FileWriter archivo = null;
		PrintWriter pw = null;
		try {
			archivo = new FileWriter(nombreArchivo);
			pw = new PrintWriter(archivo);
			int i;
			for(i = 0 ; i<numeros.size() ; i++) {
				pw.println(numeros.get(i));
			}
			pw.close();
			archivo.close();
		}
		catch(Exception e){
		System.out.println("Fichero " + nombreArchivo + "no se pudo crear" + e);
		}
		}


}
