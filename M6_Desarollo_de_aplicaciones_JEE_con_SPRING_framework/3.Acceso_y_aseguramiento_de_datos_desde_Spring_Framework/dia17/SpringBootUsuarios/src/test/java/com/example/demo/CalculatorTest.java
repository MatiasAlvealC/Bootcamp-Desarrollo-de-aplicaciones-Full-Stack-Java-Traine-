package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    
    
    @Test
    public void testRestar() {
        Calculator calculator = new Calculator();
        int result = calculator.restar(10, 3);
        assertEquals(7, result);

        int result2 = calculator.restar(0, 0);
        assertEquals(0, result2);      
        
        
    }
    
}

