package com.java8.service.impl;

import java.util.List;

import com.java8.service.CalculationService;
import com.java8.service.OrderInterface;

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


	public Boolean orderChecked(Object order) {

		if(order instanceof Integer) {
			Integer value = (Integer) order;
			OrderInterface<Integer> orderCheck = (ord) -> (ord >10000);
			return orderCheck.isChecked(value);
		}
		else if(order instanceof String) {

			String value = (String) order;
			OrderInterface<String> orderCheck = (ord) -> ( ord.equals("ACCEPTED") && ord.equals("COMPLETED"));
			return orderCheck.isChecked(value);
		}
		return false;
	}

	public boolean removeIf(List<String> list) {

		if(list.size()<1)
			return false;
		list.removeIf(word -> (word.length() % 2 == 0));
		list.forEach(System.out::println);

		return true;
	}

	public boolean createString(List<String> list) {

		if(list.size()<1)
			return false;

		StringBuilder sb = new StringBuilder("");	

		list.forEach(word->{
			sb.append(word.charAt(0));
		});

		System.out.println(sb.toString());
		return true;
	}

	private StringBuilder StringBuilder(String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
