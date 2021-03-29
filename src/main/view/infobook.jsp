<%@ page import="com.ducanh.pttkht.model.Book" %>
<jsp:useBean id="infobook" scope="request" type="com.ducanh.pttkht.model.Book"/>
<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 12/12/2020
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="book" scope="request" class="com.ducanh.pttkht.model.Book"></jsp:useBean>
<jsp:setProperty name="book" property="*"></jsp:setProperty>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>cart</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: 	#008080">
        <div>
            <a href="" class="navbar-brand">INFORMATION BOOK </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list"
                   class="nav-link">BOOK LIST</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">INFORMATION BOOK</h3>
        <hr>
        <br>
        <table class="table table-bordered" style="background-color:lightyellow">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Author</th>
                <th>Publisher</th>
                <th>Number Page</th>
                <th>Price</th>
            </tr>
            </thead>
            <!--   for (Todo todo: todos) {  -->
                <tbody>
                <tr>
                    <td><%= ((Book) request.getAttribute("infobook")).getBookID() %></td>
                    <td><%= ((Book) request.getAttribute("infobook")).getName() %></td>
                    <td><%= ((Book) request.getAttribute("infobook")).getAuthor().getName() %></td>
                    <td><%= ((Book) request.getAttribute("infobook")).getPublisher().getName() %></td>
                    <td><%= ((Book) request.getAttribute("infobook")).getNumPage() %></td>
                    <td><%= ((Book) request.getAttribute("infobook")).getPrice() %></td>
                </tr>

                <!-- } -->
                </tbody>
        </table>
        <div class="container text-right">
            <a href="<%=request.getContextPath()%>/list" class="btn btn btn-warning">Back</a>
        </div>
    </div>
</div>
</body>
</html>
