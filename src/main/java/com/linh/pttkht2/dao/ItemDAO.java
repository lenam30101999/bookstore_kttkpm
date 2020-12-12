package com.linh.pttkht2.dao;

import com.linh.pttkht2.model.Item;

import java.util.List;

public interface ItemDAO {

	void addItem(Item i);

	List<Item> getItems();

	Item getItem(int id);

	void update(Item i);

	void delete(int id);

}