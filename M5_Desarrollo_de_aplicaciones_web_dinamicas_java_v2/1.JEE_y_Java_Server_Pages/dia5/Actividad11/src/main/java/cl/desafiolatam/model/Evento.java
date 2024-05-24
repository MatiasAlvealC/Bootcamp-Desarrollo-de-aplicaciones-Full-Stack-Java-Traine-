package cl.desafiolatam.model;

/**
 * --------------------------------------------------------------------------------------------
 * Clase Evento
 * 
 * @author: Autor <autor@desafiolatam.com>
 * @version: 23/08/2022
 */
public class Evento {

	// Atributos de clase
	private int id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private int precio;
	private String lugar;
	private String mapa;

	// Getters y Setters
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getMapa() {
		return mapa;
	}

	public void setMapa(String mapa) {
		this.mapa = mapa;
	}

}
