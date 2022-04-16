<%-- 
    Document   : supervisorupdate
    Created on : Jul 8, 2021, 12:52:43 AM
    Author     : USER
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Update Supervisor</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    
                 .p{
			text-decoration: underline;
		}
		
		.b{
			background-image: linear-gradient(to right,#ccccff,#cce6ff,#ffcccc);
		}
		
                * {
                  box-sizing: border-box;
                }

                body {
                  margin: 0;
                }
                
                .box {
                border-radius: 8px;
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

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
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

/* takboleh masuk lagii */

.footer {
  padding: 20px;
  text-align: center;
  background: #ddd;
  margin-top: 20px;
}

</style>
</head>
<body class="b">  
  


<div class="sidenav">
   <a href="supervisorprofile.jsp">Profile</a>
  <a href="supervisorview.jsp">Employee Leave</a>
  <a href="loginsupervisor.jsp">Log Out</a>
</div>
   
          <%@page import="com.supervisor.supervisordao,com.supervisor.superprofile"%>  
  
<%  
String id=request.getParameter("id");  
superprofile u=supervisordao.getProfileById(Integer.parseInt(id));  
%>  

 <div class="box">
     <form action="supervisorupdateprocess.jsp" method="post">
        <h1>Update Employee Info</h1>
        <br>
        
        <table>
            <tr><td>Employee Id</td><td>
                    <input type="text" name="spId" value="<%=u.getSpId() %>" /></td></tr>
		<tr><td>Name</td><td>
                <input type="text" name="name" value="<%=u.getName() %>" /></td></tr>
		<tr><td>Phone Number</td><td>
		<input type="text" name="phonenum" value="<%=u.getPhonenum() %>" /></td></tr>
                <tr><td>Email</td><td>
		<input type="text" name="email" value="<%=u.getEmail() %>" /></td></tr>
		
                <tr><td><input type="submit" value="Update" ></td></tr>
                    
        </table>
            </form>
        </div>
        
    </body>
</html>

    

</body>
</html>
