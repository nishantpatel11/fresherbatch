package com.mock.application.service;

import java.util.List;

import com.mock.application.dao.CustomerDAO;
import com.mock.application.model.Customer;

public class CustomerService {

	CustomerDAO customerDAO;

	public boolean addCustomer(Customer customer) {
		
		System.out.println("+++++++"+customerDAO+"=" +customerDAO.save(customer));
		return customerDAO.save(customer);
	}
	
	public List<Customer> getList(){
		return customerDAO.getAllCustomer();
	}
}
