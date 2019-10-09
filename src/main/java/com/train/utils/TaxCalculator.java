package com.train.utils;

import com.train.exceptionhandler.CountryNotValidException;
import com.train.exceptionhandler.CustomException;
import com.train.exceptionhandler.EmployeeNameInvalidException;
import com.train.exceptionhandler.TaxNotEligibleException;

public class TaxCalculator {

	private String empName;
	private Boolean isIndian = false;
	private Double empSal;
	
	
	
	 public TaxCalculator() {
		super();
	}


	 

	public TaxCalculator(String empName, Boolean isIndian, Double empSal) {
		super();
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public Boolean getIsIndian() {
		return isIndian;
	}




	public void setIsIndian(Boolean isIndian) {
		this.isIndian = isIndian;
	}




	public Double getEmpSal() {
		return empSal;
	}




	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}




	public Double calculateTax() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException, CustomException {
		
		if(!this.isIndian)
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		
		if( this.empName == null || this.empName.trim().isEmpty())
			throw new EmployeeNameInvalidException("The employee name cannot be empty");		
		
		if( this.empSal == null )
			throw new CustomException("The employee Salary is null");		
		
		
		if(this.empSal > 100000 && this.isIndian)
			return this.empSal *8/100;
		
		else if (this.empSal >= 50000 &&this.empSal<100000 && this.isIndian)
			return this.empSal * 6/100;
		
		else if(this.empSal >= 30000 &&this.empSal<500000 && this.isIndian)
			return this.empSal *5/100;
		
		else if(this.empSal >= 10000 &&this.empSal<30000 && this.isIndian)
			return this.empSal *4/100;
		
		else
			throw new TaxNotEligibleException("The employee does not need to pay tax");
	}
	
	
	public static void main(String [] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException, CustomException {
		
		TaxCalculator tax = new TaxCalculator("Jack", true, 55000.0);
		System.out.println("Tax amount is "+tax.calculateTax());
	}
}
