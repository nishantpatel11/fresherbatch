package com.train.collection.model;

public class Employee {

	private Integer employeeId;
	private String employeeName;
	private Long employeePhone;
	private Double basicSalary;
	private Date dateOfBrith;

	public Employee() {
		super();
	}

	public Employee(Integer employeeId, String employeeName, Long employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
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

	public Date getDateOfBrith() {
		return dateOfBrith;
	}

	public void setDateOfBrith(Date dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
//		result = prime * result + ((basicSalary == null) ? 0 : basicSalary.hashCode());
//		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
//		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
//		result = prime * result + ((employeePhone == null) ? 0 : employeePhone.hashCode());
//		return result;
		
		return prime;
	}

	@Override
	public boolean equals(Object obj) {
	
		
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (basicSalary == null) {
//			if (other.basicSalary != null)
//				return false;
//		} else if (!basicSalary.equals(other.basicSalary))
//			return false;
//		if (employeeId == null) {
//			if (other.employeeId != null)
//				return false;
//		} else if (!employeeId.equals(other.employeeId))
//			return false;
//		if (employeeName == null) {
//			if (other.employeeName != null)
//				return false;
//		} else if (!employeeName.equals(other.employeeName))
//			return false;
//		if (employeePhone == null) {
//			if (other.employeePhone != null)
//				return false;
//		} else if (!employeePhone.equals(other.employeePhone))
//			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone="
				+ employeePhone + ", basicSalary=" + basicSalary + ", dateOfBrith=" + dateOfBrith + "]";
	}



}
