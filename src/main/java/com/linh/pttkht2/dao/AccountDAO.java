package com.linh.pttkht2.dao;

import com.linh.pttkht2.impl.AccountDAOImpl;
import com.linh.pttkht2.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface AccountDAO {

	Account checkLogin(String username, String password);

	void addAccount(Account a);

	List<Account> getAccounts();

	Account getAccount(int id);

	void update(Account a);

	void delete(int id);

}