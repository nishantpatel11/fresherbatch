package com.train.oops.concept;

final public class Singleton {

	private static Singleton singleton;

	private Singleton() {
		super();
	}

	 public static synchronized Singleton getInstance() {
		 if(singleton != null)
			 return singleton;
		 
		 return new Singleton();
	 }
}
