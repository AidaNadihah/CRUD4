<%-- 
    Document   : edituser
    Created on : Jul 5, 2021, 8:11:30 PM
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
        <title>Supervisor Profile</title>
        <style>
		.p{
			text-decoration: underline;
		}
		
		.b{
			background-image: linear-gradient(to right,#ccccff,#cce6ff,#ffcccc);
		}
		
	
	.box {

	padding-left: 30px;
	margin-left: 400px;
	left: 90px;
	right: 90px;
        margin-top: 20px;
        min-width: 50px;
        background-color: #e6f2ff;
        display: block;
        -webkit-box-sizing: content-box;
        -moz-box-sizing: content-box;
        box-sizing: content-box;
        max-height: 800px;
        max-width: 400px;
        border-style: outset;
        height: 500px;
        border-radius: 8px;
        

}

        .t{
            background-color:cornsilk;
            position:absolute;
            top: 200px;
            left: 10px;
            width: 300px;
            height: 140px;

            background-position: 0% 20%;
            background-size: cover;
            }
</style>


<%  
int i=UserDao.update(u);  
response.sendRedirect("EmployeeForm.jsp");  
%>  
    </body>
</html>
