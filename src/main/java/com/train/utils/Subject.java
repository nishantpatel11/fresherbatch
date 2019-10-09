package com.train.utils;

public class Subject {

	private String subject;
	private int mark;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(String subject, int mark) {
		super();
		this.subject = subject;
		this.mark = mark;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}



	public String getResult(Subject sub1, Subject sub2, Subject sub3) {

		if(sub1.getMark()>60 && sub2.getMark()>60 && sub3.getMark()>60) 
			return "Passed";
		else if((sub1.getMark()>60 && sub2.getMark()>60) || (sub2.getMark()>60 && sub3.getMark()>60) ||  ( sub1.getMark()>60 && sub3.getMark()>60) ) 
			return "Promoted";
		else if(sub1.getMark()>60 || sub2.getMark()>60 || sub3.getMark()>60) 
			return "failed";	
		
		return null;
	}


}
