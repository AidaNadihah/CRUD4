<%-- 
    Document   : adduser
    Created on : Jul 2, 2021, 10:50:20 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.javatpoint.dao.UserDao"%>  
<jsp:useBean id="u" class="com.javatpoint.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD USER</title>
    </head>
    <body>
        <%  
int i=UserDao.save(u);  
if(i>0){  
response.sendRedirect("adduser-success.jsp");  
}else{  
response.sendRedirect("adduser-error.jsp");  
}  
%>  
    </body>
</html>

