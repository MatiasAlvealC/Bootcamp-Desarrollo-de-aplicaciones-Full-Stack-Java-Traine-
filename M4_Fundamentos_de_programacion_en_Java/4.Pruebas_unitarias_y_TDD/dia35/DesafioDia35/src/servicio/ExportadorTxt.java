package servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import modelo.Cliente;

public class ExportadorTxt extends Exportador {
	@Override
	public void exportar(String fileName,List<Cliente> listaClientes) {
	        // Aquí va la lógica para exportar a un archivo de texto
	    	try {
				// creacion de archivo
				File archivo = new File(fileName+".txt");
				if (!archivo.exists()) {
					try {
						archivo.createNewFile(); // se crea el archivo.txt
						// se le agregan los elementos del ArrayList
						FileWriter fileW = new FileWriter(archivo);
						BufferedWriter bufferedWriter = new BufferedWriter(fileW);
						for (Iterator<Cliente> iterator = listaClientes.iterator(); iterator.hasNext();) {
							Cliente cliente = iterator.next();
							bufferedWriter.write(cliente.getRunCliente() + "," +
		                               cliente.getNombreCliente() + "," +
		                               cliente.getApellidoCliente() + "," +
		                               cliente.getAniosClientes() + "," +
		                               cliente.getNombreCategoria()+"\n");
						}
						bufferedWriter.close();
						fileW.close();
						System.out.println("Datos de clientes exportados correctamente en formato txt");
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
