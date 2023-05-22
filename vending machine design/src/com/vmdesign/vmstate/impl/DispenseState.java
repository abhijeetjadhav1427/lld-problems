package com.vmdesign.vmstate.impl;

import java.util.List;

import com.vmdesign.Coin;
import com.vmdesign.Item;
import com.vmdesign.VendingMachine;
import com.vmdesign.vmstate.State;

public class DispenseState implements State {

	@Override
	public void insertCashBtn(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
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
		System.out.println("dispense state dispatch product");
		vendingMachine.setState(new IdleState());
		return null;
	}

	@Override
	public void updateVendingMachine(VendingMachine vendingMachine, Item item, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

}
