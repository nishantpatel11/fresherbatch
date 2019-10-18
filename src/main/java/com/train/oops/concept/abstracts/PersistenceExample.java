package com.train.oops.concept.abstracts;

public class PersistenceExample {

	public static void main(String[] args) {
		
		// if presistence object hold FilePersistence Object then File persist method will execute
		Persistence pre = new FilePersistence(); 
		pre.presist();
		
		// if presistence object hold database object then database persist method will execute
		pre = new DatabasePersistence(); 
		pre.presist();
	
	}

}
