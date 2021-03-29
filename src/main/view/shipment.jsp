<%@ page import="com.bookstore.pttkht.model.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shipment</title>
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
            <a href="" class="navbar-brand">SHIPMENT </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/listCart"
                   class="nav-link">CART</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">Shipment</h3>
        <hr>
        <div class="container text-left">
        </div>
        <br>
        <table class="table table-bordered" style="background-color:lightyellow" >
            <thead>
            <tr>
                <th>Street</th>
                <th>City</th>
                <th>Shipping price</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td> <%= ((Customer) session.getAttribute("customer")).getStreet() %> </td>
                <td><%= ((Customer) session.getAttribute("customer")).getCity() %></td>
                <td>10000</td>
            </tr>
            </tbody>

        </table>
        <br>
        <div class="container text-right">
            <a href="<%=request.getContextPath()%>/payment" class="btn btn-primary">Payment</a>
        </div>
    </div>
</div>
</body>
</html>

