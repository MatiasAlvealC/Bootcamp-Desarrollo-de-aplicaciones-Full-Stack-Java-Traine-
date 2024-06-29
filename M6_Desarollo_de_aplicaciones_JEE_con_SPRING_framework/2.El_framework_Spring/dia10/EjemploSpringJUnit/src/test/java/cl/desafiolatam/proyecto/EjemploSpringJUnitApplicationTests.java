package cl.desafiolatam.proyecto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import cl.desafiolatam.proyecto.model.Cliente;
import cl.desafiolatam.proyecto.servicios.ClienteService;
import cl.desafiolatam.proyecto.servicios.UsuarioServices;

@SpringBootTest
class EjemploSpringJUnitApplicationTests {

	@Autowired
	UsuarioServices uservices;
	ClienteService clienteService;
	@Test
	void contextLoads() {
		
	}
	@Test
	public void testBuscarUsuario() {
		assertEquals(2, uservices.buscarUsuarios().size());
	}
	Cliente clientePrueba = new Cliente("ClienteP","ApellidoP","fonoP","DireccionP","emailP");

	@Test
	public void testSave() {
		assertEquals(clientePrueba, clienteService.save(clientePrueba));

	}
	@Test
	public void testFindAll() {
		assertEquals(2, clienteService.findAll().size());
	}	
	
	@Test
	public void testeliminarPorId() {
		assertEquals("Eliminación realizada correctamente", clienteService.eliminarPorId((long) 1));
	}
	
}
