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
		assertEquals( service.suma("3.0", "2.0"),"La suma de los valores 3.0 y 2.0 es: 5.0");
	}
	@Test
	public void restaTest() {		
		assertEquals( service.resta("5.0", "1.0"),"La resta de los valores 5.0 y 1.0 es: 4.0");
	}
	@Test
	public void multiTest() {		
		assertEquals( service.multi("5.0", "3.0"),"El producto de los valores 5.0 y 3.0 es: 15.0");
	}
	@Test
	public void divideTest() {		
		assertEquals( service.divide("10.0", "5.0"),"La division de los valores 10.0 y 5.0 es: 2.0");
	}
	@Test
	public void pingTest() {
		assertTrue( service.ping().contains("Bienvenido a Calculator:"));
	}
	
	
}
