package Servicios;
import java.util.HashMap;
import java.util.Map;

import modelos.Persona;

public class ServicioPersona {
	private Map<String,String> personasDB = new HashMap<>();
	
	public String crearPersona(Persona persona) {
		if (persona != null) {
			personasDB.put(persona.getRut(), persona.getNombre());
			return "Creada";
		} else {
			return "No creada";
		}
	}

	public String actualizarPersona(Persona persona) {
		if (persona != null) {
			personasDB.put(persona.getRut(), persona.getNombre());
			return "Actualizada";
		} else {
			return "No actualizada";
		}
	}
	public Map<String, String> listarPersonas() {
			return personasDB;
	}
	public String eliminarPersona(Persona persona) {
		if (persona != null) {
		personasDB.remove(persona.getRut());
		return "Eliminada";
		} else {
		return "No eliminada";
		}
	}
}
