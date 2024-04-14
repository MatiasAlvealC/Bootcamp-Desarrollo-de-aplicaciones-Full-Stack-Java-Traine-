package directorios;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Ejercicio2 {

	public static void main(String[] args) {
		// crear archivos
		crearDirectorio("carpeta");
		File archivo = new File("src/carpeta/texto.txt");
		try {
			FileWriter fileW = new FileWriter(archivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileW);
			bufferedWriter.write("texto");
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	public static void crearDirectorio(String nombre) {
		// creamos la clase file para crear el directorio
		File directorio = new File("src/"+nombre);
		// validamos si el directorio existe
		if (directorio.exists() == false) {
			directorio.mkdir();
		}
	}
	
	

}
