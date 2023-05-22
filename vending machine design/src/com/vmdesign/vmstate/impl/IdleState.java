package com.vmdesign.vmstate.impl;

import java.util.ArrayList;
import java.util.List;

import com.vmdesign.Coin;
import com.vmdesign.Item;
import com.vmdesign.VendingMachine;
import com.vmdesign.vmstate.State;

public class IdleState implements State {

	public IdleState() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public IdleState(VendingMachine vendingMachine) {
		super();
		// TODO Auto-generated constructor stub
		vendingMachine.setCoins(new ArrayList<>());
	}
	

	@Override
	public void insertCashBtn(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Idle state insertCashBtn");
		vendingMachine.setState(new HasMoneyState());
	}

	@Override
	public void insertCash(VendingMachine vendingMachine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

	@Override
	public void productSelectionStart(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

	@Override
	public void selectProductBtn(VendingMachine vendingMachine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

	@Override
	public List<Coin> refundBtn(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

	@Override
	public Item dispatchProduct(VendingMachine vendingMachine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

	@Override
	public void updateVendingMachine(VendingMachine vendingMachine, Item item, int code) {
		// TODO Auto-generated method stub
		System.out.println("Idle state updateInventory");
	}
	
}
