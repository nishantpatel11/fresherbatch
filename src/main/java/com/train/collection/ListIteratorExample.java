package com.train.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String [] args) {

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Volvo");
		aList.add("Cisco");
		aList.add("Boeing");
		aList.add("Micro");
		aList.add("Sapient");

		
		System.out.println("============");
		ListIterator<String> li = aList.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("============");
		System.out.println("The ArrayList elements in the reverse direction are: ");
		System.out.println("============");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	
	
	
	}
}
