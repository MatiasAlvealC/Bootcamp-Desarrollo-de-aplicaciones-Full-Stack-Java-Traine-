package TrabajarConDirectorios;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio3 {

	public static void main(String[] args) {
		String nombre = "C:\\Users\\matia\\eclipse-workspace\\Dia17\\src\\Data.txt";
		try {
			FileReader fr = new FileReader(nombre);
			BufferedReader br = new BufferedReader(fr);
			String data = br.readLine();
			while(data != null) {//retorna -1 cuando no hay más caracteres por leer
				System.out.println(data); //1,2,3,4,5,6,7,8,9,10
				data = br.readLine();
			}
			br.close();
			fr.close();
		}
		catch (Exception e){
		System.out.println("Excepcion leyendo fichero "+ nombre + ": " + e);
		}
	}

}
