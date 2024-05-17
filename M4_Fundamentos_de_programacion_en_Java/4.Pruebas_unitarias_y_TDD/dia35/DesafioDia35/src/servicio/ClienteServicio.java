package servicio;

import java.util.ArrayList;
import java.util.List;

import modelo.CategoriaEnum;
import modelo.Cliente;
import utilidades.Utilidad;

public class ClienteServicio {
	private List<Cliente> listaClientes;

	public ClienteServicio() {
		this.listaClientes = new ArrayList<>();
	}

	// mostrar la lista
	public void retornolistarClientes() {
		// vemos si esta vacia o no
		if (listaClientes != null) {
			for (Cliente cliente : listaClientes) {
				System.out.println("---------------Datos del cliente--------------");
				System.out.println("RUN de Cliente: " + cliente.getRunCliente());
				System.out.println("Nombre del Cliente: " + cliente.getNombreCliente());
				System.out.println("Apellido del Cliente: " + cliente.getApellidoCliente());
				System.out.println("Años como Cliente: " + cliente.getAniosClientes());
				System.out.println("Caregoria del Cliente:: " + cliente.getNombreCategoria());
				System.out.println("-------------------------------------");
			}
		} else {
			System.out.println("No se ha podido listar a los clientes, aún no carga datos");
		}
		Utilidad.timeToWait();
	}

	// agregar clientes a la lista
	public void agregarCliente(String nuevoRut,String nuevoNombre, String nuevoApellido, String nuevoAnio) {
		Cliente nuevoCliente = new Cliente(nuevoRut,nuevoNombre,nuevoApellido,nuevoAnio);
		if (listaClientes.contains(nuevoCliente)) {
			System.out.println("El cliente ya existe, no se agrego");
		} else {
			listaClientes.add(nuevoCliente);
			System.out.println("El cliente agregado");
		}
	}

	// editar cliente
	public void editarCliente(String Rut) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getRunCliente().equals(Rut)) {
				if (cliente.getNombreCategoria().equals(CategoriaEnum.Activo)) {
					cliente.setNombreCategoria(CategoriaEnum.Inactivo);
				}else {
					cliente.setNombreCategoria(CategoriaEnum.Activo);
				}

			}
		}
	}
	public void editarCliente(String Rut,int posicion,String nuevoDato) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getRunCliente().equals(Rut)) {
				switch(posicion) {
					case 1:
						cliente.setRunCliente(nuevoDato);
						break;
					case 2:
						cliente.setNombreCliente(nuevoDato);
						break;
					case 3:
						cliente.setApellidoCliente(nuevoDato);
						break;
					case 4:
						cliente.setAniosClientes(nuevoDato);
						break;
					default:
						System.out.println("Opion no valida");
						break;
				}
			}
		}
	}
	// getters and setters
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> clienteServicio) {
		this.listaClientes = clienteServicio;
	}
}
