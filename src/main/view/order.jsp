<%@ page import="com.bookstore.pttkht.model.Customer" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="com.bookstore.pttkht.model.Order" %>
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
         style="background-color: 	#008080">
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
        <ul class="list-group" style="background-color:lightcyan">
            <li class="list-group-item active">Order Information</li>
            <li class="list-group-item">Order ID: <%= ((Customer) session.getAttribute("customer")).getCustID() %></li>
            <li class="list-group-item">Date: <%= LocalDate.now() %></li>
            <li class="list-group-item">Customer: <%= ((Customer) session.getAttribute("customer")).getLastName() %>
                <%= ((Customer) session.getAttribute("customer")).getMiddleName() %>
                <%= ((Customer) session.getAttribute("customer")).getFirstName() %>
            </li>
            <li class="list-group-item">Ship:
                <%= ((Customer) session.getAttribute("customer")).getStreet() %>,
                <%= ((Customer) session.getAttribute("customer")).getCity() %>
            </li>
            <li class="list-group-item">Total money: <%=((Order) session.getAttribute("order")).getPrice()%></li>
        </ul>
        <br>
        <table class="table table-bordered" style="background-color:lightyellow">
            <thead>
            <tr>
                <th>Book Name</th>
                <th>Quantity</th>
                <th>Price</th>
            </tr>
            </thead>

            <!--   for (Todo todo: todos) {  -->
            <c:forEach var="item" items="${listItem}">
                <tbody>
                <tr>
                    <td><c:out value="${item.name}" /></td>
                    <td><c:out value="${item.quantity}" /></td>
                    <td><c:out value="${item.book.price}" /></td>
                </tr>

                <!-- } -->
                </tbody>
            </c:forEach>
        </table>
        <h3 class="text-center">ORDER SUCCESS!</h3>
        <a href="<%=request.getContextPath()%>/list" class="btn btn-dark">Back to list</a>
    </div>
</div>
</body>
</html>
