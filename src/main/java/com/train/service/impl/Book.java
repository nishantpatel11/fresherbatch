package com.train.service.impl;

public class Book extends WrittenItem {

	@Override
	public void print() {
		
		String details = "Identification Number "+getIdentificaitionNumber() +"\n"
				+ " Title "+ getTitle() +"\n"
				+ " Author "+getAuthor() +"\n"
				+ " Number of Copies "+getNumberOfCopies();
			
		System.out.println(details);
	}

	@Override
	public void checkIn() {
		
	}

	@Override
	public void addItem() {
		
	}

}
