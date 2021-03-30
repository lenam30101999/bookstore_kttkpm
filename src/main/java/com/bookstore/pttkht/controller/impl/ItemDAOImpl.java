package com.bookstore.pttkht.controller.impl;

import com.bookstore.pttkht.controller.dao.ItemDAO;
import com.bookstore.pttkht.model.Item;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl extends ConnectionDAO implements ItemDAO {

	public void addItem(Item i) {
		// TODO - implement ItemDAOImpl.addItem
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Item> getItems() {
		//TODO: Remove Test code
		List<Item> items = new ArrayList<>();
		ResultSet rs = null;
		try {
			String strQuery = "select id, name, price, Qty from kttkpm1.item";
			PreparedStatement preparedStatement = connection.prepareStatement(strQuery);
			rs = preparedStatement.executeQuery(strQuery);
			System.out.println(strQuery);

			while (rs.next()) {
				int itemId = rs.getInt("id");
				String name = rs.getString("name");
				long price =rs.getInt("price");
				int quantity = rs.getInt("Qty");

				Item item =new Item();
				item.setItemID(itemId);
				item.setName(name);
				item.setPrice(price);
				item.setQuantity(quantity);

				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

	@Override
	public Item getItem(int id) {
		Item item = null;
		try {
			String QUERY_GET_ITEM = "select `Name`, `Qty`, `price` from item where Id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_ITEM);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				id = rs.getInt("id");
				String name = rs.getString("Name");
				int qty = rs.getInt("Qty");
				int price = rs.getInt("price");

				item= new Item(id, name, qty, price, null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return item;
	}

}