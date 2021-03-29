package com.bookstore.pttkht.controller.dao;

import com.bookstore.pttkht.model.Order;

import java.sql.SQLException;

public interface OrderDAO {

	void addOrder(Order order) throws SQLException;

	Order getOrder();

	void getAllOrder();

	void update();

	void delete();

}