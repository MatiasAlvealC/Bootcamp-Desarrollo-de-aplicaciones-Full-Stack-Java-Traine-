package cl.desafiolatam.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.proyecto.models.LibroPedido;
import cl.desafiolatam.proyecto.repositories.LibroPedidoRepository;

@Service
public class LibroPedidoService {
	@Autowired
	private LibroPedidoRepository libroPedidoRepository;
	
	
	public List<LibroPedido> obtenerTodosLosLibrosPedidos() {
		return libroPedidoRepository.findAll();
	}

	public LibroPedido guardarLibro(LibroPedido libroPedido) {
		return libroPedidoRepository.save(libroPedido);
	}
	
}