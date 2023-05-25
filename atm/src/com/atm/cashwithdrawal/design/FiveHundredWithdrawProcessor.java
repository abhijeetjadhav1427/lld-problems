package com.atm.cashwithdrawal.design;

import com.atm.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor {

	public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
		super(nextCashWithdrawProcessor);
	}

	@Override
	public void withdrawAmount(ATM atm, int remainingAmount) {
		int required =  remainingAmount/500;
		int balance = remainingAmount%500;
		
		if(required <= atm.getNoOfFiveHundredNotes()) {
			atm.deductFiveHundredNotes(balance);
		}
		else if(required > atm.getNoOfFiveHundredNotes()) {
			atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
			balance = balance + (required-atm.getNoOfFiveHundredNotes()) * 500;
        }
		
		if(balance != 0) {
			super.withdrawAmount(atm, balance);
		}
	}

}
