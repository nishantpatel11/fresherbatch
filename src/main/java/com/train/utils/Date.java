package com.train.utils;

public class Date {

	private int day;
	private int month;
	private int year;
	
	
	
	public Date() {
		super();
	}



	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}
	

	public void print() {
		System.out.print(this.day+"/"+this.month+"/"+this.year);
		
	}


	public void swap(Date date1,Date date2) {
		Date temp = date1;
		date1 = date2;
		date2 = temp;
	}
	

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
}
