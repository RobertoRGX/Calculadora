package com.rgx.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorServiceImplTest {

	@Autowired	
	CalculatorServiceImpl service;
	
	@Test
	public void sumaTest() {		
		assertEquals( service.suma("3.0", "2.0"),"La suma de 3.0 y 2.0 es: 5.0");
	}
	@Test
	public void restaTest() {		
		assertEquals( service.resta("5.0", "2.0"),"La resta de 5.0 y 2.0 es: 3.0");
	}
	@Test
	public void multiTest() {		
		assertEquals( service.multi("5.0", "2.0"),"El producto de 5.0 y 2.0 es: 10.0");
	}
	@Test
	public void divideTest() {		
		assertEquals( service.divide("5.0", "5.0"),"La division de 5.0 y 5.0 es: 1.0");
	}
	@Test
	public void pingTest() {
		assertTrue( service.ping().contains("Bienvenido a Calculator:"));
	}
	
	
}
