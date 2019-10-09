package com.train.exceptionhandler;

public class CountryNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6563289798470886866L;

	public CountryNotValidException() {
		super();
	}

	public CountryNotValidException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CountryNotValidException(String message, Throwable cause) {
		super(message, cause);
	}

	public CountryNotValidException(String message) {
		super(message);
	}

	public CountryNotValidException(Throwable cause) {
		super(cause);
	}

	
}
