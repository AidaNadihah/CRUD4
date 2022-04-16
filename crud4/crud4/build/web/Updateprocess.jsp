<%-- 
    Document   : Updateprocess
    Created on : Jul 8, 2021, 4:43:10 PM
    Author     : azri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Employee Profile</title>
    </head>
    <body>
       <%@page import="com.las.formdao"%>  
<jsp:useBean id="u" class="com.las.Employeeprofile"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=formdao.updateProfile(u);  
response.sendRedirect("EmployeeProfile.jsp");  
%>  
    </body>
</html>
