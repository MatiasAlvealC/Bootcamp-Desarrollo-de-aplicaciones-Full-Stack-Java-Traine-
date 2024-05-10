package cl.desafiolatam;
import org.junit.jupiter.api.*;

import java.util.Map;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import Servicios.ServicioPersona;
import modelos.Persona;
import org.junit.Test;


@DisplayName("Tests Clase ServicioPersona")
public class ServicioPersonaTest {
	
	@BeforeAll
	static void setup() {
	logger.info("Inicio clase de prueba");
	}
	
	@BeforeEach
	void init() {
	logger.info("Inicio metodo de prueba");
	}
	
	private static Logger logger =
			Logger.getLogger("cl.desafiolatam.servicios.ServicioPersonaTest");
	private final ServicioPersona servicioPersona = new ServicioPersona();
	
	
	@Test
	public void testCrearPersona() {
		logger.info("info test crear persona");
		Persona juanito = new Persona("1234-1", "Juanito");
		String respuestaServicio = servicioPersona.crearPersona(juanito);
		assertEquals("Creada", respuestaServicio);
	}

	@Test
	public void testActualizarPersona() {
		logger.info("info actualizar persona");
		Persona pepe = new Persona("1234-1", "Pepe");
		String respuestaServicio = servicioPersona.actualizarPersona(pepe);
		assertEquals("Actualizada", respuestaServicio);
	}

	@Test
	public void testListarPersona() {
		logger.info("info listar persona");
		Map<String, String> listaPersonas = servicioPersona.listarPersonas();
		assertNotNull(listaPersonas);
	}
	@Test
	public void testEliminarPersona() {
		logger.info("info listar persona");
		Persona pepe = new Persona("1234-1", "Pepe");
		String resultado = servicioPersona.eliminarPersona(pepe);
		assertEquals("Eliminada",resultado);
	}

	@AfterEach
	void tearDown() {
	logger.info("Metodo de prueba finalizado");
	}
	@AfterAll
	static void done() {
	logger.info("Fin clase de prueba");
	}
}
