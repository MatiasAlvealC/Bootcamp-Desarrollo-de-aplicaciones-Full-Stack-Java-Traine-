package TrabajarConDirectorios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {
		String nombreArchivo = "C:\\Users\\matia\\eclipse-workspace\\Dia17\\src\\data2.txt";
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
	}

}
