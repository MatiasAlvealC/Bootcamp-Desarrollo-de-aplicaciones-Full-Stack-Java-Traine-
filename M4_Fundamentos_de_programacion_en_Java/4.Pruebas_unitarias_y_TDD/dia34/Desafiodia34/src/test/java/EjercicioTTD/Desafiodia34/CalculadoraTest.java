package EjercicioTTD.Desafiodia34;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import EjercicioTTD.Desafiodia34.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {
	private static final int var0=0;
	private static final int var1=10;
	private static final int var2=14;
	private static final int var3=-36;
	private static final int var4=16;
	private static Logger logger = Logger.getLogger(CalculadoraTest.class.getName());

	@Test
	public void testSumar() {
		logger.info("Test Sumar");
		assertEquals(24, Calculadora.sumar(var1,var2));
		assertEquals(-20, Calculadora.sumar(var3, var4));
	}

	@Test
	public void testRestar() {
		logger.info("Test Restar");
		assertEquals(-4, Calculadora.restar(var1, var2));
		assertEquals(-52, Calculadora.restar(var3, var4));
	}

	@Test
	public void testMultiplicar() {
		logger.info("Test multiplicar");
		assertEquals(140, Calculadora.multiplicar(var1,var2));
		assertEquals(-576, Calculadora.multiplicar(var3, var4));
	}

	@Test
	public void testDividir() {
		logger.info("Test división");
		assertEquals(0.714, Calculadora.dividir(var1, var2), 0.001); 
		assertEquals(-2.25 , Calculadora.dividir(var3, var4), 0.001);
		assertThrows(IllegalArgumentException.class, () -> Calculadora.dividir(var0, var0));
	}

}
