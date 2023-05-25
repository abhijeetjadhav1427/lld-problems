package com.atm.state.impl;

import com.atm.ATM;
import com.atm.Card;
import com.atm.state.State;

public class DisplayBalanceState extends State {

	@Override
	public void displayBalance(ATM atm, Card card) {
		// TODO Auto-generated method stub
		System.out.println("Your Balance is: " + card.getBankBalance());
		exit(atm);
	}

	@Override
	public void exit(ATM atm) {
		// TODO Auto-generated method stub
		super.exit(atm);
	}

	@Override
	public void returnCard() {
		// TODO Auto-generated method stub
		super.returnCard();
	}
	
}
