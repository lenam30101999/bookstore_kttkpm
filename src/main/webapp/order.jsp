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
        <h3 class="text-center">CART</h3>
        <hr>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
            </tr>
            </thead>

            <!--   for (Todo todo: todos) {  -->
            <c:forEach var="cart" items="${listCart}">
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
</body>
</html>
