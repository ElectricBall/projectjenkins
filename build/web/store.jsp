<%-- 
    Document   : store
    Created on : Jul 15, 2019, 12:17:03 PM
    Author     : mandr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>The BuukStore | Store</title>
        <link rel="stylesheet" href="css/style.css" />
        <script src="vendor/js/store.js" async></script>
         <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>View Users</title>
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
            <h1 class="band-name-large">The BuukStore</h1>
        </header>
        <section class="container content-section">
            <%@page import="Controler.BukuDAO,Model.Buku,java.util.*"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <h1>Books List</h1>
        <%
            List<Buku> list = BukuDAO.getAllRecords();
            request.setAttribute("list", list);
        %>
        <table border="1" width="90%">
            <tr><th>Id buku</th><th>Jenis buku</th><th>Judul</th><th>Harga</th></tr>
                <c:forEach items="${list}" var="b">
                    <tr><td>${b.getId_buku()}</td><td>${b.getJenisbuku()}</td>
                        <td>${b.getJudul()}</td><td>${b.getHarga()}</td>
                        <td><button class="btn btn-primary btn-purchase"="button">BUY NOW</button></tr>
                </c:forEach>
        </table>
        </section>
        
        <footer class="main-footer">
            <div class="main-footer-container">
                <h3 class="band-name-small"> The BuukStore
                    <a class="footer-nav" href="https://www.facebook.com" target="_blank">
                        <img class="footer-nav" src="image/Facebook Logo.png">
                    </a>
                </h3>
            </div>
        </footer>
    </body>
</html>