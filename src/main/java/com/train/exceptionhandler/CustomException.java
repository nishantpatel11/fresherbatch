package com.train.exceptionhandler;

public class CustomException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3849279960728856060L;

	public CustomException() {
	}
	
	public CustomException(String message) {
		super(message);
	}

}
