package com.desafiolatam.web.MGR.Impl;

import java.util.List;

import com.desafiolatam.web.models.Producto;

public interface ProductoMGR {

	List<Producto> getProductos();

	Producto getProducto(int id);

}
