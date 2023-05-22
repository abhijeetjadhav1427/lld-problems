package com.vmdesign.vmstate;

import java.util.List;

import com.vmdesign.Coin;
import com.vmdesign.Item;
import com.vmdesign.VendingMachine;

public interface State {
	public void insertCashBtn(VendingMachine vendingMachine) throws Exception;

	public void insertCash(VendingMachine vendingMachine, Coin coin) throws Exception;

	public void productSelectionStart(VendingMachine vendingMachine) throws Exception;

	public void selectProductBtn(VendingMachine vendingMachine, int code) throws Exception;

	public List<Coin> refundBtn(VendingMachine vendingMachine) throws Exception;

	public Item dispatchProduct(VendingMachine vendingMachine, int code) throws Exception;

	public void updateVendingMachine(VendingMachine vendingMachine, Item item, int code) throws Exception;
}