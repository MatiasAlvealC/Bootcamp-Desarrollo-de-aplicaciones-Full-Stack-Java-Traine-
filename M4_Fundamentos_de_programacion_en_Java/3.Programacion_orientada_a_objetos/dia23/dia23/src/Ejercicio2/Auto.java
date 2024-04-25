package Ejercicio2;

public class Auto {
	private String marca;
	private String modelo;
	private String color;
	private int velocidadActual;
	private boolean motorEncendido;
	
	public Auto() {
		
	}
	
	public void apagarMotor() {
		if(this.velocidadActual == 0) {
			this.setMotorEncendido(false);
		}
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
