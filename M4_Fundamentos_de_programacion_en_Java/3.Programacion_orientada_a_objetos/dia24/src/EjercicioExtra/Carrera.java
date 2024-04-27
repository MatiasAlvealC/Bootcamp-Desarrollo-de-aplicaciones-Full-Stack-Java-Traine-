package EjercicioExtra;

public class Carrera {
	private String nombre;
	private int duracion;
	private String tipo;
	
	public Carrera(String nombre, int duracion, String tipo) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.tipo = tipo;
	}

	
	// GETTERS  and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
