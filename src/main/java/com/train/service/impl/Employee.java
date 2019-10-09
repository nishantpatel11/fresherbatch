package com.train.service.impl;

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

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(Long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(Double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public Double getHra() {
		return hra;
	}

	public void setHra(Double hra) {
		this.hra = hra;
	}



	public Double calculateTransportAllowance(){
		return ((10 * calculateSalary())/100);
	}

}
