<%-- 
    Document   : Updateadminprofile
    Created on : Jul 9, 2021, 8:02:10 PM
    Author     : USER
--%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
		.p{
			text-decoration: underline;
		}
		
		.b{
		  background-image: linear-gradient(to right,#ccccff,#cce6ff,#ffcccc);
		}
		
	
	.box {
        border-radius: 10px;
	padding-left: 30px;
	margin-left: 300px;
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

    }

        .t{
        background-color:cornsilk;
        position:absolute;
        top: 200px;
        left: 10px;
        width: 150px;
        height: 140px;

        background-position: 0% 20%;
        background-size: cover;
        }
        
        /* Style the side navigation */
            .sidenav {
              height: 100%;
              width: 200px;
              position: fixed;
              z-index: 1;
              top: 0;
              left: 0;
              background-color: #003366;
              overflow-x: hidden;
            }


            /* Side navigation links */
            .sidenav a {
              color: white;
              padding: 16px;
              text-decoration: none;
              display: block;
            }

            /* Change color on hover */
            .sidenav a:hover {
              background-color: #ddd;
              color: black;
            }

            /* Style the content */
            .content {
              margin-left: 200px;
              padding-left: 20px;
            }
</style>
    </head>
    <body class="b">
	
       
<ul>
    <div class="sidenav">  
            <li><a href="EmployeeForm.jsp">Apply Leave</a></li>
            <li><a href="Historyemployee.jsp">History Leave</a></li>
            <li><a href="EmployeeProfile.jsp">Profile</a></li>
            <li><a href="loginemployee.jsp">Logout</a></li>
       </div>
 </ul>
        <%@page import="com.admin.admindao,com.admin.admin"%>  
  
<%  
String id=request.getParameter("id");  
admin u=admindao.getProfileById(Integer.parseInt(id));  
%>  

 <div class="box">
     <form action="Updateadminprocess.jsp" method="post">
        <h1>Update Admin Info</h1>
        <br>
        
        <table>
            <tr><td>Admin Id</td><td>
                    <input type="text" name="empId" value="<%=u.getAdId() %>" /></td></tr>
		<tr><td>Name</td><td>
                <input type="text" name="name" value="<%=u.getName() %>" /></td></tr>
		<tr><td>Phone Number</td><td>
		<input type="text" name="empId" value="<%=u.getPhonenum() %>" /></td></tr>
                <tr><td>Email</td><td>
		<input type="text" name="empId" value="<%=u.getEmail() %>" /></td></tr>
                <tr><td><input type="submit" value="Update" ></td></tr>
                    
        </table>
            </form>
        </div>
        
    </body>
</html>
