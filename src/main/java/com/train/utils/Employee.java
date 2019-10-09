package com.train.utils;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	private Long employeePhone;
	private Double basicSalary;
	private Double specialAllowance = 250.80;
	private Double hra = 1000.50;

	public Employee() {
		super();
	}

	public Employee(Integer employeeId, String employeeName, String employeeAddress, Long employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}
	
	public Double calculateSalary() {
	
		Double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println("Salary : " +salary);
		return salary;
	}
 	
}
