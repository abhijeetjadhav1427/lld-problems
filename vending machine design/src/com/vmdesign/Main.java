package com.vmdesign;

public class Main {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount(100);

		Thread t1 = new Thread(acc);
		Thread t2 = new Thread(acc);

		t1.setName("t1");
		t2.setName("t2");

		t1.start();
		t2.start();
	}
}

class BankAccount implements Runnable {
	private int balance;

	BankAccount(int balance) {
		this.balance = balance;
	}

	public void run() {
		makeWithdraw(75);
		if(balance < 0) {
			System.out.println("Money overdrawn!!.." + balance);
		}
	}

	public void makeWithdraw(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw!!");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount);
		}
		else {
			System.out.println("Sorry not enough balance for " + amount);
		}
	}
}