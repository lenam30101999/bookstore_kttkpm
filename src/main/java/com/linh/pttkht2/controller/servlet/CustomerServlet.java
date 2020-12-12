package com.linh.pttkht2.controller.servlet;

import com.linh.pttkht2.controller.dao.CustomerDAO;
import com.linh.pttkht2.controller.impl.CustomerDAOImpl;
import com.linh.pttkht2.model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CustomerDAO customerDAO=new CustomerDAOImpl();

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

        try {
            switch (action) {
                case "/checkLogin":
                    checkLogin(request, response);
                    break;
                case "/insert":
                    insert(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void checkLogin(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Customer customer = new Customer();
        customer.setUsername(username);
        customer.setPassword(password);

        customer=customerDAO.checkLogin(customer);
        if (customer!=null) {
            HttpSession session = request.getSession(false);
            session.setAttribute("customerId", customer.getCustID());
            response.sendRedirect("list");
            return;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
    private void insert(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String phoneNumber = request.getParameter("phoneNumber");
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        String city = request.getParameter("city");
        String street = request.getParameter("street");
        Customer customer = new Customer(1,phoneNumber,firstName,middleName,lastName,city,street,username,password,null);

        customerDAO.addCustomer(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
