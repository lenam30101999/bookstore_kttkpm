package com.bookstore.pttkht.controller.impl;

import com.bookstore.pttkht.controller.dao.OrderDAO;
import com.bookstore.pttkht.model.Item;
import com.bookstore.pttkht.model.Order;

import java.sql.*;

public class OrderDAOImpl extends ConnectionDAO implements OrderDAO {

    public void addOrder(Order order) throws SQLException {
        String sql = "INSERT INTO pttkht_btl.Cart(totalQuantity) VALUES (?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, order.getCart().getTotalQuantity());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO: Get customerId
        int customerId = order.getCustomer().getCustID();
        int cartID = getNewOrderId();

        String shipmentInsertSql = "INSERT INTO Shipment VALUES (null, 10000.0)";
        Statement statement = connection.createStatement();
        statement.execute(shipmentInsertSql, Statement.RETURN_GENERATED_KEYS);

        ResultSet generatedKeys = statement.getGeneratedKeys();
        int shipmentKey = 0;
        if (generatedKeys.next()) {
            shipmentKey = generatedKeys.getInt(1);
        }

        int shipID = getNewShipmentId();

        String itemInsertSql = "INSERT INTO pttkht_btl.Item(`BookID`, `CartID`, `Name`, `Quantity`) VALUES (?, ?, ?, ?)";
        if (order.getCart().getItems() != null){
            for (Item item : order.getCart().getItems()){
                PreparedStatement psmt = connection.prepareStatement(itemInsertSql);
                psmt.setInt(1, item.getBook().getBookID());
                psmt.setInt(2, cartID);
                psmt.setString(3, item.getName());
                psmt.setInt(4, item.getQuantity());
                psmt.executeUpdate();
            }
        }else System.out.println("ZERO: " + 0);

        String paymentInsertSql = "INSERT INTO Payment VALUES (0, ?, ?, ?)";
        PreparedStatement psmt = connection.prepareStatement(paymentInsertSql, Statement.RETURN_GENERATED_KEYS);
        psmt.setInt(1, shipID);
        psmt.setInt(2, cartID);
        psmt.setDouble(3, order.getPrice());
        psmt.execute();

        generatedKeys = psmt.getGeneratedKeys();
        int paymentKey = 0;
        if (generatedKeys.next()) {
            paymentKey = generatedKeys.getInt(1);
        }

        long currentDate = new java.util.Date().getTime();

		String orderInsertSql = "INSERT INTO `Order` VALUES (null, ?, ?, ?, ?, ?,?)";
        psmt = connection.prepareStatement(orderInsertSql);
        psmt.setInt(1, paymentKey);
        psmt.setInt(2, customerId);
        psmt.setInt(3, shipmentKey);
        psmt.setInt(4, cartID);
        psmt.setDate(5, new Date(currentDate));
        psmt.setDouble(6, order.getPrice());
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

    private int getNewOrderId(){
        String sql = "SELECT CartID FROM pttkht_btl.Cart WHERE CartID IN (SELECT MAX(CartID) FROM pttkht_btl.Cart)";
        ResultSet rs = null;
        int cartID = 0;
        try {
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
          rs = preparedStatement.executeQuery(sql);
          while (rs.next()) {
            cartID = rs.getInt("CartID");
          }
        } catch (SQLException e) {
          e.printStackTrace();
        }
        return cartID;
    }

    private int getNewShipmentId(){
        String sql = "SELECT ShipID FROM pttkht_btl.Shipment WHERE ShipID IN (SELECT MAX(ShipID) FROM pttkht_btl.Shipment)";
        ResultSet rs = null;
        int shipID = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery(sql);
            while (rs.next()) {
                shipID = rs.getInt("ShipID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shipID;
    }

}