//package com.linh.pttkht2.controller.servlet;
//
//import com.linh.pttkht2.model.Book;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class BookServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public BookServlet() {
//        super();
//    }
//
//    /**
//     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//     */
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//
//    /**
//     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//     */
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String query = request.getParameter("search-query");
//        System.out.println("In Search  Servlet");
//        ArrayList<Book> books = new BookDB().searchForBooks(query);
//        request.setAttribute("books", books);
//        request.getRequestDispatcher("Search.jsp").forward(request, response);
//    }
//}
