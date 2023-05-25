package com.atm.state.impl;

import com.atm.ATM;
import com.atm.Card;
import com.atm.enums.TransactionType;
import com.atm.state.State;

public class SelectOperationState extends State {

	@Override
	public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
		// TODO Auto-generated method stub
		switch (transactionType) {
		case CASH_WITHDRAWAL:
			atm.setCurrentATMState(new CashWithdrawal());
			break;
		case BALANCE_CHECK:
			atm.setCurrentATMState(new DisplayBalanceState());
			break;
		default:
			System.out.println("Invalid Operation!!");
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
