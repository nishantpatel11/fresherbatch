package com.train.collection;

import java.util.Enumeration;
import java.util.Hashtable;

import com.train.collection.model.Employee;

public class HashTableExample {

	public static void main(String[] args) {

		Hashtable<Employee,String> hash= new Hashtable<>();
		hash.put(new Employee(1, "Vinit", 12345l), "Vinit");
		hash.put(new Employee(2, "Rahul", 12345l), "Rahul");
		hash.put(new Employee(3, "Prashant", 12345l), "Prashant");
		
		
		Enumeration<Employee> em= hash.keys();
		while(em.hasMoreElements()) {
			System.out.println(em+"==="+hash.get(em.nextElement()));
		}
	}

}
