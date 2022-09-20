package com.assignment;

public enum AccountType {
	SAVINGS(50), CURRENT(20);

	double interest;

	AccountType(double interest) {
		this.interest = interest;

	}

	public double getInterestrate() {
		return this.interest;
	}
}
