package cl.desafiolatam.proyecto.service;

import cl.desafiolatam.proyecto.models.Cliente;

public interface ClienteService {
	public Cliente add(Cliente cliente);
	public Cliente delete(Cliente cliente);
	public Cliente update(Cliente cliente);
	public Cliente findById(int id);
	public Cliente getAllClientes();
}
