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
            <a href="" class="navbar-brand">CART </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list"
                   class="nav-link">BOOK</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">CART</h3>
        <hr>
        <div class="container text-left">
        </div>
        <br>
        <table class="table table-bordered" style="background-color:lightyellow">
            <thead>
            <tr>
                <th>Book Name</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
            </thead>

            <!--   for (Todo todo: todos) {  -->
            <c:forEach var="item" items="${listCart}">
                <tbody>
                <tr>
                    <td><c:out value="${item.name}" /></td>
                    <td><c:out value="${item.quantity}" /></td>
                    <td><c:out value="${item.book.price}" /></td>
                    <td><a href="delete?id=<c:out value='${item.itemID}' />" class="btn btn-danger">Delete</a>
                    </td>
                </tr>

            <!-- } -->
            </tbody>
            </c:forEach>
        </table>
        <div class="container text-right">
            <a href="<%=request.getContextPath()%>/shipment.jsp" class="btn btn-primary">Shipment</a>
        </div>
    </div>
</div>
</body>
</html>
