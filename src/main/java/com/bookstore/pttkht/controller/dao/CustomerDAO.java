package com.bookstore.pttkht.controller.dao;

import com.bookstore.pttkht.model.Customer;

public interface CustomerDAO {
	Customer checkLogin(Customer customerCheck);

	void addCustomer(Customer customer);

}