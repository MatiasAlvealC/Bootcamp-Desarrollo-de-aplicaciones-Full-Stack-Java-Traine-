package Desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;


public class Desafio {

	public static void main(String[] args) {
		// ingrese el nombre del directorio o carpeta y del fichero o archivo, 
		// solo los nombres, la extension no es necesario, se creará un txt por defecto
		crearFile("directorio","fichero");
		// para usar este metodo es necesario que ingrese el path del fichero y la palabra a buscar
		buscarTexto("src\\directorio\\fichero.txt","Gato");
	}
			
	public static void crearFile(String nombreCarpeta, String nombreArchivo) {
		// se crea la ArrayList y se le agregan los elementos
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Juan");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Camila");
		lista.add("Daniel");
		lista.add("Camila");
		File carpeta = new File("src\\"+nombreCarpeta);
		if (!carpeta.exists()) {	
			carpeta.mkdirs(); // se crea la carpeta
			File archivo = new File("src\\"+nombreCarpeta+"\\"+nombreArchivo+".txt");
				try {
					archivo.createNewFile(); // se crea el archivo .txt
					// se le agregan los elementos del ArrayList
					FileWriter fileW = new FileWriter(archivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);
					int cont=0;
					for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
						String palabra = (String) iterator.next();
						if (cont<lista.size()-1) { 
							bufferedWriter.write(palabra+"\n");
							cont++;
						}
						else { // asi a la ultima no le agrega el salto de linea
							bufferedWriter.write(palabra);
						}
					}
					bufferedWriter.close();			
					fileW.close();
				} catch (IOException e) {
					System.out.println("Error al crear el archivo "+nombreArchivo+": "+e);
				}			
			}
		else {
			System.out.println("Error al crear directorio");
		}
	}
			
	public static void buscarTexto(String nombreFichero,String texto) {
		try {
			File fichero = new File(nombreFichero);
			if (fichero.exists()) {
				FileReader fr = new FileReader(nombreFichero);
				BufferedReader br = new BufferedReader(fr);
				// vamos leyendo las lineas
				String data = br.readLine();
		        ArrayList<String> lineasTexto = new ArrayList<>();
				
		        while (data != null) {
		        	lineasTexto.add(data); // Agregar la línea al ArrayList
					data = br.readLine();
				}
				br.close();
				fr.close();
				
				// contamos las repeticiones de la palabra
				long cantidadTexto = lineasTexto.stream()
						.filter(x -> x.equals(texto))
						.count();
				System.out.println("cantidad de repeticiones del texto -> "+cantidadTexto);	
			}
			else {
				System.out.print("El fichero ingresado no existe");
			}
		} catch (Exception e) {
			System.out.println("Excepcion leyendo fichero " + nombreFichero + ": " + e);
		
	}
	}
		
}