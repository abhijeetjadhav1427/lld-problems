package com.atm.cashwithdrawal.design;

import com.atm.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor {

	public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
		super(nextCashWithdrawProcessor);
	}

	@Override
	public void withdrawAmount(ATM atm, int remainingAmount) {
		int required =  remainingAmount/2000;
		int balance = remainingAmount%2000;
		
		if(required <= atm.getNoOfTwoThousandNotes()) {
			atm.deductTwoThousandNotes(required);
		}
		else if(required > atm.getNoOfTwoThousandNotes()) {
			atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
			balance = balance + (required-atm.getNoOfTwoThousandNotes()) * 2000;
        }
		
		if(balance != 0) {
			super.withdrawAmount(atm, balance);
		}
	}
	
}
