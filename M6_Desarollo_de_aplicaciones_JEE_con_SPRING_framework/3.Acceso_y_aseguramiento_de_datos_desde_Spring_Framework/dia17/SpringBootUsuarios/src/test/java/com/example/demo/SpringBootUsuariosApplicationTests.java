package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotSame;


@SpringBootTest
class SpringBootUsuariosApplicationTests {

	@Test
	void contextLoads() {
		
		
		int variable1 = 10;
		int variable2 = 20;
		String palabra1 = "Junit";
		String palabra2 = null;
		String palabra3 = "Junit";
		String palabra4 = "Prueba";
		
		assertTrue(variable1<variable2);
		assertFalse(variable1>variable2);
		assertNull(palabra2);
		assertNotNull(palabra1);
		assertSame(palabra1,palabra3);
		assertNotSame(palabra1,palabra4);
		assertEquals(palabra1,palabra3);
		assertNotEquals(palabra1,palabra4);

	}


}
