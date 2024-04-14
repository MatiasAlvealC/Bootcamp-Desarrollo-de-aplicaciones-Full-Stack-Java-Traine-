package directorios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {
		crearFile("carpeta","fichero.txt");
	}
	static void crearFile(String rutaCarpeta,String nombreArchivo) {
		// creamos la clase file para crear el directorio
				File carpeta = new File("src/"+rutaCarpeta);
				// validamos si el directorio existe
				if (!carpeta.exists()) {
					carpeta.mkdir();
				}
				File archivo = new File("src/"+rutaCarpeta+"/"+nombreArchivo);
				try {
					archivo.createNewFile();
					FileWriter fileW = new FileWriter(archivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);
					
					bufferedWriter.write("texto 1");
					bufferedWriter.newLine();
					bufferedWriter.write("texto 2");
					bufferedWriter.newLine();
					bufferedWriter.close();
					 // cierre del método
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	

}
