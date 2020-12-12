package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.AccountDAO;
import com.linh.pttkht2.model.Account;

import java.sql.*;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
	private String jdbcURL = "jdbc:mysql://127.0.0.1:3306/pttkht_btl?user=root";
	private String jdbcUsername = "root";
	private String jdbcPassword = "123456";

	private static final String SEARCH = "select username, password from account where username = ? and password = ?";

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public Account checkLogin(String username, String password) {
		// TODO - implement AccountDAOImpl.checkLogin
			Account account = null;
			// Step 1: Establishing a Connection
			try (Connection connection = getConnection();
				 // Step 2:Create a statement using connection object
				 PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);) {
				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);
				System.out.println(preparedStatement);
				// Step 3: Execute the query or update query
				ResultSet rs = preparedStatement.executeQuery();

				// Step 4: Process the ResultSet object.
				while (rs.next()) {
					String name = rs.getString("name");
					String pass = rs.getString("password");
					account = new Account(1,name, pass);
				}
			} catch (SQLException e) {

			}
				return account;
	}
	public void addAccount(Account a) {
		// TODO - implement AccountDAOImpl.addAccount
		throw new UnsupportedOperationException();
	}

	public List<Account> getAccounts() {
		// TODO - implement AccountDAOImpl.getAccounts
		throw new UnsupportedOperationException();
	}

	public Account getAccount(int id) {
		// TODO - implement AccountDAOImpl.getAccount
		throw new UnsupportedOperationException();
	}

	public void update(Account a) {
		// TODO - implement AccountDAOImpl.update
		throw new UnsupportedOperationException();
	}

	public void delete(int id) {
		// TODO - implement AccountDAOImpl.delete
		throw new UnsupportedOperationException();
	}

}