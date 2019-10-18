package com.train.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.train.collection.model.Person;

public class ComparatorExample {

	public static void main(String[] args) {

		SortedSet<Person> personSet = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person person1, Person person2) {
				int num =  person1.getWeight().compareTo(person2.getWeight());
				return num == 0 ? person1.getHeight().compareTo(person2.getHeight()): num;
			}
		}); 
		
		personSet.add(new Person("Vinit", 65, 160));
		personSet.add(new Person("Rahul", 65, 190));
		personSet.add(new Person("Prashant", 65, 200));
		personSet.add(new Person("Vikas", 66, 150));
		
		Iterator<Person> treeset = personSet.iterator();
		while (treeset.hasNext()) {
			System.out.println(treeset.next());
		}
		System.out.println("============");
		
	}

}
