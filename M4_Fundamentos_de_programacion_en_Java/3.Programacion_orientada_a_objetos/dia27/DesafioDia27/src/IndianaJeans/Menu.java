package IndianaJeans;

import java.util.Scanner;

public class Menu {
	// constructor
    public Menu() {
       
    }
    public void mostrarMenu() {
        int opcion;
        ProductoServicio productoServicio = new ProductoServicio();
        do {
            System.out.println("Menú:");
            System.out.println("1. Listar Producto");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Exportar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt(); 
            sc.nextLine(); // Consumir el salto de línea
            
            if (opcion == 1) {
                	Utilidad.limpiarPantalla();
                	Utilidad.esperar(1);
                    ((ProductoServicio) productoServicio).listaProductos();
            } else if (opcion == 2) {
            		Utilidad.limpiarPantalla();
            		Utilidad.esperar(2);
            		System.out.println("Crear Producto");
                    Producto p = new Producto();
                    
                    System.out.println("Ingresar nombre articulo:");
                    String nombreProducto = sc.nextLine();
                    p.setArticulo(nombreProducto);
                    
                    System.out.println("Ingresa precio:");
                    String precioProducto = sc.nextLine();
                    p.setPrecio(precioProducto);
                    
                    System.out.println("Ingresa descripción:");
                    String descripcionProducto = sc.nextLine();
                    p.setDescripcion(descripcionProducto);
                    
                    System.out.println("Ingresar código:");
                    String codigoProducto = sc.nextLine();
                    p.setCodigo(codigoProducto);
                    
                    System.out.println("Ingresa talla:");
                    String tallaProducto = sc.nextLine();
                    p.setTalla(tallaProducto);
                   
                    System.out.println("Ingresa marca:");
                    String marcaProducto = sc.nextLine();
                    p.setMarca(marcaProducto);
                    
                    System.out.println("Ingresa color:");
                    String colorProducto = sc.nextLine();
   
                   
                	Utilidad.esperar(2);
                    productoServicio.agregarProductos(p);
            }else if (opcion ==3) {
            		Utilidad.limpiarPantalla();
            		Utilidad.esperar(10);
					ExportadorTxt exportadorTxt = new ExportadorTxt();
					exportadorTxt.exportar(productoServicio.getListaProductos());
            }else if (opcion == 4) {
                    System.out.println("Saliendo del programa...");
                    break;
            }else {
            	System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
