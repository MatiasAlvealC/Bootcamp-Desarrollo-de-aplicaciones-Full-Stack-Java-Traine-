package TrabajarConDirectorios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		String nombre = "C:\\Users\\matia\\eclipse-workspace\\Dia17\\src\\Data.txt";
		FileReader fr = null;
		BufferedReader br = null;
		String data = "";
		ArrayList<String> numerosString;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		try {
			fr = new FileReader(nombre);
			br=new BufferedReader(fr);
			data = br.readLine();
			numerosString = new ArrayList<String>(Arrays.asList(data.split(",")));
			for(String temp : numerosString) {
				numeros.add(Integer.parseInt(temp));
			}
			System.out.println(numeros);
			br.close();
			fr.close();
		}
		catch (Exception e){
		System.out.println("Excepcion leyendo fichero "+ nombre + ": " + e);

	}

}
}