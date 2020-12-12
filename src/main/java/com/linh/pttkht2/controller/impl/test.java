package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.CustomerDAO;
import com.linh.pttkht2.model.Customer;

public class test {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAOImpl();
        Customer customer=new Customer();
        customer.setUsername("ducanh");
        customer.setPassword("1234");
        customerDAO.checkLogin(customer);
    }
}
