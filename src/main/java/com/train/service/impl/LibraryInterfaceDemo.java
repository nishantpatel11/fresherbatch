package com.train.service.impl;

public class LibraryInterfaceDemo {

	public static void main( String[] args )
	{
		
		KidUsers kidUsers = new KidUsers();
		kidUsers.setAge(10);
		System.out.println(kidUsers.registerAccount());
		
		kidUsers.setAge(18);
		System.out.println(kidUsers.registerAccount());
		
		kidUsers.setBookType("Kids");
		System.out.println(kidUsers.requestBook());
		
		kidUsers.setBookType("Fiction");
		System.out.println(kidUsers.requestBook());
		
		
		AdultUser adultUser = new AdultUser();
		adultUser.setAge(5);
		System.out.println(adultUser.registerAccount());
		
		adultUser.setAge(23);
		System.out.println(adultUser.registerAccount());
		
		adultUser.setBookType("Kids");
		System.out.println(adultUser.requestBook());
		
		adultUser.setBookType("Fiction");
		System.out.println(adultUser.requestBook());
	}
}
