package com.fakelook.main.exceptionhandler;

public class UserException extends RuntimeException {

	String message;
	
	public UserException(String message) {

		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}


 
	
}
