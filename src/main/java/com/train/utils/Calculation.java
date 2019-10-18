package com.train.utils;

public class Calculation {


	public static Double getSimpleInter(Double principal,Double rate,Double time) {

		return ((principal*rate*time)/100);
	}

	public static Double getCompInter(Double principal,Double rate,Double time) {

		return (principal*Math.pow(1+rate/100,time));
	}
}
