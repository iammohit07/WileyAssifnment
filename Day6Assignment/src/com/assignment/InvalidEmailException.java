package com.assignment;

public class InvalidEmailException extends Exception {

	String message;

	public InvalidEmailException() {
		message = "Invalid Email Exception Occurred";
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Email address is not in correct format";
	}

}
