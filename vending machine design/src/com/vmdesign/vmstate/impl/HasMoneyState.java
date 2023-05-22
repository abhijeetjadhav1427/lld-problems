package com.vmdesign.vmstate.impl;

import java.util.List;

import com.vmdesign.Coin;
import com.vmdesign.Item;
import com.vmdesign.VendingMachine;
import com.vmdesign.vmstate.State;

public class HasMoneyState implements State {

	@Override
	public void insertCashBtn(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

	@Override
	public void insertCash(VendingMachine vendingMachine, Coin coin) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hasmoney state insertcash");
	}

	@Override
	public void productSelectionStart(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("has money state product selection start");
		vendingMachine.setState(new ProductSelectionState());
	}

	@Override
	public void selectProductBtn(VendingMachine vendingMachine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

	@Override
	public List<Coin> refundBtn(VendingMachine vendingMachine) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("has money state refund");
		vendingMachine.setState(new IdleState(vendingMachine));
		return vendingMachine.getCoins();
	}

	@Override
	public Item dispatchProduct(VendingMachine vendingMachine, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

	@Override
	public void updateVendingMachine(VendingMachine vendingMachine, Item item, int code) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("");
	}

}
