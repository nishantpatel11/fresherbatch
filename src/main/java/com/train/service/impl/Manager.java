package com.train.service.impl;

public class Manager extends Employee {

	public Manager() {
		super();
	}

	public Manager(Integer id, String name, String address, Long phone,Double salary) {
		super(id, name, address, phone);
		super.setBasicSalary(salary);
	}
	
	
	public Double calculateTransportAllowance(){
		return ((15 * calculateSalary())/100);
	}
	

}
