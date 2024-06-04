package com.desafiolatam.web.models;

public class Producto {
	private int id;
	private String nombre;
	private float precio;

	// constructores
	public Producto() {
		super();
		this.id = -1;
		this.nombre = "";
		this.precio = 0f;
	}

	public Producto(int id, String nombre, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
