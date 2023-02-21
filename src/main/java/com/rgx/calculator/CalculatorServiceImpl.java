package com.rgx.calculator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;



@Service("CalculatorService")
@Component
@Slf4j
public class CalculatorServiceImpl implements CalculatorService {
		
	@Override
	public String ping() {	
		log.debug("Bienvenido a Calculator: "+new Date()+"     ...         server/calculator/[suma,resta,multi,producto]/{val}/{val} ");
		return "Bienvenido a Calculator: "+new Date()+"     ...         server/calculator/[suma,resta,multi,producto]/{val}/{val} ";
		
	}
	
	@Override
	public String suma(String val1,String val2) {
		try {
		double res = Double.parseDouble(val1)+Double.valueOf(val2);
		log.debug("La suma de los valores siguientes:"+val1+" y "+val2+" es: "+ res);
		return "La suma de los valores "+val1+" y "+val2+" es: "+ res;
	}catch (NumberFormatException e) {
		log.warn(e.getMessage()+", No es posible la suma de: "+val1+" y "+val2);
		return e.getMessage()+", No es posible la suma de: "+val1+" y "+val2;
	}
	}
	@Override
	public String resta(String val1,String val2) {	
		try {
		double res = Double.parseDouble(val1)-Double.valueOf(val2);
		log.debug("La resta de los valores "+val1+" y "+val2+" es: "+ res);
		return "La resta de los valores "+val1+" y "+val2+" es: "+ res;
	}catch (NumberFormatException e) {
		log.warn(e.getMessage()+", No es posible la resta de: "+val1+" y "+val2);
		return e.getMessage()+", No es posible la resta de: "+val1+" y "+val2;
	}
	}
	@Override
	public String multi(String val1,String val2) {
		try {
		double res = Double.parseDouble(val1)*Double.valueOf(val2);
		log.debug("El producto de los valores "+val1+" y "+val2+" es: "+ res);
		return "El producto de los valores "+val1+" y "+val2+" es: "+ res;
		}catch (NumberFormatException e) {
			log.warn(e.getMessage()+", No es posible la multiplicacion de: "+val1+" y "+val2);
			return e.getMessage()+", No es posible la multiplicacion de: "+val1+" y "+val2;
		}
	}
	@Override
	public String divide(String val1,String val2) {	
		try {
			double res = Double.parseDouble(val1)/Double.valueOf(val2);
			log.debug("La division de los valores "+val1+" y "+val2+" es: "+ res);
			return "La division de los valores "+val1+" y "+val2+" es: "+ res;
		}catch (NumberFormatException e) {
			log.warn(e.getMessage()+", No es posible la division de: "+val1+" y "+val2);
			return e.getMessage()+", No es posible la division de: "+val1+" y "+val2;
		}
	}
	
	

}
