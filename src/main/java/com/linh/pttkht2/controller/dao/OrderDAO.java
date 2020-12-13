package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Order;

public interface OrderDAO {

	void addOrder();

	Order getOrder();

	void getAllOrder();

	void update();

	void delete();

}