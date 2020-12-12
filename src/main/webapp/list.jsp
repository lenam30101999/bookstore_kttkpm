
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REGISTER</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<----------------------------------------------------
<header>
    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: black">
        <div>
            <a href="https://www.javaguides.net" class="navbar-brand"> LOGIN </a>
        </div>

        <ul class="navbar-nav">
                   class="nav-link">REGISTOR</a></li>
        </ul>
    </nav>
</header>
//---------------------------------------------------------
<br>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">

                <form action="checkLogin" method="post">

                    <caption>
                        <h2> LOGIN
                        </h2>
                    </caption>

                    <fieldset class="form-group">
                        <label>UserName</label> <input type="text"
                                                        class="form-control"
                                                        name="username" required="required">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Password</label> <input type="text"
                                                       class="form-control"
                                                       name="password">
                    </fieldset>

                    <button type="submit" class="btn btn-success">LOGIN</button>
                </form>
        </div>
    </div>
</div>
</body>
</html>