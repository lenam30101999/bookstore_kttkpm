package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.OrderDAO;
import com.linh.pttkht2.model.Item;
import com.linh.pttkht2.model.Order;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl extends ConnectionDAO implements OrderDAO {

	public void addOrder() {
		// TODO - implement OrderDAOImpl.addOrder
		throw new UnsupportedOperationException();
	}

	public Order getOrder() {
		// TODO - implement OrderDAOImpl.getOrder
//		List<Item> items = new ArrayList<>();
//		ResultSet rs = null;
//		try {
//			String strQuery = "SELECT * FROM pttkht_btl.order;";
//			PreparedStatement preparedStatement = connection.prepareStatement(strQuery);
//			rs = preparedStatement.executeQuery(strQuery);
//			while (rs.next()) {
//				int bookId = rs.getInt("BookID");
//				String name = rs.getString("book_name");
//
//				items.add(item);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return items;
		throw new UnsupportedOperationException();
	}

	public void getAllOrder() {
		// TODO - implement OrderDAOImpl.getAllOrder
		throw new UnsupportedOperationException();
	}

	public void update() {
		// TODO - implement OrderDAOImpl.update
		throw new UnsupportedOperationException();
	}

	public void delete() {
		// TODO - implement OrderDAOImpl.delete
		throw new UnsupportedOperationException();
	}

}