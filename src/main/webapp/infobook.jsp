<%@ page import="com.linh.pttkht2.model.Book" %>
<jsp:useBean id="infobook" scope="request" type="com.linh.pttkht2.model.Book"/>
<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 12/12/2020
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="book" scope="request" class="com.linh.pttkht2.model.Book"></jsp:useBean>
<jsp:setProperty name="book" property="*"></jsp:setProperty>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>Information Book</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Author</th>
            <th>Publisher</th>
            <th>Number Page</th>
            <th>Price</th>
            <%--            <th>Price</th>--%>
<%--            <th>Actions</th>--%>
<%--            <th>Shopping</th>--%>
        </tr>
            <tr>
                <td><%= ((Book) request.getAttribute("infobook")).getBookID() %></td>
                <td><%= ((Book) request.getAttribute("infobook")).getName() %></td>
                <td><%= ((Book) request.getAttribute("infobook")).getAuthor().getName() %></td>
                <td><%= ((Book) request.getAttribute("infobook")).getPublisher().getName() %></td>
                <td><%= ((Book) request.getAttribute("infobook")).getNumPage() %></td>
                <td><%= ((Book) request.getAttribute("infobook")).getPrice() %></td>
            </tr>
    </table>
</div>
</body>
</html>
