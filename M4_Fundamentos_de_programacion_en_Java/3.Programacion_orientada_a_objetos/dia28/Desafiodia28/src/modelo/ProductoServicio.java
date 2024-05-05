package modelo;

import java.util.ArrayList;

import utilidades.Utilidad;

public class ProductoServicio {
	ArrayList<Producto> listaProductos;
	
	// constructor
	public ProductoServicio() {
		listaProductos = new ArrayList<>();
	}
	// metodo de mostrar la lista
	public void listarProductos() {
		// vemos si esta vacia o no
		if (listaProductos != null) {
			for (Producto producto : listaProductos) {
				System.out.println("Datos del producto:");
				System.out.println("Nombre articulo: "+producto.getArticulo());
				System.out.println("Código: "+producto.getCodigo());
				System.out.println("Marca: "+producto.getMarca());
				System.out.println("Color: "+producto.getColor());
				System.out.println("Descripción: "+producto.getDescripcion());
				System.out.println("Precio: "+producto.getPrecio());
				System.out.println("Talla: "+producto.getTalla());
				System.out.println("-------------------------------------");
			}
		} else {
			System.out.println("No se ha podido listar a los productos, aún no carga datos");
		}
		Utilidad.timeToWait();
	}
	// agregar producto
	public void agregarProductos(Producto producto) { 
		
		if (listaProductos != null) {
			listaProductos.add(producto);
		} else {
			System.out.println("El Producto al cual usted está agregando viene nulo");
		}
	}
	// editar producto
	public void editarProductos(String codigo,int posicion,String nuevoDato) {
		for (Producto producto : listaProductos) {
			if (producto.getCodigo().equals(codigo)) {
				switch(posicion) {
					case 1:
						producto.setArticulo(nuevoDato);
						break;
					case 2:
						producto.setCodigo(nuevoDato);
						break;
					case 3:
						producto.setColor(nuevoDato);
						break;
					case 4:
						producto.setDescripcion(nuevoDato);
						break;
					case 5:
						producto.setMarca(nuevoDato);
						break;
					case 6:
						producto.setPrecio(nuevoDato);
						break;
					case 7:
						producto.setTalla(nuevoDato);
						break;
					default:
						break;
				}
			} 
		}
	}
	
	// getters and setters
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
}
