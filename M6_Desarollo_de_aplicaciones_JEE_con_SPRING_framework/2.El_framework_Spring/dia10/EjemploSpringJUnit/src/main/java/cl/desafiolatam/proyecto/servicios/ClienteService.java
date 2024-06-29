package cl.desafiolatam.proyecto.servicios;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import cl.desafiolatam.proyecto.EjemploSpringJUnitApplication;
import cl.desafiolatam.proyecto.model.Cliente;


@Service
public class ClienteService {
	
	private static final Logger logger = LogManager.getLogger(EjemploSpringJUnitApplication.class);
	
	public Cliente save(Cliente cliente) {
		if (cliente == null) {
			logger.trace("Cliente Service:Error al guardar el cliente");
		}
		return cliente;
	}
	
	public List<Cliente> findAll(){
		Cliente cliente1 = new Cliente("Cliente1","Apellido1","fono1","Direccion1","email1");
		Cliente cliente2 = new Cliente("Cliente2","Apellido2","fono2","Direccion2","email2");
		
		List<Cliente> lista = Arrays.asList(cliente1,cliente2);
		return lista;
	}
	
	public String eliminarPorId(Long id) {
		if(id!=null) {
			logger.trace("Cliente Service:cliente eliminado");
		}
		return "Eliminación realizada correctamente";
	}
	
	public Cliente buscarId(Long id) {
		Cliente cliente3 = new Cliente("Cliente3","Apellido3","fono3","Direccion3","email3");
		return cliente3;
	}
}
