<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Edit Form</title>
    </head>
    <body>
        <%@page import="Controler.BukuDAO,Model.Buku"%>

        <%
            String id = request.getParameter("id_buku");
            Buku b = BukuDAO.getRecordById(Integer.parseInt(id));
        %>

        <h1>Edit Form</h1>
        <form action="editbook.jsp" method="post">
            <input type="hidden" name="id" value="<%=b.getId_buku()%>"/>
            <table>
                <tr><td>Jenis buku:</td><td><input type="text" name="jenisbuku" value="<%= b.getJenisbuku()%>"/></td></tr>
                <tr><td>Judul:</td><td><input type="text" name="judul" value="<%= b.getJudul()%>"/></td></tr>
                <tr><td>Harga:</td><td><input type="text" name="harga" value="<%= b.getHarga()%>"/></td></tr>
                <tr><td colspan="2"><input type="submit" value="Edit Book"/></td></tr>
            </table>
        </form>
    </body>
</html>