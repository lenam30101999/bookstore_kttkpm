<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Payment</title>
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
            <a href="" class="navbar-brand">PAYMENT</a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/listCart"
                   class="nav-link">CART</a></li>
        </ul>

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
        <h3 class="text-center">Payment</h3>
        <hr>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
            </thead>

            <!--   for (Todo todo: todos) {  -->
            <c:forEach var="cart" items="${payment}">
                <tbody>
                <tr>
                    <td><c:out value="${cart.cartID}" /></td>
                    <td><c:out value="${cart.quantity}" /></td>
                    </td>
                </tr>

                <!-- } -->
                </tbody>
            </c:forEach>
        </table>

    </div>
</div>

    <div class="container text-right">
        <ul class="list-group">
            <li class="list-group-item d-flex justify-content-between align-items-center">
                Book Price:
                <span class="badge badge-primary badge-pill">10000VND</span>
            </li>
            <li class="list-group-item d-flex justify-content-between align-items-center">
                Shipment:
                <span class="badge badge-primary badge-pill">20000VND</span>
            </li>
            <li class="list-group-item d-flex justify-content-between align-items-center">
                Total:
                <span class="badge badge-primary badge-pill">120000VND</span>
            </li>
        </ul>
    </div>
    <br>
    <div class="container text-right">
        <a href="<%=request.getContextPath()%>/order.jsp" class="btn btn-info">Order</a>

    </div>
</div>

</body>
</html>