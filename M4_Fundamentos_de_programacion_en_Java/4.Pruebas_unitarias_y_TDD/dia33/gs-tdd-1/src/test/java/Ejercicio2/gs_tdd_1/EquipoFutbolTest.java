package Ejercicio2.gs_tdd_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.EquipoFutbol;

public class EquipoFutbolTest {
	private static final int CUATRO_JUEGOS_GANADOS=4;
	private static final int CINCO_JUEGOS_EMPATADOS = 5;
	private static final int TRES_JUEGOS_PERDIDOS = 3;
	
	@Test
	public void constructorDebeSetearJuegosGanados() {
		EquipoFutbol team = new EquipoFutbol(CUATRO_JUEGOS_GANADOS,CINCO_JUEGOS_EMPATADOS,TRES_JUEGOS_PERDIDOS);
		assertEquals(CUATRO_JUEGOS_GANADOS, team.getJuegosGanados());
	}
	
	@Test
	public void testJuegosEmpatados() {
		EquipoFutbol team = new EquipoFutbol(CUATRO_JUEGOS_GANADOS,CINCO_JUEGOS_EMPATADOS,TRES_JUEGOS_PERDIDOS);
		assertEquals(CINCO_JUEGOS_EMPATADOS, team.getJuegosEmpatados());
	}
	
	@Test
	public void testJuegosPerdidos() {
		EquipoFutbol team = new EquipoFutbol(CUATRO_JUEGOS_GANADOS,CINCO_JUEGOS_EMPATADOS,TRES_JUEGOS_PERDIDOS);
		assertEquals(TRES_JUEGOS_PERDIDOS, team.getJuegosPerdidos());
	}
}
