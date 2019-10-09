package com.train.service.impl;

public abstract class MediaItem extends Item{
	
	private Integer runtime;

	public abstract void print();

	@Override
	public void checkIn() {
		
	}

	@Override
	public void checkOut() {
		
	}

	@Override
	public void addItem() {
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	
	
}
