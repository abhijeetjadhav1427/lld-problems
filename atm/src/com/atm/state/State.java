package com.atm.state;

import com.atm.ATM;
import com.atm.Card;
import com.atm.enums.TransactionType;

public abstract class State {
	public void insertCard(ATM atm, Card card) {
		System.out.println("OOPS!! Something went wrong");
	}

	public void authenticatePin(ATM atm, Card card, int pin) {
		System.out.println("OOPS!! Something went wrong");
	}
	
	public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
		System.out.println("OOPS!! Something went wrong");
	}

	public void cashWithdrawal(ATM atm, Card card, int amount) {
		System.out.println("OOPS!! Something went wrong");
	}

	public void displayBalance(ATM atm, Card card) {
		System.out.println("OOPS!! Something went wrong");
	}

	public void exit(ATM atm) {
		System.out.println("OOPS!! Something went wrong");
	}

	public void returnCard() {
		System.out.println("OOPS!! Something went wrong");
	}
}