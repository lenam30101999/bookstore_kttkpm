package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.ItemDAO;
import com.linh.pttkht2.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl extends ConnectionDAO implements ItemDAO {

	public void addItem(Item i) {
		// TODO - implement ItemDAOImpl.addItem
		throw new UnsupportedOperationException();
	}

	public List<Item> getItems() {
		//TODO: Remove Test code
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "Da`o", 1000));
		items.add(new Item(2, "XS Max", 1000));
		return items;
	}

	public Item getItem(int id) {
		// TODO - implement ItemDAOImpl.getItem
		throw new UnsupportedOperationException();
	}

	public void update(Item i) {
		// TODO - implement ItemDAOImpl.update
		throw new UnsupportedOperationException();
	}

	public void delete(int id) {
		// TODO - implement ItemDAOImpl.delete
		throw new UnsupportedOperationException();
	}

}