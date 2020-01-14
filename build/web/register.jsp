<%@page import="Controler.RegisterDAO"%>
<jsp:useBean id="b" class="Model.Register"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>

<%
    int i = RegisterDAO.save(b);
    if (i > 0) {
        response.sendRedirect("register-success.jsp");
    } else {
        response.sendRedirect("register-error.jsp");
    }
%>