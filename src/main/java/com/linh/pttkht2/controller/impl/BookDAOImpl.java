package com.linh.pttkht2.controller.impl;

import com.linh.pttkht2.controller.dao.BookDAO;
import com.linh.pttkht2.model.Author;
import com.linh.pttkht2.model.Book;
import com.linh.pttkht2.model.Item;
import com.linh.pttkht2.model.Publisher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl extends ConnectionDAO implements BookDAO {

    private String SEARCH_BOOK = "select Book.BookID, Book.Name AS book_name, Book.NumPage, author.Name AS author_name, " +
            "publisher.Name AS publisher_name from Book,author,publisher where author.authorID = Book.AuthorAuthorID " +
            "and Book.publisherPubID = publisher.PubID and Book.BookID=?";

    public void addBook() {
        // TODO - implement BookDAOImpl.addBook
        throw new UnsupportedOperationException();
    }

    public Book getBook(int bookID) {
        Book book = new Book();
        ResultSet rs = null;
        Book dbBook = new Book();
        dbBook.setBookID(book.getBookID());
        try {
            String SEARCH_BOOK = "select Book.BookID, Book.Name AS book_name, Book.NumPage, Book.price, Author.Name AS author_name, publisher.Name AS publisher_name from Book,Author,publisher where Author.authorID = Book.AuthorID and Book.publisherID = publisher.PubID and Book.BookID=" + bookID;
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BOOK);
            rs = preparedStatement.executeQuery(SEARCH_BOOK);
            System.out.println(SEARCH_BOOK);

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("BookID");
                String name = rs.getString("book_name");
                int numPage = rs.getInt("NumPage");
                double price = rs.getDouble("price");
                String authorName = rs.getString("author_name");
                String namePublisher = rs.getString("publisher_name");

                dbBook.setBookID(id);
                dbBook.setName(name);
                dbBook.setNumPage(numPage);
                dbBook.setPrice(price);
                dbBook.setAuthor(new Author(0, authorName, null));
                dbBook.setPublisher(new Publisher(0, namePublisher));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbBook;
    }

    public List<Book> getAllBook() {
        List<Book> books = new ArrayList<>();
        ResultSet rs = null;
        try {
            String strQuery = "select BookID, Book.name AS book_name, Book.price from Book";
            PreparedStatement preparedStatement = connection.prepareStatement(strQuery);
            rs = preparedStatement.executeQuery(strQuery);
            System.out.println(strQuery);

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int bookId = rs.getInt("BookID");
                String name = rs.getString("book_name");
                double price = rs.getDouble("price");

                Book book = new Book();
                book.setBookID(bookId);
                book.setName(name);
                book.setPrice(price);

                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public void update() {
        // TODO - implement BookDAOImpl.update
        throw new UnsupportedOperationException();
    }

    public void delete() {
        // TODO - implement BookDAOImpl.delete
        throw new UnsupportedOperationException();
    }

}