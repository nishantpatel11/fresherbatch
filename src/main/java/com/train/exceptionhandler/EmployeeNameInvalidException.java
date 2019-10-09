package com.train.exceptionhandler;

public class EmployeeNameInvalidException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8473335010767093654L;

	public EmployeeNameInvalidException() {
		super();
	}

	public EmployeeNameInvalidException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmployeeNameInvalidException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeeNameInvalidException(String message) {
		super(message);
	}

	public EmployeeNameInvalidException(Throwable cause) {
		super(cause);
	}

	
	
}
