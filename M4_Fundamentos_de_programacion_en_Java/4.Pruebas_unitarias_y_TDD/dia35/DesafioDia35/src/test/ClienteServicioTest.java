package test;
import servicio.ClienteServicio;
import modelo.Cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


public class ClienteServicioTest {
	// Hola no pude usar las librerias, no me detectaba por lo que todo lo siguiente es teorico y no lo pude probar
	private ClienteServicio clieneServicio = mock(ClienteServicio.class);
		
	@Test 
	public void testAgregarCliente() {
		 String nuevoRut = "12345678-9";
	     String nuevoNombre = "Juan";
	     String nuevoApellido = "Perez";
	     String nuevoAnio = "5 años";
	     
	     when(clienteServicio.agregarCliente(nuevoRut,nuevoNombre,nuevoApellido,nuevoAnio).thenReturn("El cliente agregado"));
	     String agregarCliente = clienteServicio.agregarCliente(nuevoRut,nuevoNombre,nuevoApellido,nuevoAnio);
	     assertEquals("El cliente agregado", agregarCliente);
	     verify(clienteServicio).agregarCliente(nuevoRut,nuevoNombre,nuevoApellido,nuevoAnio);	
	     }
	@Test
    public void testNullagregarCliente() {
		when(clienteServicio.agregarCliente(clienteServicio.agregarCliente(null, null, null, null).thenReturn("Cliente null");
		String agregarClienteNull = clienteServicio.agregarCliente(null,null,null,null);
        assertNull("Cliente null",agregarClienteNull)
        verify(clienteServicio).agregarCliente(null,null,null,null);
    }
}
