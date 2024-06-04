package com.desafiolatam.web.MGR.Impl;

import java.util.ArrayList;
import java.util.List;
import com.desafiolatam.web.models.Producto;

public class ProductoMGRImpl implements ProductoMGR {
	@Override
	public List<Producto> getProductos() {
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto(1, "Teclado", 3500f));
		productos.add(new Producto(2, "Mouse", 2000f));
		productos.add(new Producto(3, "Monitor", 120000f));
		productos.add(new Producto(4, "WebCam", 25000f));
		return productos;
	}

	@Override
	public Producto getProducto(int id) {
		Producto producto = null;
		switch (id) {
		case 1:
			producto = new Producto(1, "Teclado", 3500f);
			break;
		case 2:
			producto = new Producto(2, "Mouse", 2000f);
			break;
		case 3:
			producto = new Producto(3, "Monitor", 120000f);
			break;
		case 4:
			producto = new Producto(4, "WebCam", 25000f);
			break;
		}
		return producto;
	}
}