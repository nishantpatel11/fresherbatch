package com.train.exceptionhandler;

public class TaxNotEligibleException extends Exception{

	private static final long serialVersionUID = 1623784524649071478L;

	public TaxNotEligibleException() {
		super();
	}

	public TaxNotEligibleException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TaxNotEligibleException(String message, Throwable cause) {
		super(message, cause);
	}

	public TaxNotEligibleException(String message) {
		super(message);
	}

	public TaxNotEligibleException(Throwable cause) {
		super(cause);
	}

	
}
