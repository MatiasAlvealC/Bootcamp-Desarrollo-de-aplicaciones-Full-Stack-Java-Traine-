package directorios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Lectura de archivo
		File archivo = new File("src/carpeta/texto.txt");
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader (fr);
			br.lines().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
