package com.linh.pttkht2.dao;

import com.linh.pttkht2.model.Cart;

import java.util.List;

public interface CartDAO {

	void add(Cart c);

	List<Cart> get();

	Cart get(int id);

	void update(Cart c);

	void delete(int id);

}