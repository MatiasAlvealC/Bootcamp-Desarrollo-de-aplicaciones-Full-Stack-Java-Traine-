package Modelo;

public class Auto {
	String marca;
	String modelo;
	String color;
	int velocidadActual;
	boolean motorEncendido;
	
	// Constructor por defecto
	public Auto() {	
		color="gris";
		System.out.println("Ejecutando el constructor por defecto!");
	}	
		
	// Constructor 2
	public Auto(String color) {	
		this.color=color;
	}
		
	// Constructor 3
	public Auto(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	// Métodos
	// Método encenderMotor deja el motorEncendido en true.
	public void encenderMotor() {
		motorEncendido = true;
	}
	
	// El método aumentarVelocidad recibe una velocidad y
	// la agrega a la velocidadActual
	public void aumentarVelocidad(int velocidad) {
		velocidadActual = velocidadActual + velocidad;
	}
	
	public void frenar() {
		while(velocidadActual>0) {
			velocidadActual = velocidadActual - 1;
		};
	}
	
	public void apagarMotor() {
		motorEncendido = false;
		velocidadActual = 0;
	}
	// Metodos Getters y Setters
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

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadActual="
				+ velocidadActual + ", motorEncendido=" + motorEncendido + "]";
	}
	
}
