package cl.desafiolatam.proyectodemo;

import java.time.Instant;
import java.util.Date;

public class UtilesGeneral {
	public String getFecha() {
		Date date = Date.from(Instant.now());
		String fecha = date.toString();
		return fecha;
		}
}
