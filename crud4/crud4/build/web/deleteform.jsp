<%-- 
    Document   : deleteform
    Created on : Jul 7, 2021, 11:52:04 PM
    Author     : azri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="com.las.formdao"%>  
<jsp:useBean id="u" class="com.las.form"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
formdao.delete(u);  
response.sendRedirect("Historyemployee.jsp");  
%>  
    </body>
</html>
