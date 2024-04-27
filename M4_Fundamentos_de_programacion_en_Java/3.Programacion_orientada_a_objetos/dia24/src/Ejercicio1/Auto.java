package Ejercicio1;

public class Auto {
	private String marca;
	private String modelo;
	private String color;
	private int velocidadActual;
	private boolean motorEncendido;
	private SistemaSonido sistemaSonido;
	
	public Auto() {
		
	}
	public Auto(String marca, String modelo, String color, int velocidadActual, boolean motorEncendido) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadActual = velocidadActual;
		this.motorEncendido = motorEncendido;
	}
	// Vamos a hacer una sobrecarga del método aumentarVelocidad para que, en caso
	// de no recibir la velocidad por parámetro, aumente la velocidad en 10 y otra sobrecarga
	// que reciba dos valores booleanos
	public void aumentarVelocidad(int velocidad){
		velocidadActual = velocidadActual + velocidad;
	}
	public void aumentarVelocidad(){
		velocidadActual = velocidadActual + 10;
	}
	public void aumentarVelocidad(boolean maximoCiudad, boolean maximoCarretera){
		if(maximoCiudad) {
			velocidadActual = velocidadActual + 50;
		}
		if(maximoCarretera) {
			velocidadActual = velocidadActual + 100;
		}
	}
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadActual="
				+ velocidadActual + ", motorEncendido=" + motorEncendido + "]";
	}
	public SistemaSonido getSistemaSonido() {
		return sistemaSonido;
	}
	public void setSistemaSonido(SistemaSonido sistemaSonido) {
		this.sistemaSonido = sistemaSonido;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public boolean isMotorEncendido() {
		return motorEncendido;
	}
	public void setMotorEncendido(boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}
	
}
