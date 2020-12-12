package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.AccountDAO;
import com.linh.pttkht2.model.Account;

import java.sql.*;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
	private String jdbcURL = "jdbc:mysql://127.0.0.1:3306/pttkht_btl?user=root";
	private String jdbcUsername = "root";
	private String jdbcPassword = "sandstorm";

	private static final String SEARCH = "select * from account where username = ? and password = ?";

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
	public Account checkLogin(Account account) {
		// TODO - implement AccountDAOImpl.checkLogin
			// Step 1: Establishing a Connection
			try (Connection connection = getConnection();
				 // Step 2:Create a statement using connection object
				 PreparedStatement preparedStatement = connection.prepareStatement(SEARCH);) {
				preparedStatement.setString(1, account.getUsername());
				preparedStatement.setString(2, account.getPassword());
				System.out.println(preparedStatement);
				// Step 3: Execute the query or update query
				ResultSet rs = preparedStatement.executeQuery();

				// Step 4: Process the ResultSet object.
				while (rs.next()) {
					int id = rs.getInt("id");
					String username = rs.getString("username");
					String password = rs.getString("password");
					int customerId = rs.getInt("CustomerID");

					if (username.equals(account.getUsername()) && password.equals(account.getPassword())){
						account.setId(id);
						account.setCustomerId(customerId);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
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