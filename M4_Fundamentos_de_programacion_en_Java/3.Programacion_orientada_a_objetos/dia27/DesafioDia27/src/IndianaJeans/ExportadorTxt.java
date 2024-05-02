package IndianaJeans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExportadorTxt extends Exportador{
// Implementación del método exportar para exportar a un archivo de texto
    
    public void exportar(ArrayList<Producto> listaProductos) {
        // Aquí va la lógica para exportar a un archivo de texto
    	try {
			// creacion del directorio
			File carpeta = new File("src\\ficheros");
			if (!carpeta.exists()) {	
				carpeta.mkdirs(); // se crea el directorio 
				System.out.println("Directorio creado");
			} else {
				System.out.println("El directorio ya existe");
			}
			// creacion de archivo
			File archivo = new File("src\\ficheros\\listaProductos.txt");
			if (!archivo.exists()) {
				try {
					archivo.createNewFile(); // se crea el archivo.txt
					// se le agregan los elementos del ArrayList
					FileWriter fileW = new FileWriter(archivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);
					bufferedWriter.write("Productos de la tienda “Indiana Jeans” \n");	
					for (Iterator<Producto> iterator = listaProductos.iterator(); iterator.hasNext();) {
						Producto producto = (Producto) iterator.next();
						bufferedWriter.write(producto.toString()+"\n");						
					}	
					bufferedWriter.close();			
					fileW.close();
					System.out.println("Archivo creado");
				}  catch (IOException e1) {
				    System.out.println("Error de entrada/salida al crear el archivo: " + e1.getMessage());
				}
			} else if (archivo.exists()) {
				System.out.println("Error al crear el archivo, ya existe un archivo con este nombre");
			}
			else {
				System.out.println("Error al crear el archivo");
			}
		} catch (Exception e2) {
	        System.out.println("Error desconocido: " + e2.getMessage());
	    }
    }


}
