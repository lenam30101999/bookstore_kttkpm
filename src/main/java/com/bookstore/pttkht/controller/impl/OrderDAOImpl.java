package com.bookstore.pttkht.controller.impl;

import com.bookstore.pttkht.controller.dao.OrderDAO;
import com.bookstore.pttkht.model.Item;
import com.bookstore.pttkht.model.Order;

import java.sql.*;

public class OrderDAOImpl extends ConnectionDAO implements OrderDAO {

    public void addOrder(Order order) throws SQLException {
        String sql = "INSERT INTO Cart(TotalQty) VALUES (?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, order.getCart().getTotalQuantity());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO: Get customerId
        int customerId = order.getCustomer().getId();
        int cartID = getNewOrderId();

        String itemInsertSql = "INSERT INTO cart_Iiem(CartId, ItemId) VALUES (?, ?)";
        if (order.getCart().getItems() != null){
            for (Item item : order.getCart().getItems()){
                PreparedStatement psmt = connection.prepareStatement(itemInsertSql);
                psmt.setInt(1, cartID);
                psmt.setInt(2, item.getQuantity());
                psmt.executeUpdate();
            }
        }else System.out.println("ZERO: " + 0);

        String paymentInsertSql = "INSERT INTO Payment(CartId, Price) VALUES (?, ?)";
        PreparedStatement psmt = connection.prepareStatement(paymentInsertSql, Statement.RETURN_GENERATED_KEYS);
        psmt.setInt(1, cartID);
        psmt.setDouble(2, order.getPrice());
        psmt.execute();

        ResultSet generatedKeys = psmt.getGeneratedKeys();
        int paymentKey = 0;
        if (generatedKeys.next()) {
            paymentKey = generatedKeys.getInt(1);
        }

        long currentDate = new java.util.Date().getTime();

		String orderInsertSql = "INSERT INTO `order`(CartId, PaymentId, CustomerId, Date, TotalPrice) VALUES (?, ?, ?, ?, ?)";
        psmt = connection.prepareStatement(orderInsertSql);
        psmt.setInt(1, cartID);
        psmt.setInt(2, paymentKey);
        psmt.setInt(3, customerId);
        psmt.setDate(4, new Date(currentDate));
        psmt.setDouble(5, order.getPrice());
        psmt.execute();
    }

    public Order getOrder() {
        // TODO - implement OrderDAOImpl.getOrder
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

    private int getNewOrderId(){
        String sql = "SELECT Id FROM Cart WHERE Id IN (SELECT MAX(Id) FROM Cart)";
        ResultSet rs = null;
        int cartID = 0;
        try {
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
          rs = preparedStatement.executeQuery(sql);
          while (rs.next()) {
            cartID = rs.getInt("Id");
          }
        } catch (SQLException e) {
          e.printStackTrace();
        }
        return cartID;
    }

}