<%-- 
    Document   : EmployeeFrom
    Created on : Jul 7, 2021, 10:46:12 PM
    Author     : azri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Employee Form</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            
            .box{
                border-radius: 10px;
                padding-left: 30px;
                margin-left: 450px;
                left: 90px;
                right: 90px;
                margin-top: 60px;
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
            <li><a href="EmployeeForm.jsp">Apply Leave</a></li>
            <li><a href="Historyemployee.jsp">History Leave</a></li>
            <li><a href="EmployeeProfile.jsp">Profile</a></li>
            <li><a href="firstpage.jsp">Logout</a></li>
        </div>
</ul>
          
        <div class="box">
<h1>Leave Form</h1>  
<form action="pinpoint.jsp" method="post">  
<table>  
<tr><td>Name:</td>
    <td><input type="text" name="name"/></td>
</tr>  

<tr><td>Employee Id:</td>
    <td><input type="text" name="empId"/></td>
</tr>  

<tr><td>From Date:</td>
    <td><input type="date" name="fromdate"/></td>
</tr>  

<tr><td>To Date:</td>
    <td><input type="date" name="todate" /></td>
</tr>  

<tr><td>Leave Type:</td>   
<td>  
<select name="leavetype" style="width:155px">  
<option>Casual Leave</option>  
<option>Medical Leave</option>  
<option>Emergency Leave</option>   
</select>  
</td>
</tr>  

<tr><td>Description</td>
    <td><input type="text" name="des"></td>
</tr>
<tr><td><input type="hidden" name="status" value="Waiting"></td></tr>
<tr><td colspan="2"><input type="submit" value="Apply"/></td></tr>  
</table>  
</form>  
</div>
    </body>
</html>
