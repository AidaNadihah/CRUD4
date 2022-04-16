<%-- 
    Document   : Updateadminprocess
    Created on : Jul 9, 2021, 8:01:34 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="com.admin.admindao"%>  
<jsp:useBean id="u" class="com.admin.admin"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=admindao.updateProfile(u);  
response.sendRedirect("Adminprofile.jsp");  
%>  
    </body>
</html>
