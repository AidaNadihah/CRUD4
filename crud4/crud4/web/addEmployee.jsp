<%-- 
    Document   : addEmployee
    Created on : Jul 9, 2021, 8:06:13 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Profile</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            
            .box{
                border-radius: 8px;
                padding-left: 30px;
                margin-left: 450px;
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
                height: 350px;
                
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
        
   
<ul>
          <div class="sidenav">  
             <li><a href="addEmployee.jsp">Add New Employee</a></li>
            <li><a href="addSupervisor.jsp">Add New Supervisor</a></li>
            <li><a href="adminview.jsp">View Employee</a></li>
            <li><a href="viewsupervisor.jsp">View Supervisor</a></li>
            <li><a href="EmployeeProfile.jsp">Profile</a></li>
            <li><a href="firstpage.jsp">Log Out</a></li>
       </div>
</ul>
          
        <div class="box">
<h1>Employee Add</h1>  
<form action="addempprocess.jsp" method="post">  
<table> 
    
<tr><td>Employee Id:</td>
    <td><input type="text" name="empId"/></td>
</tr>

<tr><td>Name:</td>
    <td><input type="text" name="name"/></td>
</tr>  
 
<tr><td>Password:</td>
    <td><input type="text" name="password"/></td>
</tr>  

<tr><td>Phone Number:</td>
    <td><input type="text" name="phonenum" /></td>
</tr>  

<tr><td>Email:</td>
    <td><input type="text" name="email" /></td>
</tr> 

<tr><td>Department:</td>
    <td><input type="text" name="department" /></td>
</tr> 

<tr><td>Status:</td><td> 
<select name="status" style="width:155px">
<option>Active</option>  
<option>Inactive</option>

</select>

<tr><td colspan="2"><input type="submit" value="Add"/></td></tr>  
</table>  
</form>  
</div>
    </body>
</html>

