package com.train.utils;

public class ComplexNumber {

	private double real;
	private double img;


	public ComplexNumber() {
		super();
	}


	public ComplexNumber(double real, double img) {
		super();
		this.real = real;
		this.img = img;
	}


	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
	{
		ComplexNumber temp = new ComplexNumber(0, 0);

		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;

		return temp;
	}
	
	
	public ComplexNumber difference(ComplexNumber other) {
	  
		double real = this.real - other.real;
	    double img = this.img - other.img;
	   
	    return new ComplexNumber(real, img);
	  }


	public ComplexNumber mul(ComplexNumber other){
		
		double real = this.real*other.real - this.img*other.img;
	    double img = this.img*other.real + this.real*other.img;
	    
	    return new ComplexNumber(real, img);
	}
	
	
	public void swap(ComplexNumber c1, ComplexNumber c2) {
		
		ComplexNumber temp = c1;
		c1 =c2;
		c2= temp;
		
	}
}
