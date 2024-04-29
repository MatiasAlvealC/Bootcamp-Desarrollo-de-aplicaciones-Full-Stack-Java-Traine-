package Desafio;

public class Tienda {
	private Vendedor vendedor;
	private Cliente cliente;
	private int stock;

	// constructor
	public Tienda(Vendedor vendedor, Cliente cliente, int stock) {
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.stock = stock;
	}
	
	// método
	public String existeStock() {
		return "Cantidad de stock es "+stock;
	}
	
	// getter and setter
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
