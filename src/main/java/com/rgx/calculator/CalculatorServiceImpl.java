package com.rgx.calculator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;



@Service("CalculatorService")
@Component
@Slf4j
public class CalculatorServiceImpl implements CalculatorService {
		
	private static final String DE_LOS_VALORES_SIGUIENTES = " de los valores siguientes ";
	@Override
	public String ping() {	
		log.debug("Bienvenido a Calculator: "+new Date()+"     ...         server/calculator/[suma,Double.toString(res)ta,multi,producto]/{val}/{val} ");
		return "Bienvenido a Calculator: "+new Date()+"     ...         server/calculator/[suma,Double.toString(res)ta,multi,producto]/{val}/{val} ";
		
	}
	
	@Override
	public String suma(String val1,String val2) {
		String key="La suma";
		try {
		double res = Double.parseDouble(val1)+Double.valueOf(val2);
		String msg = String.format( "%s %s %s y %s es %s " ,key ,DE_LOS_VALORES_SIGUIENTES,val1,val2,Double.toString(res));
		log.debug(msg);
		return msg;
	}catch (NumberFormatException e) {
		log.warn(e.getMessage()+", No es posible la suma de: "+val1+" y "+val2);
		return e.getMessage()+", No es posible la suma de: "+val1+" y "+val2;
	}
	}
	@Override
	public String resta(String val1,String val2) {
		String key = "La resta";
		try {
		double res = Double.parseDouble(val1)-Double.valueOf(val2);
		String msg = String.format( "%s %s %s y %s es %s " ,key ,DE_LOS_VALORES_SIGUIENTES,val1,val2,Double.toString(res));
		log.debug(msg);
		return msg;
	}catch (NumberFormatException e) {
		log.warn(e.getMessage()+", No es posible la resta de: "+val1+" y "+val2);
		return e.getMessage()+", No es posible la resta de: "+val1+" y "+val2;
	}
	}
	@Override
	public String multi(String val1,String val2) {
		String key = "El producto";	
		try {		
		double res = Double.parseDouble(val1)*Double.valueOf(val2);
		String msg = String.format( "%s %s %s y %s es %s " ,key ,DE_LOS_VALORES_SIGUIENTES,val1,val2,Double.toString(res));
		log.debug(msg);
		return msg;
		}catch (NumberFormatException e) {
			log.warn(e.getMessage()+", No es posible la multiplicacion de: "+val1+" y "+val2);
			return e.getMessage()+", No es posible la multiplicacion de: "+val1+" y "+val2;
		}
	}
	@Override
	public String divide(String val1,String val2) {	
		String key= "La division";
		try {
			double res = Double.parseDouble(val1)/Double.valueOf(val2);
			String msg = String.format( "%s %s %s y %s es %s " ,key ,DE_LOS_VALORES_SIGUIENTES,val1,val2,Double.toString(res));
			log.debug(msg);
			return msg;
		}catch (NumberFormatException e) {
			log.warn(e.getMessage()+", No es posible la division de: "+val1+" y "+val2);
			return e.getMessage()+", No es posible la division de: "+val1+" y "+val2;
		}
	}
	
	

}
