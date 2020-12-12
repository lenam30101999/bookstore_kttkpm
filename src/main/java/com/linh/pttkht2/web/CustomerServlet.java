package com.linh.pttkht2.web;

import com.linh.pttkht2.dao.CustomerDAO;
import com.linh.pttkht2.model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CustomerDAO customerDAO;

    public void init() {
//        customerDAO = new CustomerDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

//        try {
//            switch (action) {
//                case "/new":
//                    showNewForm(request, response);
//                    break;
//                case "/insert":
////                    insertCustomer(request, response);
//                    break;
//            }
//        } catch () {
//            throw new ServletException(ex);
//        }
    }



    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Customer-form.jsp");
        dispatcher.forward(request, response);
    }

//    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        Customer existingCustomer = customerDAO.selectCustomer(id);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("Customer-form.jsp");
//        request.setAttribute("Customer", existingCustomer);
//        dispatcher.forward(request, response);

//    }
//
//    private void insertCustomer(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException {
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String country = request.getParameter("country");
//        Customer newCustomer = new Customer(name, email, country);
//        customerDAO.insertCustomer(newCustomer);
//        response.sendRedirect("list");
//    }
}
