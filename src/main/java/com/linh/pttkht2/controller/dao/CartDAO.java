package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Cart;
import com.linh.pttkht2.model.Item;

import java.util.List;

public interface CartDAO {

	Cart add(Item c);

	void save(Cart cart);

	Cart get();

	Cart get(int id);

	void update(Cart c);

	void delete(int id);

}