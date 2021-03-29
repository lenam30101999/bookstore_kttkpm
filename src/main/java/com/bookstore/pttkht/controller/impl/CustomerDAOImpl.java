package com.bookstore.pttkht.controller.impl;

import com.bookstore.pttkht.controller.dao.CustomerDAO;
import com.bookstore.pttkht.model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAOImpl extends ConnectionDAO implements CustomerDAO {

	private static final String check = "select * from Customer where username = ? and password = ?";
	public Customer checkLogin(Customer customerCheck) {
		Customer customer = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(check);
			preparedStatement.setString(1, customerCheck.getUsername());
			preparedStatement.setString(2, customerCheck.getPassword());
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("CustID");
				String phoneNum = rs.getString("PhoneNum");
				String firstname = rs.getString("FirstName");
				String middlename = rs.getString("MiddleName");
				String lastname = rs.getString("LastName");
				String city = rs.getString("City");
				String street = rs.getString("Street");
				String username = rs.getString("username");
				String password = rs.getString("password");

				customer= new Customer(id,phoneNum,firstname,middlename,lastname,city,street,username,password,null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}

	public void addCustomer(Customer customer) {
		// TODO - implement CustomerDAOImpl.addCustomer
		String sql = "INSERT INTO `pttkht_btl`.`customer` (`PhoneNum`, `FirstName`, `MiddleName`, `LastName`, `City`, `Street`, `Username`, `Password`) " +
				"VALUES (?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, customer.getPhoneNum());
			ps.setString(2, customer.getFirstName());
			ps.setString(3, customer.getMiddleName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getCity());
			ps.setString(6, customer.getStreet());
			ps.setString(7, customer.getUsername());
			ps.setString(8, customer.getPassword());
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void getCustomer() {
		// TODO - implement CustomerDAOImpl.getCustomer
		throw new UnsupportedOperationException();
	}

	public void getAllCustomer() {
		// TODO - implement CustomerDAOImpl.getAllCustomer
		throw new UnsupportedOperationException();
	}

	public void update() {
		// TODO - implement CustomerDAOImpl.update
		throw new UnsupportedOperationException();
	}

	public void delete() {
		// TODO - implement CustomerDAOImpl.delete
		throw new UnsupportedOperationException();
	}

}