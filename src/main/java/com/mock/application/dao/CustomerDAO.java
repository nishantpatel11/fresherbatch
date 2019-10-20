package com.mock.application.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.mock.application.model.Customer;

public class CustomerDAO {

	private final static Logger logger = Logger.getLogger(CustomerDAO.class);
	
	static{
		init();
	}

	public Boolean save(Customer customer) {

		
		System.out.println("=======DAO=========");
		try(FileOutputStream f = new FileOutputStream(new File("myObjects.txt"),true); ObjectOutputStream o = new ObjectOutputStream(f);) {
			
			o.writeObject(customer);
			System.out.println("Saved in network location");
			return true;

		} catch (FileNotFoundException e) {
			
			logger.error(e.getMessage());
			System.out.println("File not found");

		} catch (IOException e) {

			logger.error(e.getMessage());
			System.out.println("Error initializing stream");
		} 

		System.out.println("Saved in Customer Object");
		return false;
	}


	public List<Customer> getAllCustomer(){
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		boolean cont = true;
		
		try(FileInputStream fis = new FileInputStream("outputFile"); ObjectInputStream input = new ObjectInputStream(fis); ){
			
		    while(cont){
			   Customer customer = (Customer) input.readObject();
		      if(customer != null)
		         customerList.add(customer);
		      else
		         cont = false;
		   }
		}catch(Exception e){
			System.out.println( e.getMessage());
			logger.error(" "+e);
			
		}
		return customerList;	
	}

	private static void init() {
		DOMConfigurator.configure("log4j.xml");
	}
}
