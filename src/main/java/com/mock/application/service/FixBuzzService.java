package com.mock.application.service;

public class FixBuzzService {

	final static String Fizz = "Fizz";
	final static String Buzz = "Buzz";
	final static String FizzBuzz = "FizzBuzz";

	public static void main(String[] args) {

		new FixBuzzService().getFizzWordNumber(1);	
	}

	public String getFizzWordNumber(int x) {

		if(x%3==0 && x%5==0)
			return FizzBuzz;
		else if(x%5==0)
			return Buzz;
		else  if(x%3==0)
			return Fizz;

		return null;
	}
}
