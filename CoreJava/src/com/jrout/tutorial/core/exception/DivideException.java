package com.jrout.tutorial.core.exception;

public class DivideException extends Exception {
	private String message;
	public DivideException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Exception :" + message;
	}
}
