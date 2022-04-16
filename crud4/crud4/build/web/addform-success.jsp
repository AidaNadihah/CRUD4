<%-- 
    Document   : addform-success
    Created on : Jul 5, 2021, 4:38:03 PM
    Author     : azri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <%  out.println("<script type=\"text/javascript\">");
                out.println("alert(\"Record Sucess saved\")");
                out.println("</script >");
                %>
<jsp:include page="EmployeeForm.jsp"></jsp:include>  
    </body>
</html>