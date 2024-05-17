package servicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import modelo.Cliente;



public class ArchivoServicio extends Exportador {
	public ClienteServicio cargarDatos(String fileName) {
	 	ClienteServicio listaClientes = new ClienteServicio();
        String linea = "";
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Lee el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Divide la línea en partes usando el separador ","
                String[] partes = linea.split(separador);
                // Crea un nuevo Producto con los datos de la línea y lo agrega a la lista
                listaClientes.agregarCliente(partes[0], partes[1], partes[2], partes[3]);
            }
            System.out.println("Datos cargados correctamente en la lista");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaClientes;
    }
	public void exportar(String fileName, List<Cliente> listaClientes) {
        // Implementación de la exportación en la clase Exportador.
    }
}
