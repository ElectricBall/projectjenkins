<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>TheBuukstore</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>TheBuukstore</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
         <title>
            Wellcome to The BuukStore
        </title>
        <link rel="stylesheet" href="css/style.css" />
        <script src="js/jquery-3.4.1.js"></script>
    </head>
    <body>
        <center>
        <%
            String name = (String) request.getAttribute("uName");
            if (name != null) {
        %>
        <h1>Hi welcome <%=name%> </h1>    
        <%
            }
        %>
        
        <span>
                <a class="btn btn-success" href="bookform.html" style="width: 195px;">Add a Book</a>
        </span>
        
        <span>
                <a class="btn btn-success" href="viewbooks.jsp" style="width: 195px;">View Data Book</a>
        </span>
        
        <span>
                <a class="btn btn-success" href="loginadmin.jsp" style="width: 195px;">Logout</a>
        </span>
        
       
        
        </center>
    </body>
</html>