<%-- 
    Document   : supervisorview
    Created on : Jul 2, 2021, 10:45:14 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
<style>
    .box{
        border-radius: 10px;
        padding-left: 30px;
	padding-right: 30px;
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
        max-height: 1000px;
        max-width: 800px;
        border-style: outset;
        height: 500px;
        }
    
    .b{
	background-image: linear-gradient(to right,#ccccff,#cce6ff,#ffcccc);
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
  
<%@page import="com.las.formdao,com.las.form,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
  
 
<ul>
    <div class="sidenav"> 
            <li><a href="supervisorview.jsp">View Employee Leave</a></li>
            <li><a href="supervisorprofile.jsp">Supervisor Profile</a></li>
            <li><a href="firstpage.jsp">Log Out</a></li>
    </div>
        </ul>

<%  
List<form> list=formdao.getAllRecords();  
request.setAttribute("list",list);  
%> 
<div class="box">
    <h1>Leave Application</h1>
    <br>
<table border="1" width="90%">  
<tr><th>Id</th>
    <th>Name</th>
    <th>Employee Id</th>
    <th>From Date</th>  
    <th>To Date</th>
    <th>Leave Type</th>
    <th>Description</th>
    <th>Status</th> 
    <th>Edit Form</th>
    </tr> 



<c:forEach items="${list}" var="u"> 
    
<tr><td>${u.getId()}</td>
    <td>${u.getName()}</td>
    <td>${u.getEmpId()}</td>
    <td>${u.getFromdate()}</td>
    <td>${u.getTodate()}</td>
    <td>${u.getLeavetype()}</td>
    <td>${u.getDes()}</td>
    <td>${u.getStatus()}</td>
    <td><a href="editformsupervisor.jsp?id=${u.getId()}">Edit</a>  
   


</c:forEach>  
</table>  
 
</div>
</body>  
</html>  

