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
         style="background-color: black">
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

            <a href="<%=request.getContextPath()%>/" class="btn btn-success">Add
                New Shipment</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
            </tr>
            </thead>
            <tbody>

            </tbody>

        </table>
        <br>
        <div class="container text-right">
            <a href="<%=request.getContextPath()%>/payment" class="btn btn-info">Payment</a>
        </div>
    </div>
</div>
</body>
</html>

