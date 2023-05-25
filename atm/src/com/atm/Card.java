package com.atm;

public class Card {
	private int cardNumber;
	private int cvv;
	private int expiryDate;
	static int PIN_NUMBER = 112211;
	private BankAccount bankAccount;

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public boolean isCorrectPINEntered(int pin) {

		if (pin == PIN_NUMBER) {
			return true;
		}
		return false;
	}

	public int getBankBalance() {
		return bankAccount.getBankBalance();
	}

	public void deductBankBalance(int amount) {
		bankAccount.withdrawalBalance(amount);
	}
	
	
}
