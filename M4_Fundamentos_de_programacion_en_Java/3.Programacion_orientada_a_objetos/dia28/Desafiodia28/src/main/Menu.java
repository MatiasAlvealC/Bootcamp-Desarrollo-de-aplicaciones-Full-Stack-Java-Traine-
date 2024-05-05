package main;

import java.util.Scanner;

import importador.ArchivoServicio;
import modelo.Producto;
import modelo.ProductoServicio;
import utilidades.Utilidad;

public class Menu {
	ProductoServicio listaProductos = new ProductoServicio();
	ArchivoServicio archivo= new ArchivoServicio();
	Scanner sc = new Scanner(System.in);
	String fileName;
	// constructor
    public Menu() {
       
    }
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Listar Producto");
            System.out.println("2. Editar Producto");
            System.out.println("3. Importar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
        
            opcion = sc.nextInt(); 
            sc.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
            	case 1:
            		Utilidad.stopAndContinue();
            		listaProductos.listarProductos();
            		break;
            	case 2:
            		Utilidad.stopAndContinue();
            		editarProducto();
            		break;
            	case 3:
            		Utilidad.stopAndContinue();
            		importarDatos(); //"C:\\Users\\matia\\eclipse-workspace\\Desafiodia28\\src\\archivo\\ProductosImportados.csv"
            		break;
            	case 4:
            		salir();
            		break;
            	default:
					System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }
    
    private void editarProducto() {
    	System.out.println("Editar Producto");
    	System.out.println("Ingrese el número 1 para editar los datos ingresados del Producto");
    	int num= sc.nextInt();
    	if (num == 1 ) {
    		System.out.println("Ingrese código del producto:");
    		String cod = sc.next();
    		seleccionadorProducto(cod);
    	} else {
    		System.out.println("¿Realmente quiere editar?");
    	}
    }
    
    private void seleccionadorProducto(String cod) {
		boolean productoEncontrado = false;
    	for (Producto producto : listaProductos.getListaProductos()) {
			if (producto.getCodigo().equals(cod)) {
				System.out.println("1.-El nombre del articulo actual es: "+producto.getArticulo());
				System.out.println("2.-El código del producto:"+producto.getCodigo());
				System.out.println("3.-El color del producto: "+producto.getColor());
				System.out.println("4.-La descripción del producto: "+producto.getDescripcion());
				System.out.println("5.-La marca del producto:"+producto.getMarca());
				System.out.println("6.-El precio del producto: "+producto.getPrecio());
				System.out.println("7.-La talla del producto: "+producto.getTalla());
				System.out.println("Ingrese la opción a editar de los datos del producto:");
	        	int op = sc.nextInt();
	        	 switch (op) {
	        	 	case 1:
	        	 		System.out.println("Ingrese el nuevo nombre del producto: ");
	        	 		break;
	        	 	case 2:
	        	 		System.out.println("Ingrese el nuevo código del producto: ");
	        	 		break;
	        	 	case 3:
	        	 		System.out.println("Ingrese el nuevo color del producto: ");
	        	 		break;
	        	 	case 4:
	        	 		System.out.println("Ingrese la nueva descripción del producto: ");
	        	 		break;
	        	 	case 5:
	        	 		System.out.println("Ingrese la nueva marca del producto: ");
	        	 		break;
	        	 	case 6:
	        	 		System.out.println("Ingrese el nuevo precio del producto: ");
	        	 		break;
	        	 	case 7:
	        	 		System.out.println("Ingrese la nueva talla del producto: ");
	        	 		break;
	        	 	default:
						System.out.println("Opción no válida");
	        	 }
	        	 String nuevoDato = sc.next();
	        	 listaProductos.editarProductos(cod, op, nuevoDato);
	        	 productoEncontrado = true; // Se encontró el producto
		         break;
			}
		}
		// Si no se encontró el producto, imprimir el mensaje
	    if (!productoEncontrado) {
	        System.out.println("No se encontro el producto de código " + cod);
	    }
    }
    private void importarDatos() {
    	System.out.println("Cargar Datos");
    	System.out.println("Ingrese la ruta en donde se encuentra el archivo con su nombre: ");
    	fileName = sc.next(); //"C:\\Users\\matia\\eclipse-workspace\\Desafiodia28\\src\\archivo\\ProductosImportados.csv"
    	listaProductos = archivo.cargarDatos(fileName);
    }
    private void salir() {
		System.out.println("Abandonando el sistema de clientes...");
		Utilidad.timeToWait();
		System.out.println("Acaba de salir del sistema");
		Utilidad.stopAndContinue();
		System.exit(0);
    }
}

