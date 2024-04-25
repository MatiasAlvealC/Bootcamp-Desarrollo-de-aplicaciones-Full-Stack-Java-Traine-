package guiado;

public class Cerveza extends Botella {
	private int precio;
	
	public Cerveza(String tipo, String marca, int precio) {
		super(tipo, marca);
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
