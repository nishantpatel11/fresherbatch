package com.train.service.impl;

public class CD extends MediaItem {

	private String artist;
	private String genre;

	@Override
	public void print() {
		String details = "Identification Number "+getIdentificaitionNumber() +"\n"
				+ " Title "+ getTitle() +"\n"
				+ " Artist "+artist +"\n"
				+ " Genre "+genre +"\n"
				+ " Number of Copies "+getNumberOfCopies()  +"\n"
				+ " Runtime " +getRuntime();

		System.out.println(details);

	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	
}
