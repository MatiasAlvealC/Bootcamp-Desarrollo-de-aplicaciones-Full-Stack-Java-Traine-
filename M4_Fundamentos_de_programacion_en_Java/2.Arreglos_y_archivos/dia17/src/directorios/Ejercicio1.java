package directorios;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Ejercicio1 {

	public static void main(String[] args) {
		//crearDirectorio("directorio");
		crearFichero("prueba","prueba.txt");
	}
	public static void crearDirectorio(String nombre) {
		// creamos la clase file para crear el directorio
		File directorio = new File("src/"+nombre);
		// validamos si el directorio existe
		if (directorio.exists() == false) {
			directorio.mkdir();
		}
	}
	static void crearFichero(String rutaCarpeta,String nombreArchivo) {
		// creamos la clase file para crear el directorio
				File carpeta = new File("src/"+rutaCarpeta);
				// validamos si el directorio existe
				if (!carpeta.exists()) {
					carpeta.mkdir();
					File archivo = new File("src/"+rutaCarpeta+"/"+nombreArchivo);
					try {
						archivo.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
	}

}
