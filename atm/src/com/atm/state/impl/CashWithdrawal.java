package com.atm.state.impl;

import com.atm.ATM;
import com.atm.Card;
import com.atm.cashwithdrawal.design.CashWithdrawProcessor;
import com.atm.cashwithdrawal.design.FiveHundredWithdrawProcessor;
import com.atm.cashwithdrawal.design.OneHundredWithdrawProcessor;
import com.atm.cashwithdrawal.design.TwoThousandWithdrawProcessor;
import com.atm.state.State;

public class CashWithdrawal extends State {

	@Override
	public void cashWithdrawal(ATM atm, Card card, int amount) {
		if (atm.getAtmBalance() < amount) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        } else if (card.getBankBalance() < amount) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        } else {

            card.deductBankBalance(amount);
            atm.deductATMBalance(amount);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdrawAmount(atm, amount);
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
