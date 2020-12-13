<%@ page import="com.linh.pttkht2.model.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Order List</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: black">
        <div>
            <a href="" class="navbar-brand">ORDER </a>
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
        <h3 class="text-center">ORDER</h3>
        <hr>
        <br>
        <ul class="list-group">
            <li class="list-group-item active">Order Information</li>
            <li class="list-group-item">Order ID: <%= ((Customer) session.getAttribute("customer")).getLastName() %></li>
            <li class="list-group-item">Date: </li>
            <li class="list-group-item">Customer: <%= ((Customer) session.getAttribute("customer")).getLastName() %>
                <%= ((Customer) session.getAttribute("customer")).getMiddleName() %>
                <%= ((Customer) session.getAttribute("customer")).getFirstName() %>
            </li>
            <li class="list-group-item">Ship: </li>
            <li class="list-group-item">Total money: </li>
        </ul>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
            </tr>
            </thead>

            <!--   for (Todo todo: todos) {  -->
            <c:forEach var="cart" items="${listCart}">
                <tbody>
                <tr>
                    <td><c:out value="${cart.cartID}" /></td>
                    <td><c:out value="${cart.quantity}" /></td>
                    <td><a href="delete?id=<c:out value='${cart.cartID}' />" class="btn btn-danger">Delete</a>
                    </td>
                </tr>

                <!-- } -->
                </tbody>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
