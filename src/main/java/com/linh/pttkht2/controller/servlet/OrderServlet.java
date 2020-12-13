package com.linh.pttkht2.controller.servlet;

import com.linh.pttkht2.controller.dao.CartDAO;
import com.linh.pttkht2.controller.dao.OrderDAO;
import com.linh.pttkht2.controller.impl.CartDAOImpl;
import com.linh.pttkht2.controller.impl.OrderDAOImpl;
import com.linh.pttkht2.model.Cart;
import com.linh.pttkht2.model.Order;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class OrderServlet extends HttpServlet {
    private OrderDAO orderDAO =new OrderDAOImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/getOrder":
                    getOrder(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void getOrder(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        Order orders = orderDAO.getOrder();
        request.setAttribute("order",orders);
        RequestDispatcher dispatcher = request.getRequestDispatcher("order.jsp");
        dispatcher.forward(request, response);
    }
}
