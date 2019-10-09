package com.train.service.impl;

import com.train.service.LibraryUser;

public class AdultUser implements LibraryUser{
 
	private int age;
	private String bookType;
	
	public AdultUser() {
		super();
	}

	
	
	public AdultUser(int age) {
		super();
		this.age = age;
	}



	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	
	
	

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getBookType() {
		return bookType;
	}



	public void setBookType(String bookType) {
		this.bookType = bookType;
	}



	public String registerAccount() {
		if(this.age > 12) {
			return "You have successfully registered under an Adult Account";
		}

		return "Sorry, Age must be greater than 12 to register as an adult";
	}

	public String requestBook() {
		if(this.bookType.equalsIgnoreCase("Fiction"))
			return "Book Issued successfully, please return the book within 7 days";
		
		return "Oops, you are allowed to take only adult Fiction books";
		
	}
	
	
	
}
