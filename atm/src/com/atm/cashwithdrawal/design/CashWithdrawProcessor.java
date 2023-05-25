package com.atm.cashwithdrawal.design;

import com.atm.ATM;

public abstract class CashWithdrawProcessor {
	private CashWithdrawProcessor nextCashWithdrawProcessor;

	public CashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
		this.nextCashWithdrawProcessor = nextCashWithdrawProcessor;
	}
	
	public void withdrawAmount(ATM atm, int remainingAmount) {
		if(this.nextCashWithdrawProcessor != null) {
			this.nextCashWithdrawProcessor.withdrawAmount(atm, remainingAmount);
		}
	}
}
