package com.train.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class HashsetLinkExample {

	public static void main(String [] args) {
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Volvo");
		hashSet.add("Cisco");
		hashSet.add("Boeing");
		hashSet.add("Micro");
		hashSet.add("Sapient");
		
		
		System.out.println("============");
		System.out.println("====== HashSet List ======");
		System.out.println("============");
		Iterator<String> li = hashSet.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		
		System.out.println("============");
		System.out.println("====== LinkedHashSet ======");
		System.out.println("============");
		Set<String> linkHashSet = new LinkedHashSet<String>();
		linkHashSet.add("Volvo");
		linkHashSet.add("Cisco");
		linkHashSet.add("Boeing");
		linkHashSet.add("Micro");
		linkHashSet.add("Sapient");
		Iterator<String> lihs = linkHashSet.iterator();
		while (lihs.hasNext()) {
			System.out.println(lihs.next());
		}
		System.out.println("============");
		
	}
}
