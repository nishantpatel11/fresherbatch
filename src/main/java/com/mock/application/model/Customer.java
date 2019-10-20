package com.mock.application.model;

import java.io.Serializable;

public class Customer implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1332783880005613286L;
	private Integer custId;
	private String custName;
	private Integer age;
	private String address;
	private Long mobile;

	public Customer() {
		super();
	}

	public Customer(Integer custId, String custName, Integer age, String address, Long mobile) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.age = age;
		this.address = address;
		this.mobile = mobile;
	}

	public Customer(String custName, Integer age, String address, Long mobile) {
		super();
		this.custName = custName;
		this.age = age;
		this.address = address;
		this.mobile = mobile;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", age=" + age + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	
}
