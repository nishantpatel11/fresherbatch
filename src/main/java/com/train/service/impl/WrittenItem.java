package com.train.service.impl;

public abstract class WrittenItem extends Item{

	private String author;


	public abstract void print();

	public abstract void checkIn();

	@Override
	public void checkOut() {
		
	}

	@Override
	public abstract void addItem();
	
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
