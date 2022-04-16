<%-- 
    Document   : processloginSupervisor
    Created on : Jul 8, 2021, 12:37:56 PM
    Author     : USER
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
        String spId = request.getParameter("spId");   
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/las?" + "user=root&password=admin");    
        PreparedStatement pst = conn.prepareStatement("Select spId,password from supervisorprofile where spId=? and password=?");
        pst.setString(1, spId);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next())           {
           out.println("Valid login credentials");
           out.println("<script type=\"text/javascript\">");
                out.println("alert(\"Sucess Login\")");
                out.println("</script >");
    %>
            <jsp:forward page = "supervisorprofile.jsp" />   
     <%       
        }
           else
           out.println("Invalid login credentials");
           request.setAttribute("error", "Login was unsuccessful, Wrong Supervisor Id or password");
                    RequestDispatcher rd = request.getRequestDispatcher("loginsupervisor.jsp");
                    rd.forward(request,response);
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>
    </body>
</html>
