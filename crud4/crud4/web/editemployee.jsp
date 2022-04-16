<%-- 
    Document   : editemployee
    Created on : Jul 7, 2021, 11:49:48 PM
    Author     : azri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Employee</title>
    </head>
    <body>
        <%@page import="com.las.formdao"%>  
<jsp:useBean id="u" class="com.las.form"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=formdao.update(u);  
response.sendRedirect("Historyemployee.jsp");  
%>  
    </body>
</html>
