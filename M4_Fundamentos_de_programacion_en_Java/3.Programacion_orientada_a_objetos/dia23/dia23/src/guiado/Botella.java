package guiado;

public class Botella {
	private String tipo;
	private String marca;
	
	public Botella(String tipo, String marca) {
		this.tipo = tipo;
		this.marca = marca;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
