package com.java8;

import com.java8.service.impl.CalculationServiceImpl;

public class AppTest {

	public static void main(String[] args) {

		CalculationServiceImpl calculationServiceImpl = new CalculationServiceImpl();
		System.out.println("Sum is "+calculationServiceImpl.sum(10.0, 20.0));
		System.out.println("Division is "+calculationServiceImpl.div(10.0, 20.0));
		System.out.println("Subtraction is "+calculationServiceImpl.diff(10.0, 20.0));
		System.out.println("Multiple "+calculationServiceImpl.mul(10.0, 20.0));
		System.out.println("Modulus "+calculationServiceImpl.mod(10.0, 20.0));
	}

}
