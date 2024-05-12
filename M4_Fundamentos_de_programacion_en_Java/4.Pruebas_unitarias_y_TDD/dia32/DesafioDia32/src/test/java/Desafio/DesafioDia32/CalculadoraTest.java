package Desafio.DesafioDia32;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class CalculadoraTest {
    private static Logger logger = Logger.getLogger(CalculadoraTest.class.getName());

    @Test
    public void testSumar() {
        logger.info("test Sumar");
        assertEquals(5, Calculadora.sumar(3, 2));
        assertEquals(-1, Calculadora.sumar(-3, 2));
        assertEquals(0, Calculadora.sumar(0, 0));
    }

    @Test
    public void testRestar() {
        logger.info("test restar");
        assertEquals(1, Calculadora.restar(3, 2));
        assertEquals(-5, Calculadora.restar(-3, 2));
        assertEquals(0, Calculadora.restar(0, 0));
    }
    
    @Test
    public void testMultiplicar() {
        logger.info("test multiplicación");
        assertEquals(6, Calculadora.multiplicar(3, 2));
        assertEquals(-6, Calculadora.multiplicar(-3, 2));
        assertEquals(0, Calculadora.multiplicar(0, 0));
    }
    
    @Test
    public void testDividir() {
        logger.info("test división");
        assertEquals(1.5, Calculadora.dividir(3, 2), 0.001); // Tolerancia de 0.001
        assertEquals(-1.5, Calculadora.dividir(-3, 2), 0.001); // Tolerancia de 0.001
        assertThrows(IllegalArgumentException.class, () -> Calculadora.dividir(0, 0));
    }
}
