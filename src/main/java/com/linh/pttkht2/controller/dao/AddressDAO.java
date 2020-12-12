package com.linh.pttkht2.controller.dao;

import com.linh.pttkht2.model.Address;

import java.util.List;

public interface AddressDAO {

	void addAddress(Address a);

	List<Address> getAddresses();

	Address getAddress(int id);

	void update(Address a);

	void delete(int id);

}