package com.rgx.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorServiceImplExceptionTest {

	@Autowired	
	CalculatorServiceImpl service;
	
	@Test
	public void sumaTest() {		
		assertEquals( service.suma("2.0", "w"),"For input string: \"w\", No es posible la suma de: 2.0 y w");
	}
	@Test
	public void restaTest() {		
		assertEquals( service.resta("5.0",  "w"),"For input string: \"w\", No es posible la resta de: 5.0 y w");
	}
	@Test
	public void multiTest() {		
		assertEquals( service.multi("5.0",  "w"),"For input string: \"w\", No es posible la multiplicacion de: 5.0 y w");
	}
	@Test
	public void divideTest() {		
		assertEquals( service.divide("5.0",  "w"),"For input string: \"w\", No es posible la division de: 5.0 y w");
	}
	
	
}
