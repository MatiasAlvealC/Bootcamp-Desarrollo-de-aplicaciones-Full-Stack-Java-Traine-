package Polimorfismo;

public class Estudiante extends Persona {
	private double deuda;
	public Estudiante(String rut, String nombre, boolean presente) {
		super(rut, nombre, presente);
	}
	public Estudiante(double deuda,String rut, String nombre, boolean presente) {
		super(rut, nombre, presente);
		this.deuda = deuda;
	}
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	
}
