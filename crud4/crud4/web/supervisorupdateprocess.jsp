<%-- 
    Document   : supervisorupdateprocess
    Created on : Jul 8, 2021, 8:25:08 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Supervisor Profile</title>
    </head>
    <body>
       <%@page import="com.supervisor.supervisordao"%>  
<jsp:useBean id="u" class="com.supervisor.superprofile"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=supervisordao.updateProfile(u);  
response.sendRedirect("supervisorprofile.jsp");  
%>  
    </body>
</html>
