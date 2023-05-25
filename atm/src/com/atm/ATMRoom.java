package com.atm;

import com.atm.enums.TransactionType;

public class ATMRoom {
	ATM atm;
	User user;

	public static void main(String args[]) {

		ATMRoom atmRoom = new ATMRoom();
		atmRoom.initialize();

		atmRoom.atm.printCurrentATMStatus();
		atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
		atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
		atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.card,
				TransactionType.CASH_WITHDRAWAL);
		atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2700);
		atmRoom.atm.printCurrentATMStatus();

	}

	private void initialize() {
		atm = ATM.getATMObject();
		atm.setAtmBalance(3500, 1, 2, 5);

		// create User
		this.user = createUser();
	}

	private User createUser() {

		User user = new User();
		user.setCard(createCard());
		return user;
	}

	private Card createCard() {

		Card card = new Card();
		card.setBankAccount(createBankAccount());
		return card;
	}

	private BankAccount createBankAccount() {

		BankAccount bankAccount = new BankAccount();
		bankAccount.setBankBalance(3000);

		return bankAccount;

	}

}
