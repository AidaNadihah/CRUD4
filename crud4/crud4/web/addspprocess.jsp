<%-- 
    Document   : addspprocess
    Created on : Jul 9, 2021, 8:11:32 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.supervisor.supervisordao"%>  
<jsp:useBean id="u" class="com.supervisor.superprofile"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%  
int i=supervisordao.saveSupervisor(u);  
if(i>0){  
 out.println("<script type=\"text/javascript\">");
                out.println("alert(\"Record Sucess saved\")");
                out.println("</script >");
                %>
<jsp:include page="addSupervisor.jsp"></jsp:include>  
<%
}else{  
  out.println("<script type=\"text/javascript\">");
                out.println("alert(\"Record unsucess saved\")");
                out.println("</script >");
                %>
<jsp:include page="addSupervisor.jsp"></jsp:include>
<%
}  
%>
    </body>
</html>
