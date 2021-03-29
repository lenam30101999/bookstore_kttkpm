<%@ page import="com.bookstore.pttkht.model.Customer" %>
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
            <a href="" class="navbar-brand">CUSTOMER PROFILE </a>
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
        <div class="container text-right">
            <a href="<%=request.getContextPath()%>/out" class="btn btn btn-warning">Logout</a>
        </div>
        <hr>
        <br>
        <ul class="list-group" style="background-color:lightsteelblue">
            <li class="list-group-item active">User Name: <%= ((Customer) session.getAttribute("customer")).getUsername() %>
            </li>
            <li class="list-group-item">Full Name: <%= ((Customer) session.getAttribute("customer")).getLastName() %>
                <%= ((Customer) session.getAttribute("customer")).getMiddleName() %>
                <%= ((Customer) session.getAttribute("customer")).getFirstName() %></li>
            <li class="list-group-item">City: <%= ((Customer) session.getAttribute("customer")).getCity() %></li>
            <li class="list-group-item">Street: <%= ((Customer) session.getAttribute("customer")).getStreet() %></li>
            <li class="list-group-item">Phone Number: <%= ((Customer) session.getAttribute("customer")).getPhoneNo() %> </li>
        </ul>
        <br>
        <div class="container text-right">
            <a href="<%=request.getContextPath()%>/list" class="btn btn btn-warning">Back</a>
        </div>
    </div>
</div>
</body>
</html>

