package Modelo;

public class Auto2 {
	private double altura;
	private double ancho;
	private String tipoMaterial;
	private String color;
	
	public Auto2(double altura, String tipoMaterial) {
		this.altura = altura;
		this.tipoMaterial = tipoMaterial;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
