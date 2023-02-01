package com.rgx.calculator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("calculator")
@Slf4j
public class CalculatorController {
	
	private CalculatorService service = new CalculatorServiceImpl();
	
		
	 	@RequestMapping({"/",""})
	    @ResponseBody
	    public String ini() {
	 		log.debug("Calculator 2023 RGX     calculator/ping");
	        return "Calculator 2023 RGX     calculator/ping";
	    }
	 
	    @RequestMapping("/ping")
	    @ResponseBody
	    public String ping() {
	        return service.ping();
	    }
	   
	    @RequestMapping({"/suma/{x}/{y}","/suma/{x}"})
	    @ResponseBody
	    public String suma(@PathVariable Optional<String> x , @PathVariable Optional<String> y) {	    	
	        return service.suma(x.orElse("0.0"), y.orElse("0.0"));
	    }

	    @RequestMapping({"/resta/{x}/{y}","/resta/{x}"})
	    @ResponseBody
	    public String resta(@PathVariable Optional<String> x , @PathVariable Optional<String> y) {
	        return service.resta(x.orElse("0.0"), y.orElse("0.0"));
	    }

	    @RequestMapping({"/multi/{x}/{y}","/multi/{x}"})
	    @ResponseBody
	    public String multi(@PathVariable Optional<String> x , @PathVariable Optional<String> y) {
	        return service.multi(x.orElse("0.0"), y.orElse("1.0"));
	    }

	    @RequestMapping({"/divide/{x}/{y}","/divide/{x}"})
	    @ResponseBody
	    public String divide(@PathVariable Optional<String> x , @PathVariable Optional<String> y) {
	        return service.divide(x.orElse("0.0"), y.orElse("1.0"));
	    }
}