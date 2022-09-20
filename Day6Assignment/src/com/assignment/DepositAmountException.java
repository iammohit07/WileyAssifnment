package com.assignment;

public class DepositAmountException extends Exception {
	String Message;

	DepositAmountException() {
		super();
		Message = "Amount Must be Positive";
	}

	@Override
	public String getMessage() {

		return Message;
	}

}