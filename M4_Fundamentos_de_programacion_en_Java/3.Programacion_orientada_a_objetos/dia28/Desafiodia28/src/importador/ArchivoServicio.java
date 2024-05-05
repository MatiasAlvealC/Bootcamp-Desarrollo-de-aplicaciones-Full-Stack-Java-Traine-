package importador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Producto;
import modelo.ProductoServicio;

public class ArchivoServicio {
	public ArchivoServicio() {}
	 public ProductoServicio cargarDatos(String nombreArchivo) {
		 	ProductoServicio listaProductos = new ProductoServicio();
	        String linea = "";
	        String separador = ",";

	        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
	            // Lee el archivo línea por línea
	            while ((linea = br.readLine()) != null) {
	                // Divide la línea en partes usando el separador ","
	                String[] partes = linea.split(separador);
	                // Crea un nuevo Producto con los datos de la línea y lo agrega a la lista
	                Producto producto = new Producto(partes[0], partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
	                listaProductos.agregarProductos(producto);
	                System.out.println(producto.toString());
	            }
	            System.out.println("Datos cargados correctamente en la lista");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return listaProductos;
	    }
}
