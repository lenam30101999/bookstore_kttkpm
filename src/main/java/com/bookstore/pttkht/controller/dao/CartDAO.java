package com.bookstore.pttkht.controller.dao;

import com.bookstore.pttkht.model.Cart;
import com.bookstore.pttkht.model.Item;

public interface CartDAO {

	void save(Cart cart);

	Cart add(Item item, int quantity);

	Cart get();

	Cart get(int id);

	void update(Cart c);

	void delete(int id);

}