package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.CartDAO;
import com.linh.pttkht2.controller.dao.CustomerDAO;
import com.linh.pttkht2.model.Cart;
import com.linh.pttkht2.model.Customer;

import java.util.List;

public class test {
    public static void main(String[] args) {
        CartDAO cartDAO=new CartDAOImpl();
        List<Cart> listCart = cartDAO.get();
        for (int i=0;i<=1;i++)
            System.out.println(listCart.get(i).toString());
    }
}
