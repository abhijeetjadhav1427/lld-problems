package com.atm.cashwithdrawal.design;

import com.atm.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor {

	public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
		super(nextCashWithdrawProcessor);
	}

	@Override
	public void withdrawAmount(ATM atm, int remainingAmount) {
		int required =  remainingAmount/100;
		int balance = remainingAmount%100;
		
		if(required <= atm.getNoOfOneHundredNotes()) {
			atm.deductOneHundredNotes(balance);
		}
		else if(required > atm.getNoOfOneHundredNotes()) {
			atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
			balance = balance + (required-atm.getNoOfOneHundredNotes()) * 100;
        }
		
		if(balance != 0) {
			super.withdrawAmount(atm, balance);
		}
	}

}
