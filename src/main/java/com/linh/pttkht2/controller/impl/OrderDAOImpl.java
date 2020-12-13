package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.OrderDAO;
import com.linh.pttkht2.model.Item;
import com.linh.pttkht2.model.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl extends ConnectionDAO implements OrderDAO {

    public void addOrder(Order order) throws SQLException {
        String paymentInsertSql = "INSERT INTO Payment VALUES (0, null, null, ?)";
        PreparedStatement psmt = connection.prepareStatement(paymentInsertSql, Statement.RETURN_GENERATED_KEYS);
        psmt.setDouble(1, order.getPrice());
        psmt.execute();

        ResultSet generatedKeys = psmt.getGeneratedKeys();
        int paymentKey = 0;
        if (generatedKeys.next()) {
            paymentKey = generatedKeys.getInt(1);
        }

        //TODO: Get customerId
        int customerId = order.getCustomer().getCustID();

        String shipmentInsertSql = "INSERT INTO Shipment VALUES (null, 10000.0, null)";
        Statement statement = connection.createStatement();
        statement.execute(shipmentInsertSql, Statement.RETURN_GENERATED_KEYS);

        generatedKeys = statement.getGeneratedKeys();
        int shipmentKey = 0;
        if (generatedKeys.next()) {
            shipmentKey = generatedKeys.getInt(1);
        }

        long currentDate = new java.util.Date().getTime();

		String orderInsertSql = "INSERT INTO `Order` VALUES (null, ?, ?, ?, ?, ?)";
        psmt = connection.prepareStatement(orderInsertSql);
        psmt.setInt(1, paymentKey);
        psmt.setInt(2, customerId);
        psmt.setInt(3, shipmentKey);
        psmt.setDate(4, new Date(currentDate));
        psmt.setDouble(5, order.getPrice());
        psmt.execute();
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