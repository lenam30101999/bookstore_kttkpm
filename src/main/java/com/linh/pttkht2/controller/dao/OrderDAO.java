package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Order;

import java.sql.SQLException;

public interface OrderDAO {

	void addOrder(Order order) throws SQLException;

	Order getOrder();

	void getAllOrder();

	void update();

	void delete();

}