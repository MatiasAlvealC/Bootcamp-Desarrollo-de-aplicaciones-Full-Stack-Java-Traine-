package modelo;

public class Cliente {
	private String runCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String aniosClientes;
	private CategoriaEnum nombreCategoria;

	// constructor
	public Cliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosClientes) {
		this.runCliente = runCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.aniosClientes = aniosClientes;
		this.nombreCategoria = CategoriaEnum.Activo; // se crea el objeto como Activo
	}

	// getters and setters
	public String getRunCliente() {
		return runCliente;
	}

	public void setRunCliente(String runCliente) {
		this.runCliente = runCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getAniosClientes() {
		return aniosClientes;
	}

	public void setAniosClientes(String aniosClientes) {
		this.aniosClientes = aniosClientes;
	}

	public CategoriaEnum getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(CategoriaEnum nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	// toString
	@Override
	public String toString() {
		return "Cliente [runCliente=" + runCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", aniosClientes=" + aniosClientes + ", nombreCategoria=" + nombreCategoria + "]";
	}

}
