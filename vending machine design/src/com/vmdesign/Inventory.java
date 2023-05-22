package com.vmdesign;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<ItemShelf> itemShelfs;

	public Inventory(int shelfCount) {
		super();
		this.itemShelfs = new ArrayList<>(shelfCount);
	}

	public List<ItemShelf> getItemShelfs() {
		return itemShelfs;
	}

	public void setItemShelfs(List<ItemShelf> itemShelfs) {
		this.itemShelfs = itemShelfs;
	}
	
	public Item getItem(int code) {
		return null;
	}
	
	public void addItem(Item item, int code) {
		
	}
	
	public void updateSoldOutItem(int code) {
		
	}

}
