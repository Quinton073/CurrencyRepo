package com.trainer.currencyrest.exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 * runtime exceptions have serial id
	 * Prepare the json response
	 * map it to the exception so that you tell jersy that hey, when this exception is thrown return this json response
	 */
	private static final long serialVersionUID = 6708747487387683174L;

	public DataNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
