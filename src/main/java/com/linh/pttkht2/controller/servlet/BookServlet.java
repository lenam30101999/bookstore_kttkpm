package com.linh.pttkht2.controller.servlet;

import com.linh.pttkht2.controller.dao.BookDAO;
import com.linh.pttkht2.controller.dao.ItemDAO;
import com.linh.pttkht2.controller.impl.BookDAOImpl;
import com.linh.pttkht2.controller.impl.ItemDAOImpl;
import com.linh.pttkht2.model.Book;
import com.linh.pttkht2.model.Item;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class BookServlet extends HttpServlet {
    BookDAO bookDAO = new BookDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        List<Book> books = bookDAO.getAllBook();
        request.setAttribute("listBook", books);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }


    private void getBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Book book = bookDAO.getBook(id);
        request.setAttribute("infobook", book);
        RequestDispatcher dispatcher = request.getRequestDispatcher("infobook.jsp");
        dispatcher.forward(request, response);
    }
}