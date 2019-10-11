package com.train;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactDetails {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		Map<String,Long> contactMap = new HashMap<String,Long>();
		while(true) {

			System.out.print("Enter Your choice");
			int ch = scr.nextInt();
			System.out.println("=========");
			System.out.println("1. Add Contact Info");
			System.out.println("2. Delete Contact Details");
			System.out.println("3. Contact Details ");
			System.out.println("4. Update Contact Details ");
			System.out.println("5. Quit or Exit");

			switch(ch) {
			case 1 :

				System.out.println("Enter name of person");
				String name = scr.next();

				System.out.println("Enter a number");
				Long number = scr.nextLong();
				contactMap.put(name, number);
				System.out.println();
				System.out.println();
				break;

			case 2 :
				System.out.println("Enter name of person");
				name = scr.next();
				if(contactMap.containsKey(name))
					System.out.println(" Name :  "+name+" Number :"+contactMap.get(name));
				else
					System.out.println("No Contact available on given name");
				
				System.out.println();
				System.out.println();
				break;
		
			case 3 :
				System.out.println("==== Contact Details =====");
				for(Map.Entry<String, Long> entry:contactMap.entrySet())
					System.out.println(" Name :  "+entry.getKey() +" Number :"+entry.getValue());
				System.out.println();
				System.out.println();
				break;
				
			case 4 :
				System.out.println("Enter name of person");
				name = scr.next();
				if(contactMap.containsKey(name)) {
					System.out.println("Enter a number");
					number = scr.nextLong();
					contactMap.put(name, number);
				}else 
					System.out.println("No Contact available on given name");
				
				System.out.println();
				System.out.println();
				break;
				
			case 5 :System.exit(0);
			default: System.out.println("Invalid Chioce. Please choose correct option ");
					break;
			}
		}
	}
}
