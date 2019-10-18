package com.train.utils;

import java.util.Scanner;

public class LoginConsole {

	static Scanner scr = new Scanner(System.in);

	static Boolean isCheck(String userName,String password) {

		if(userName.equalsIgnoreCase("Admin") && password.equals("Password"))
			return true;
		return false;
	}

	public static void main(String[] args) {

		System.out.println("Please Enter UserName");
		String userName = scr.nextLine();
		System.out.println("Please Enter Password");
		String password = scr.nextLine();

		int index=1;
		while(true) {

			if(isCheck(userName, password))
				System.out.println("!!!!!!!! Welcome !!!!!!");
			else
				index++;

			
			if(index > 3) {
				System.out.println("your maximum attempt is done.");
				System.out.println("Crenditial is invalid, Please reach out to admin");
				break;
			}

			
			System.out.println("Please Re-Enter UserName");
			userName = scr.nextLine();
			System.out.println("Please Re-Enter Password");
			password = scr.nextLine();
		}
	}

}
