package EjercicioExtra;

public class Estudiante {
	private String nombre;
	private int edad;
	private Carrera carrera;
	private int numeroMatricula;
	private double promedio;
	private boolean activo;
	
	// constructores
	public Estudiante() {
		
	}
	public Estudiante(String nombre, int edad, Carrera carrera, int numeroMatricula, double promedio, boolean activo) {
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
		this.numeroMatricula = numeroMatricula;
		this.promedio = promedio;
		this.activo = activo;
	}
	
	// getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", carrera=" + getCarrera().getNombre() + ", numeroMatricula="
				+ numeroMatricula + ", promedio=" + promedio + ", activo=" + activo + "]";
	}
	
}
