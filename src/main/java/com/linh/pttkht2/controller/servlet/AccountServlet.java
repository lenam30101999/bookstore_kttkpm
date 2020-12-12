package com.linh.pttkht2.controller.servlet;

import com.linh.pttkht2.controller.dao.AccountDAO;
import com.linh.pttkht2.controller.dao.ItemDAO;
import com.linh.pttkht2.controller.impl.AccountDAOImpl;
import com.linh.pttkht2.controller.impl.ItemDAOImpl;
import com.linh.pttkht2.model.Account;
import com.linh.pttkht2.model.Item;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class AccountServlet extends HttpServlet {
    AccountDAO accountDAO = new AccountDAOImpl();
    ItemDAO itemDAO = new ItemDAOImpl();

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
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void checkLogin(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);

        account = accountDAO.checkLogin(account);
        if (account.getId() != -1) {
            HttpSession session = request.getSession(false);
            session.setAttribute("customerId", account.getCustomerId());
            response.sendRedirect("list");
            return;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}