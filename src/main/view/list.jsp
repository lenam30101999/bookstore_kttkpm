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
    <%--    <h1 style="background-color: lightyellow">  <span class="badge badge-secondary" style="background-color: 	#008080" >BOOK STORE</span></h1>--%>

    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: 	#008080">
        <div>
            <a href="" class="navbar-brand">ITEM </a>
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
<div class="container text-left">
    <h2>  <span class="badge badge-secondary" style="background-color: 	#008080" >Hello: <%= ((Customer) session.getAttribute("customer")).getLastName() %>
    <%= ((Customer) session.getAttribute("customer")).getFirstName() %>
    <%= ((Customer) session.getAttribute("customer")).getMiddleName() %></span></h2>

</div>
<br>
<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">ITEM LIST</h3>
        <hr>
        <br>
        <table class="table table-bordered" style="background-color:#E5FCC2">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Shopping</th>
            </tr>
            <c:forEach var="item" items="${listItem}">
                <tr>
                    <td><c:out value="${item.itemID}" /></td>
                    <td><c:out value="${item.name}" /></td>
                    <td><c:out value="${item.quantity}" /></td>
                    <td><c:out value="${item.price}" /></td>
                    <td>
                        <a href="add?id=<c:out value='${item.itemID}'/>" class="btn btn-success">Add to cart</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <div class="container text-right">
            <a href="<%=request.getContextPath()%>/listCart" class="btn btn-primary">View Cart</a>
        </div>
    </div>
</div>
</body>
</html>
