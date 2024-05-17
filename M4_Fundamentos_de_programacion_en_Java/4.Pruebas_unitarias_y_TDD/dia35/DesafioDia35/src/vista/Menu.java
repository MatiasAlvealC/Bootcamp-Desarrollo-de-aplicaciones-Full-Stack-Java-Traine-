package vista;

import java.util.Scanner;

import modelo.CategoriaEnum;
import modelo.Cliente;
import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;
import utilidades.Utilidad;


public class Menu {
	ClienteServicio clienteServicio = new ClienteServicio();
	ArchivoServicio archivo = new ArchivoServicio();
	ExportadorCsv exportadorCsv = new ExportadorCsv();
	ExportadorTxt exportardorTxt = new ExportadorTxt();
	String fileName = "Clientes"; // exportar archivo
	String fileName1 = "DBClientes.csv"; // importar archivo
 	Scanner sc = new Scanner(System.in);



 	public Menu() {}

 	public void iniciarMenu() {
        do {
            System.out.println("Menú:");
            System.out.println("1. Listar Cliente");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Cargar Datos");
            System.out.println("5. Exportar Datos");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
            	case 1:
            		Utilidad.stopAndContinue();
            		listarCliente();
            		break;
            	case 2:
            		Utilidad.stopAndContinue();
            		agregarCliente();
            		break;
            	case 3:
            		Utilidad.stopAndContinue();
            		editarCliente();
            		break;
            	case 4:
            		Utilidad.stopAndContinue();
            		importarDatos(); //"C:\\Users\\matia\\Desktop\\"
            		break;
            	case 5:
            		Utilidad.stopAndContinue();
            		exportarDatos(); // C:\Users\matia\eclipse-workspace\DesafioDia35\src\
            		break;
            	case 6:
            		terminarPrograma();
            		break;
            	default:
					System.out.println("Opción no válida");
            }
        } while (true);
 	}

 	public void listarCliente() {
 		clienteServicio.retornolistarClientes();
 	}

 	public void agregarCliente() {
 		System.out.println("-------------------crear Cliente------------");
 		System.out.println("Ingresa RUN del Cliente: ");
 		String rut = sc.nextLine();
 		System.out.println("Ingresa Nombre del Cliente: ");
 		String nombre = sc.nextLine();
 		System.out.println("Ingresa Apellido del Cliente");
 		String apellido = sc.nextLine();
 		System.out.println("Ingresa años como Cliente");
 		String anio = sc.nextLine();
 		clienteServicio.agregarCliente(rut, nombre, apellido, anio);
 		System.out.println("--------------------------------------------");
 	}

 	public void editarCliente() {
 		System.out.println("------------------Editar Cliente------------");
 		System.out.println("Seleccione qué desea hacer:");
 		System.out.println("1.- Cambiar el estado del Cliente");
 		System.out.println("2.- Editar los datos ingresados del cliente");
 		System.out.println("Ingrese opción: ");
 		int opcion0 = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
 		System.out.println("--------------------------------------------");
 		System.out.println("Ingrese RUN del cliente a editar: ");
 		String rut = sc.nextLine();
 		for (Cliente cliente: clienteServicio.getListaClientes()) {
				if (cliente.getRunCliente().equals(rut)) {
					switch (opcion0) {
		 			case 1:
		 				System.out.println("--------Actualizando estado del cliente-----");
		 				System.out.println("El estado actual es: "+cliente.getNombreCategoria());
		 				if (cliente.getNombreCategoria().equals(CategoriaEnum.Activo)) {
		 					System.out.println("1.- Si desea cambiar el estado del cliente a Inactivo");
		 				}
		 				else {
		 					System.out.println("1.- Si desea cambiar el estado del cliente a Activo");
		 				}
		 		 		System.out.println("2.- Si desea mantener el estado del cliente "+cliente.getNombreCategoria());
		 		 		System.out.println("Ingrese opción: ");
		 		 		int opcion2 = sc.nextInt();
		 		 	    sc.nextLine(); // Consumir el salto de línea
		 		 		if (opcion2 == 1) {
		 		 			clienteServicio.editarCliente(rut);
		 		 		}
		 		 		System.out.println("--------------------------------------------");
		 		 		break;
		 			case 2:
		 				System.out.println("-------Actualizando datos del cliente-------");
	 					System.out.println("1.- El RUN del Cliente es:"+cliente.getRunCliente());
	 					System.out.println("2.- El nombre del Cliente es: "+cliente.getNombreCliente());
	 					System.out.println("3.- El apellido del cliente es: "+cliente.getApellidoCliente());
	 					System.out.println("4.- Los años como cliente son: "+cliente.getAniosClientes());
	 					System.out.println("--------------------------------------------");
	 					System.out.println("Ingrese opcion a editar de los datos del cliente: ");
	 					int opcion3 = sc.nextInt();
		 		 	    sc.nextLine(); // Consumir el salto de línea
	 					System.out.println("--------------------------------------------");
	 					switch (opcion3) {
	 						case 1:
	 							System.out.println("Ingrese nuevo RUN del cliente: ");
	 							break;
	 						case 2:
	 							System.out.println("Ingrese nuevo nombre del cliente: ");
	 							break;
	 						case 3:
	 							System.out.println("Ingrese nuevo apellido del cliente: ");
	 							break;
	 						case 4:
	 							System.out.println("Ingrese nuevo años del cliente: ");
	 							break;
	 						default:
	 							System.out.println("Opcion invalida");
	 							break;
	 					}
	 					String nuevoDato = sc.next();
	 					clienteServicio.editarCliente(rut, opcion3, nuevoDato);
	 					System.out.println("--------------------------------------------");
	 					System.out.println("Datos cambiados con éxito ");
		 				System.out.println("--------------------------------------------");
						break;
		 			default:
		 				System.out.println("Opcion no valida");
						break;
		 		}
				}
			}
 	}
 	public void importarDatos() {
			System.out.println("--------Cargar Datos en Windows---------");
			System.out.println("Ingresa la ruta en donde se encuentra el archivo DBClientes.csv: ");
			String ruta = sc.next();
			System.out.println("--------------------------------------------");
			fileName1 = ruta+fileName1;
			clienteServicio = (archivo.cargarDatos(fileName1));
 	}

 	public void exportarDatos() {
 		System.out.println("--------------Exportar Datos----------------");
		System.out.println("Seleccione el formato a exportar");
		System.out.println("1.-Formato csv");
		System.out.println("2.-Formato txt");
		int opcion = sc.nextInt();
		System.out.println("Ingrese una opción prar exportar: ");
		System.out.println("--------------------------------------------");

		switch (opcion) {
			case 1:
		 		System.out.println("----------Exportar Datos en Windows---------");
				System.out.println("Ingresa la ruta en donde desea exportar el archivo clientes.csv: ");
				String ruta1 = sc.next();
				System.out.println("--------------------------------------------");
				fileName = ruta1+fileName;
				exportadorCsv.exportar(fileName,clienteServicio.getListaClientes());
				break;
			case 2:
				System.out.println("----------Exportar Datos en Windows---------");
				System.out.println("Ingresa la ruta en donde desea exportar el archivo clientes.txt: ");
				String ruta2 = sc.next();
				System.out.println("--------------------------------------------");
				fileName = ruta2+fileName;
				exportardorTxt.exportar(fileName,clienteServicio.getListaClientes());
				break;
			default:
				System.out.println("opcion invalida");
				break;
		}
 	}
    private void terminarPrograma() {
		System.out.println("Abandonando el sistema de clientes...");
		Utilidad.timeToWait();
		System.out.println("Acaba de salir del sistema");
		Utilidad.stopAndContinue();
		System.exit(0);
    }
}
