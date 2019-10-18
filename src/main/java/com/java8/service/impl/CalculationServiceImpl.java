package com.java8.service.impl;

import com.java8.service.CalculationService;

public class CalculationServiceImpl {

	public Double sum(Double t,Double u) {

		CalculationService  calc = (x,y) -> x+y; 
		return calc.calc(t, u);		
	}

	public Double mul(Double t,Double u) {

		CalculationService  calc = (x,y) -> x*y; 
		return calc.calc(t, u);		
	}

	public Double diff(Double t,Double u) {

		CalculationService  calc = (x,y) -> x-y; 
		return calc.calc(t, u);		
	}

	public Double div(Double t,Double u) {

		CalculationService  calc = (x,y) -> x/y; 
		return calc.calc(t, u);		
	}

	public Double mod(Double t,Double u) {

		CalculationService  calc = (x,y) -> x%y; 
		return calc.calc(t, u);		
	}
}
