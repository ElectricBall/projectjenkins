<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>TheBuukstore</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
         <title>
            Manage The BuukStore
        </title>
        <link rel="stylesheet" href="css/style.css" />
        <script src="js/jquery-3.4.1.js"></script>
    </head>
    <body>
        <header class="main-header">
            <nav class="nav main-nav">
                <ul>
                    <li><a href="index.jsp">HOME</a></li>
                    <li><a href="store.jsp">STORE</a></li>
                    <li><a href="about.jsp">ABOUT</a></li>
                    <li><a href="login.jsp">LOGIN</a></li>
                    <li><a href="register.html">SIGN UP</a></li>
                    <ul><a href="loginadmin.jsp">ADMIN</a></ul>
                </ul>
            </nav>
        </header>
        <br>
        <div class="container-fluid">
            <div class="panel panel-success">
                <div class="panel-heading" align="center">
                    <h4><b><font color="black">Login Admin Page</font> </b></h4>
                    <form action="LoginAdminServlet" method="post" >
                        <table>
                            <tr>
                                <td>
                                   Username 
                                </td>
                                <td>
                                    :
                                </td>
                                <td>
                                    <input type="text" class="form-control" name="username" placeholder="Masukkan Username" required="required">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Password
                                </td>
                                <td>
                                    :
                                </td>
                                <td>
                                    <input type="password" class="form-control" name="password" placeholder="Masukkan Password" required="required">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                </td>
                                <td>
                                </td>
                                <td colspan="2">
                                    <button type="submit" class="btn btn-success" style="width: 195px;"><b>Login</b></button>
                                </td>
                            </tr>
                        </table>                        
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>