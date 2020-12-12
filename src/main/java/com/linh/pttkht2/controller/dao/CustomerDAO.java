package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Customer;

public interface CustomerDAO {
	Customer checkLogin(Customer customerCheck);

	void addCustomer(Customer customer);

	void getCustomer();

	void getAllCustomer();

	void update();

	void delete();

}