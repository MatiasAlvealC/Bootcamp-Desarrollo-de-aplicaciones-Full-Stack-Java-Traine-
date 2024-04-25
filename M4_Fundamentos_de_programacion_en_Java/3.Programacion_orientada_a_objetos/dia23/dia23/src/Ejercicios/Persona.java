package Ejercicios;

public class Persona {
	private String nombre;
	private String rut;
	private double altura;
	// asociacion de dependencia - colaboracion
	// se puede tener un objeto como atributo
	private Lapiz lapiz;
	
	// constructor
	public Persona(String nombre, String rut, double altura, Lapiz lapiz) {
		this.nombre = nombre;
		this.rut = rut;
		this.altura = altura;
		this.lapiz = lapiz;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Lapiz getLapiz() {
		return lapiz;
	}

	public void setLapiz(Lapiz lapiz) {
		this.lapiz = lapiz;
	}

	// ademas podemos usar otro objeto en el metodo
    //	public Cuaderno reciboCuaderno(Cuaderno cuadernito) {
	//	return cuadernito;
	//}
	
}
