package com.train.service.impl;

public class Video extends MediaItem{

	private String director;
	private String genre;
	private Integer year_released;

	
	
	@Override
	public void print() {
		
		String details = "Identification Number "+getIdentificaitionNumber() +"\n"
				+ " Title "+ getTitle() +"\n"
				+ " Number of Copies "+getNumberOfCopies()  +"\n"
				+ " Director "+director +"\n"
				+ " Genre "+genre +"\n"
				+ " Year of Released "+year_released +"\n"
				+ " Runtime " +getRuntime();

		System.out.println(details);	
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public Integer getYear_released() {
		return year_released;
	}



	public void setYear_released(Integer year_released) {
		this.year_released = year_released;
	}
	
	
	
	
}
