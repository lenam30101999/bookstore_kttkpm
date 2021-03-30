package com.bookstore.pttkht.controller.servlet;

import com.bookstore.pttkht.controller.impl.CartDAOImpl;
import com.bookstore.pttkht.controller.dao.CartDAO;
import com.bookstore.pttkht.model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

        checkAlreadyLoggedIn(request, response);

        try {
            switch (action) {
                case "/add":
                    addToCart(request, response);
                    break;
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

    private void addToCart(HttpServletRequest request, HttpServletResponse response)
        throws SQLException, IOException, ServletException {
        Item item = new Item();
        int quantity = 1;
        int id = Integer.parseInt(request.getParameter("id"));
        item.setItemID(id);
        cartDAO.add(item, quantity);
        response.sendRedirect("list");
    }

    private void getListCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        HttpSession session = request.getSession(false);
        Cart carts = cartDAO.get();
        List<Item> item=carts.getItems();
        request.setAttribute("listCart",item);
        session.setAttribute("cart_order", carts);
        RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
        dispatcher.forward(request, response);
    }

    private void getListCartPayment(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        Cart carts = cartDAO.get();

        long itemPrice = 0;
        for (Item cartItem : carts.getItems()) {
            itemPrice += cartItem.getQuantity() * cartItem.getPrice();
        }

        request.setAttribute("payment",carts.getItems());
        request.setAttribute("totalPrice", itemPrice);
        RequestDispatcher dispatcher = request.getRequestDispatcher("payment.jsp");

        HttpSession session = request.getSession(false);
        Payment payment = new Payment(0, itemPrice, null);
        Order order = new Order(0, null, itemPrice , null, (Customer) session.getAttribute("customer"), payment);
        session.setAttribute("order", order);

        dispatcher.forward(request, response);
    }

    private void deleteCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        cartDAO.delete(id);
        response.sendRedirect("listCart");
    }

    private void checkAlreadyLoggedIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        Customer sessionCustomer = (Customer) session.getAttribute("customer");

        if (sessionCustomer == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
    }
}
