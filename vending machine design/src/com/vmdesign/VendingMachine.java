package com.vmdesign;

import java.util.List;

import com.vmdesign.vmstate.State;
import com.vmdesign.vmstate.impl.IdleState;

public class VendingMachine {
	private State state;
	private Inventory inventory;
	private List<Coin> coins;

	public VendingMachine() {
		super();
		// TODO Auto-generated constructor stub
		this.state = new IdleState();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public List<Coin> getCoins() {
		return coins;
	}

	public void setCoins(List<Coin> coins) {
		this.coins = coins;
	}

}
