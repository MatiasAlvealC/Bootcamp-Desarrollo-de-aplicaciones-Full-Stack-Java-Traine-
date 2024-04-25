package guiado;

import java.util.ArrayList;

public class Botilleria {
	private ArrayList<Cerveza> cervezas;
	private String nombre;
	
	public Botilleria(ArrayList<Cerveza> cervezas, String nombre) {
		this.cervezas = cervezas;
		this.nombre = nombre;
	}
	
	public void mostrarCervezas() {
		for (Cerveza cerveza : cervezas) {
			System.out.println(cerveza.getMarca()+" "+cerveza.getPrecio());
		}
	}

	public ArrayList<Cerveza> getCerveza() {
		return cervezas;
	}

	public void setCerveza(ArrayList<Cerveza> cervezas) {
		this.cervezas = cervezas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
