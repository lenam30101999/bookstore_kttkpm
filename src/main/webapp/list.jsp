<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<jsp:useBean id="book" scope="request" class="com.linh.pttkht2.model.Book"></jsp:useBean>--%>
<%--<jsp:setProperty name="book" property="*"></jsp:setProperty>--%>
<html>
<head>
    <title>Books Store Application</title>
</head>
<body>
<center>
    <h1>Books Management</h1>
    <h2>
        <a href="/new">Add New Book</a>
        &nbsp;&nbsp;&nbsp;
        <a href="/list">List All Books</a>

    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Books</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
<%--            <th>Price</th>--%>
            <th>Actions</th>
            <th>Shopping</th>
        </tr>
        <c:forEach var="item" items="${listBook}">
            <tr>
                <td><c:out value="${item.itemID}" /></td>
                <td><c:out value="${item.name}" /></td>
                <td><c:out value="${item.price}" /></td>
                <td>
                    <a href="/infobook?id=<c:out value='${book.id}'/>">Info Book</a>
<%--                    &nbsp;&nbsp;&nbsp;&nbsp;--%>
<%--                    <a href="/delete?id=<c:out value='${book.id}' />">Delete</a>--%>
                </td>
                <td>
                    <a href="/edit?id=<c:out value='${book.itemID}'/>">Add to cart</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>