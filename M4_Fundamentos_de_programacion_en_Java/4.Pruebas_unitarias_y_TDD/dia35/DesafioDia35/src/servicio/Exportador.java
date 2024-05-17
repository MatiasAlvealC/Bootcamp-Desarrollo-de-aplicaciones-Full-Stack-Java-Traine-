package servicio;

import java.util.List;

import modelo.Cliente;


public abstract class Exportador {
	// método abstrato para exportar
	public abstract void exportar(String fileName,List<Cliente> listaClientes);
}
