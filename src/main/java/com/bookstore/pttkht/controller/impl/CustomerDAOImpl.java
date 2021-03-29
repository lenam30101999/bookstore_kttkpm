package com.bookstore.pttkht.controller.impl;

import com.bookstore.pttkht.controller.dao.CustomerDAO;
import com.bookstore.pttkht.model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAOImpl extends ConnectionDAO implements CustomerDAO {

	private static final String check = "select * from customer where username = ? and password = ?";
	public Customer checkLogin(Customer customerCheck) {
		Customer customer = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(check);
			preparedStatement.setString(1, customerCheck.getUsername());
			preparedStatement.setString(2, customerCheck.getPassword());
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String phoneNum = rs.getString("phoneNo");
				String firstname = rs.getString("firstName");
				String middlename = rs.getString("middleName");
				String lastname = rs.getString("lastName");
				String city = rs.getString("city");
				String street = rs.getString("street");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String age = rs.getString("age");
				String country = rs.getString("country");

				customer= new Customer(id,phoneNum,firstname,middlename,lastname,city,street,username,password,age, country);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}

	public void addCustomer(Customer customer) {
		// TODO - implement CustomerDAOImpl.addCustomer
		String sql = "INSERT INTO customer (`phoneNo`, `firstName`, `middleName`, `lastName`, `city`, `street`, `username`, `password`, `country`, `age`) " +
				"VALUES (?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, customer.getPhoneNo());
			ps.setString(2, customer.getFirstName());
			ps.setString(3, customer.getMiddleName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getCity());
			ps.setString(6, customer.getStreet());
			ps.setString(7, customer.getUsername());
			ps.setString(8, customer.getPassword());
			ps.setString(9, customer.getCountry());
			ps.setString(10, customer.getAge());
			System.out.println(ps);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}