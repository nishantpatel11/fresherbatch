package com.train.service.impl;

public class InheritanceActivity {

	public static void main(String[] args) {
	
		Manager manager = new Manager(126534, "Peter", "Chennai India", 23784l, 65000.0);
		manager.calculateSalary();
		System.out.println("Manager TransportAllowance  " + manager.calculateTransportAllowance());
		
		
		
		Trainee trainee=new Trainee(29846, "Jack", "Mumba India", 442085l, 45000.0);
		trainee.calculateSalary();
		System.out.println("Trainee TransportAllowance " +	trainee.calculateTransportAllowance());
		
		
	}

}
