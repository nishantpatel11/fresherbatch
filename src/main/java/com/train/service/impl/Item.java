package com.train.service.impl;

public abstract class Item {
	
	private Integer identificaitionNumber;
	private String title;
	private Integer numberOfCopies;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Integer identificaitionNumber, String title, Integer numberOfCopies) {
		super();
		this.identificaitionNumber = identificaitionNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	public Integer getIdentificaitionNumber() {
		return identificaitionNumber;
	}
	public void setIdentificaitionNumber(Integer identificaitionNumber) {
		this.identificaitionNumber = identificaitionNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getNumberOfCopies() {
		return numberOfCopies;
	}
	
	
	public void setNumberOfCopies(Integer numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificaitionNumber == null) ? 0 : identificaitionNumber.hashCode());
		result = prime * result + ((numberOfCopies == null) ? 0 : numberOfCopies.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identificaitionNumber == null) {
			if (other.identificaitionNumber != null)
				return false;
		} else if (!identificaitionNumber.equals(other.identificaitionNumber))
			return false;
		if (numberOfCopies == null) {
			if (other.numberOfCopies != null)
				return false;
		} else if (!numberOfCopies.equals(other.numberOfCopies))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Item [identificaitionNumber=" + identificaitionNumber + ", title=" + title + ", numberOfCopies="
				+ numberOfCopies + "]";
	}
	
	
	public abstract void print();
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();
	
	
}
