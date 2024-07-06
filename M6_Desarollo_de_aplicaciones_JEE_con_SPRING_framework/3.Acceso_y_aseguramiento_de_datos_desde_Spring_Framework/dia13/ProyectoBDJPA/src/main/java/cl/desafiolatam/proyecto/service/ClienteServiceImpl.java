package cl.desafiolatam.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.proyecto.models.Cliente;
import cl.desafiolatam.proyecto.repositories.ClienteRepository;
import jakarta.transaction.Transactional;

@Service
public class ClienteServiceImpl {
	private static final Logger logger = LoggerFactory.getLogger(ProyectoDemoJDBCApplication.class);
	@Autowired
	ClienteRepository dao;
	Cliente respuesta;

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(int id) {
		respuesta = new ClienteVO(new ArrayList<Cliente>(), "Ha ocurrido un error!", "104");
		try {
			Cliente cliente = dao.findById(id).get();
			respuesta.getClientes().add(cliente);
			respuesta.setMensaje("Se ha encontrado el cliente");
			respuesta.setCodigo("0");
		} catch (Exception e) {
			logger.trace("Cliente service: error al buscar el cliente", e);
		}
		return respuesta;
	}
}
