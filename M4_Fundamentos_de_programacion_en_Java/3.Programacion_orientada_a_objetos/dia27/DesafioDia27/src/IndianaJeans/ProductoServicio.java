package IndianaJeans;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductoServicio {
	private ArrayList<Producto> listaProductos;

	 // Constructor
    public ProductoServicio() {
        this.listaProductos = new ArrayList<>();
    }
	
	// métodos

	public void listaProductos() {
		for (Iterator<Producto> iterator = listaProductos.iterator(); iterator.hasNext();) {
			Producto producto = (Producto) iterator.next();
			System.out.println(producto.toString());
		}	
	}
	
	public void agregarProductos(Producto nuevoProducto) {
		if (listaProductos.contains(nuevoProducto)){
			System.out.printf("Producto ya existe \n");			
		}
		else {
			listaProductos.add(nuevoProducto);
			System.out.printf("El producto %s fue agregado\n", nuevoProducto.getArticulo());
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
