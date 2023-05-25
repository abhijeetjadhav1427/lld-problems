package com.atm.state.impl;

import com.atm.ATM;
import com.atm.Card;
import com.atm.state.State;

public class HasCard extends State {

	@Override
	public void authenticatePin(ATM atm, Card card, int pin) {
		// TODO Auto-generated method stub
		boolean isAuthenticated = card.isCorrectPINEntered(pin);
		
		if(isAuthenticated) {
			atm.setCurrentATMState(new SelectOperationState());
		}
		else {
			System.out.println("Invalid PIN Number");
            exit(atm);
		}
	}

	@Override
	public void exit(ATM atm) {
		// TODO Auto-generated method stub
		this.returnCard();
		atm.setCurrentATMState(new Idle());
	}

	@Override
	public void returnCard() {
		// TODO Auto-generated method stub
		System.out.println("Please collect your card");
	}
	
}
