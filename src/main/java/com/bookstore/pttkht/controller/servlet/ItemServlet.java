package com.bookstore.pttkht.controller.servlet;

import com.bookstore.pttkht.controller.dao.ItemDAO;
import com.bookstore.pttkht.controller.impl.ItemDAOImpl;
import com.bookstore.pttkht.model.Customer;
import com.bookstore.pttkht.model.Item;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ItemServlet extends HttpServlet {
    ItemDAO itemDAO = new ItemDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        checkAlreadyLoggedIn(request, response);

        String action = request.getServletPath();

        try {
            switch (action) {
                case "/list":
                    getList(request, response);
                    break;

                case "/infobook":
                    getBook(request,response);
                    break;

            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void getList(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Item> items = itemDAO.getItems();
        request.setAttribute("listItem", items);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }


    private void getBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Item item = itemDAO.getItem(id);
        request.setAttribute("infobook", item);
        RequestDispatcher dispatcher = request.getRequestDispatcher("infobook.jsp");
        dispatcher.forward(request, response);
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