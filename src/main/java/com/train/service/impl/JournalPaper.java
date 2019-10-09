package com.train.service.impl;

public class JournalPaper extends WrittenItem{

	
	private Integer year_Of_Publish;

	@Override
	public void print() {
	
		String details = "Identification Number "+getIdentificaitionNumber() +"\n"
				+ " Title "+ getTitle() +"\n"
				+ " Author "+getAuthor() +"\n"
				+ " Year of Publish "+year_Of_Publish +"\n"
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
