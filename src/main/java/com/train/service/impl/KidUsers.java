package com.train.service.impl;

import com.train.service.LibraryUser;

public class KidUsers implements LibraryUser{


	private int age;
	private String bookType;

	public KidUsers() {
		super();
	}

	
	

	public KidUsers(int age) {
		super();
		this.age = age;
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




	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}


	
	


	public String registerAccount() {
		if(this.age < 12) {
			return "You have successfully registered under a Kids Account";
		}

		return "Sorry, Age must be less than 12 to register as a kid";
	}

	public String requestBook() {
		if(this.bookType.equalsIgnoreCase("Kids"))
			return "Book Issued successfully, please return the book within 10 day";
		
		return "Oops, you are allowed to take only kids books";
	}





}
