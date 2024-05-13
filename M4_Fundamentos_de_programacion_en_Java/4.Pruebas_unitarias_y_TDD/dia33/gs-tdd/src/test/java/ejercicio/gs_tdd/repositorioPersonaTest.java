package ejercicio.gs_tdd;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import modelos.Persona;
import repositorios.RepositorioPersona;

public class repositorioPersonaTest {
	private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);
	
	@Test 
	public void testCrearPersonas() {
		Persona pepe = new Persona("1-2","Pepe");
		when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");
		//when(repositorioPersona.crearPersona(null)).thenThrow(new NullPointerException());
		
		String crearPersonaRes = repositorioPersona.crearPersona(pepe);
		assertEquals("OK", crearPersonaRes);
		verify(repositorioPersona).crearPersona(pepe);
	}
	
	@Test
	public void testActualizarPersona () {
		Persona juanito = new Persona("1-2", "Juanito");
		when(repositorioPersona.actualizarPersona(juanito)).thenReturn("OK");
		String actualizarRes = repositorioPersona.actualizarPersona(juanito);
		assertEquals("OK", actualizarRes);
		verify(repositorioPersona).actualizarPersona(juanito);
	}
	
	@Test
	public void testListarPersonas() {
		Persona maria = new Persona("1-2","Maria");
		repositorioPersona.crearPersona(maria);
		Map<String,String> listarPersonasRes = repositorioPersona.listarPersonas();
		assertNotNull(listarPersonasRes);
		verify(repositorioPersona).listarPersonas();
		}

	@Test
	public void testEliminarPersona() {
		Persona diego = new Persona("1-2","Diego");
		repositorioPersona.crearPersona(diego);
		when(repositorioPersona.eliminarPersona(diego)).thenReturn("OK");
		String eliminarRes = repositorioPersona.eliminarPersona(diego);
		assertEquals("OK", eliminarRes);
		verify(repositorioPersona).eliminarPersona(diego);
	}	
}

