package com.example.demo.models;

public class Producto {
	
    private Long id;
    private String nombre;
    private double precio;

    public Producto() {}

    public Producto(Long id, String name, double price) {
        this.id = id;
        this.nombre = name;
        this.precio = price;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double price) {
        this.precio = price;
    }
}
