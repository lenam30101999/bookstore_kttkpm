package com.linh.pttkht2.controller.servlet;

import com.linh.pttkht2.controller.dao.CartDAO;
import com.linh.pttkht2.controller.impl.CartDAOImpl;
import com.linh.pttkht2.model.*;

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
                case "/orderList":
                    getListOrder(request, response);
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
        Book book = new Book();
//        int quantity = (int) request.getAttribute("quantity");
        int quantity=1;
        int id = Integer.parseInt(request.getParameter("id"));
        book.setBookID(id);
        cartDAO.add(book, quantity);
        response.sendRedirect("list");
    }

    private void getListCart(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        Cart carts = cartDAO.get();
        List<Item> item=carts.getItems();
        request.setAttribute("listCart",item);
        RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
        dispatcher.forward(request, response);
    }

    private void getListCartPayment(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        Cart carts = cartDAO.get();

        double bookPrice = 0;
        for (Item cartItem : carts.getItems()) {
            bookPrice += cartItem.getQuantity() * cartItem.getBook().getPrice();
        }

        Shipment shipment = new Shipment(1, 10000, null);

        request.setAttribute("payment",carts.getItems());
        request.setAttribute("shipment", shipment);
        request.setAttribute("bookPrice", bookPrice);
        request.setAttribute("totalPrice", bookPrice + shipment.getPrice());
        RequestDispatcher dispatcher = request.getRequestDispatcher("payment.jsp");

        HttpSession session = request.getSession(false);
        Payment payment = new Payment(0, bookPrice, null);
        Order order = new Order(0, null, bookPrice + shipment.getPrice(), null, (Customer) session.getAttribute("customer"), payment, shipment);
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
