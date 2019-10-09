package com.train.service.impl;

public class Trainee extends Employee{

	public Trainee() {
		super();
	}

	public Trainee(Integer id, String name, String address, Long phone,Double salary) {
		super(id, name, address, phone);
		super.setBasicSalary(salary);
	}

	
	
}
