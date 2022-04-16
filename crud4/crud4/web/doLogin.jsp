<%-- 
    Document   : doLogin
    Created on : Jun 19, 2021, 12:59:32 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercise</title>
    </head>
    <body>
        <%@ page import ="java.sql.*" %>
<%
    try{
        String empId = request.getParameter("empId");   
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/las?" + "user=root&password=admin");    
        PreparedStatement pst = conn.prepareStatement("Select empId,password from employeeprofile where empId=? and password=?");
        pst.setString(1, empId);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next())           {
           out.println("Valid login credentials");
           out.println("<script type=\"text/javascript\">");
                out.println("alert(\"Sucess Login\")");
                out.println("</script >");
    %>
            <jsp:forward page = "EmployeeProfile.jsp" />   
     <%       
        }
           else
           out.println("Invalid login credentials");
           request.setAttribute("error", "Login was unsuccessful, Wrong Employee Id or password");
                    RequestDispatcher rd = request.getRequestDispatcher("loginemployee.jsp");
                    rd.forward(request,response);
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>
    </body>
</html>
