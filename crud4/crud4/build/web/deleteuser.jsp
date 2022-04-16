<%-- 
    Document   : deleteuser
    Created on : Jul 3, 2021, 2:29:34 PM
    Author     : USER
--%>
<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page import="com.javatpoint.dao.UserDao"%>  
<jsp:useBean id="u" class="com.javatpoint.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
UserDao.delete(u);  
response.sendRedirect("viewusers.jsp");  
%>  
    </body>
</html>
