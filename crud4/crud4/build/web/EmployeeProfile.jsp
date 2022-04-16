<%-- 
    Document   : EmployeeProfile
    Created on : Jul 8, 2021, 10:45:29 AM
    Author     : azri
--%>

<%@page import="com.las.formdao,com.las.Employeeprofile,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Profile</title>
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
                margin-left: 450px;
                left: 90px;
                right: 90px;
                margin-top: 50px;
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
            <li><a href="firstpage.jsp">Logout</a></li>
       </div>
 </ul>
        
        <%  
List<Employeeprofile> list=formdao.getProfile();  
request.setAttribute("list",list);  
%>  

 <div class="box">
     <c:forEach items="${list}" var="u"> 
     <form action="Updateemployeeprofile.jsp?id=${u.getId()}" method="post">
        <h1>Update Employee Info</h1>
        <br>
        
            
        <label>Employee Id</label>
		<p class="p">${u.getEmpId()}</p>
		<label>Name</label>
		<p class="p">${u.getName()}</p>
		<label>Phone Number</label>
		<p class="p">${u.getPhonenum()}</p>
                <label>Email</label>
		<p class="p">${u.getEmail()}</p>
		<label>Department</label>
		<p class="p">${u.getDepartment()}</p>
                
        <br>
        <input type="submit" value="Update" >
           
            </form>
                 </c:forEach> 
        </div>
        
    </body>
</html>

