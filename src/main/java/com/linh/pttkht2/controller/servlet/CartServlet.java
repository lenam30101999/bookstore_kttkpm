package com.linh.pttkht2.controller.servlet;

import com.linh.pttkht2.controller.dao.CartDAO;
import com.linh.pttkht2.controller.impl.CartDAOImpl;
import com.linh.pttkht2.model.Cart;
import com.linh.pttkht2.model.Item;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CartServlet extends HttpServlet {
    private CartDAO cartDAO =new CartDAOImpl();;


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/listCart":
                    getListCart(request, response);
                    break;
                case "/payment":
                    getListCartPayment(request, response);
                    break;
                case "/delete":
                    deleteCart(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void getListCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Cart> carts = cartDAO.get();
        request.setAttribute("listCart",carts);
        RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
        dispatcher.forward(request, response);
    }
    private void getListCartPayment(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Cart> carts = cartDAO.get();
        request.setAttribute("payment",carts);
        RequestDispatcher dispatcher = request.getRequestDispatcher("payment.jsp");
        dispatcher.forward(request, response);
    }
    private void deleteCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        cartDAO.delete(id);
        response.sendRedirect("listCart");

    }

}