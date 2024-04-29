package Desafio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
	private String nombreVenta;
	private String fechaVenta; // Ejemplo "01102020"
	
	// constructor 
	public LibroVenta(String nombreVenta, String fechaVenta) {
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}
	
	// método
	public void guardarVenta(Cliente cliente,Vehiculo vehiculo) {
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
			File archivo = new File("src\\ficheros\\"+nombreVenta+".txt");
			if (!archivo.exists()) {
				try {
					archivo.createNewFile(); // se crea el archivo.txt
					// se le agregan los elementos del ArrayList
					FileWriter fileW = new FileWriter(archivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);
					bufferedWriter.write("Venta:"+nombreVenta+"\n");
					bufferedWriter.write("Patente del vehiculo: "+vehiculo.getPatente()+"\n");
					bufferedWriter.write("Edad cliente: "+cliente.getEdad()+"\n");
					bufferedWriter.write("Fecha venta: "+Integer.parseInt(fechaVenta));
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
		} catch (NumberFormatException e2) {
		    System.out.println("Error al convertir la fecha a un entero: " + e2.getMessage());
		} catch (Exception e3) {
	        System.out.println("Error desconocido: " + e3.getMessage());
	    }
	}
	
	// gettters and setters
	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}	
}
