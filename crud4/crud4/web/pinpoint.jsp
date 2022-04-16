<%-- 
    Document   : pinpoint
    Created on : Jul 7, 2021, 10:57:50 PM
    Author     : azri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.las.formdao"%>  
<jsp:useBean id="u" class="com.las.form"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%  
int i=formdao.save(u);  
if(i>0){  
response.sendRedirect("addform-success.jsp");  
}else{  
response.sendRedirect("addform-error.jsp");  
}  
%>
    </body>
</html>
