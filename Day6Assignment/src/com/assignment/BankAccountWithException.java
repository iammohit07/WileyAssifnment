package com.assignment;

public class BankAccountWithException {

	int accountId;
	String AccountHolderName;
	AccountType accountType;

	public BankAccountWithException(int accountId, String accountHolderName, AccountType accountType) {
		this.accountId = accountId;
		this.AccountHolderName = accountHolderName;
		this.accountType = accountType;
	}

	public double calculateTotalInterest(double amount, int years) throws DepositAmountException {
		if (amount < 0) {
			throw new DepositAmountException();
		}
		return amount * years * accountType.getInterestrate() / 100;

	}

	public static void main(String[] args) {

		try {

			BankAccountWithException e = new BankAccountWithException(1, "Mohit", AccountType.SAVINGS);
			BankAccountWithException e1 = new BankAccountWithException(2, "Pankaj", AccountType.CURRENT);

			System.out.println(e.calculateTotalInterest(-4000, 2));

			System.out.println(e1.calculateTotalInterest(-10000, 2));

		} catch (DepositAmountException e2) {
			System.out.println(e2.getMessage());

		}

	}

}