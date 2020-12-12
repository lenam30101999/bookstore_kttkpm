package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Account;

import java.util.List;

public interface AccountDAO {

	Account checkLogin(String username, String password);

	void addAccount(Account a);

	List<Account> getAccounts();

	Account getAccount(int id);

	void update(Account a);

	void delete(int id);

}