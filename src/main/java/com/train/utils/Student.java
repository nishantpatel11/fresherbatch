package com.train.utils;

public class Student {
	
	private String name;
	private Subject english;
	private Subject science;
	private Subject math;
	

	public Student() {
		super();
	}

	
	
	public Student(String name, Subject english, Subject science, Subject math) {
		super();
		this.name = name;
		this.english = english;
		this.science = science;
		this.math = math;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Subject getEnglish() {
		return english;
	}



	public void setEnglish(Subject english) {
		this.english = english;
	}



	public Subject getScience() {
		return science;
	}



	public void setScience(Subject science) {
		this.science = science;
	}



	public Subject getMath() {
		return math;
	}



	public void setMath(Subject math) {
		this.math = math;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", english=" + english + ", science=" + science + ", math=" + math + "]";
	}
	
	
	
}
