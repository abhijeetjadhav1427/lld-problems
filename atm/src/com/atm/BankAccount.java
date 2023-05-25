package com.atm;

public class BankAccount {
	private int accountNumber;
	private int bankBalance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(int getBankBalance) {
		this.bankBalance = getBankBalance;
	}

	public void withdrawalBalance(int amount) {
		bankBalance = bankBalance - amount;
	}

}
