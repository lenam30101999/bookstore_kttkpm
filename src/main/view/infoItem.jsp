<%@ page import="com.bookstore.pttkht.model.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <a href="" class="navbar-brand">INFORMATION ITEM </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list"
                   class="nav-link">ITEM LIST</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">INFORMATION ITEM</h3>
        <hr>
        <br>
        <table class="table table-bordered" style="background-color:lightyellow">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>

            </tr>
            </thead>
            <!--   for (Todo todo: todos) {  -->
                <tbody>
                <tr>
                    <td><%= ((Item) request.getAttribute("infoItem")).getItemID() %></td>
                    <td><%= ((Item) request.getAttribute("infoItem")).getName() %></td>
                    <td><%= ((Item) request.getAttribute("infoItem")).getPrice() %></td>
                    <td><%= ((Item) request.getAttribute("infoItem")).getQuantity() %></td>
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
