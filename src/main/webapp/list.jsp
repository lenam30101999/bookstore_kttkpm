<%@ page import="com.linh.pttkht2.model.Customer" %>
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
         style="background-color: black">
        <div>
            <a href="" class="navbar-brand">BOOK </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/listCart"
                   class="nav-link">CART</a></li>
        </ul>
        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/profile.jsp"
                   class="nav-link">MY PROFILE</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-left">Hello <%= ((Customer) session.getAttribute("customer")).getLastName() %>
            <%= ((Customer) session.getAttribute("customer")).getMiddleName() %>
            <%= ((Customer) session.getAttribute("customer")).getFirstName() %></h3>
        <h3 class="text-center">LIST BOOK</h3>
        <hr>
        <div class="container text-right">

            <a href="<%=request.getContextPath()%>/listCart" class="btn btn-secondary">View Cart</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Actions</th>
                <th>Shopping</th>
            </tr>
            </thead>

            <!--   for (Todo todo: todos) {  -->
            <c:forEach var="item" items="${listBook}">
                <tr>
                    <td><c:out value="${item.itemID}" /></td>
                    <td><c:out value="${item.name}" /></td>
                    <td><c:out value="${item.price}" /></td>
                    <td>
                        <a href="/infobook?id=<c:out value='${book.id}'/>" class="btn btn-info">Info Book</a>
                    </td>
                    <td>
                        <a href="/add?id=<c:out value='${book.id}' />" class="btn btn-success">Add to cart</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

    </div>
</div>
</body>
</html>