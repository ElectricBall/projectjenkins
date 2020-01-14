<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>View Users</title>
    </head>
    <body>
        <%@page import="Controler.BukuDAO,Model.Buku,java.util.*"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <h1>Books List</h1>
        <%
            List<Buku> list = BukuDAO.getAllRecords();
            request.setAttribute("list", list);
        %>
        <table border="1" width="90%">
            <tr>
                <th>Id_buku</th>
                <th>Jenis buku</th>
                <th>Judul</th>
                <th>Harga</th>
                <th>Edit</th><th>Delete</th>
            </tr>
                    <c:forEach items="${list}" var="b">
                        <tr>
                            <td>${b.getId_buku()}</td>
                            <td>${b.getJenisbuku()}</td>
                            <td>${b.getJudul()}</td>
                            <td>${b.getHarga()}</td>
                            <td><a href="editform.jsp?id_buku=${b.getId_buku()}">Edit</a></td>
                            <td><a href="deletebook.jsp?id_buku=${b.getId_buku()}">Delete</a></td>
                        </tr>
                    </c:forEach>
        </table>
        <br/><a href="addbookform.jsp">Add New Book</a>

    </body>
</html>