package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin Profile</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .box{\n");
      out.write("                border-radius: 8px;\n");
      out.write("                padding-left: 30px;\n");
      out.write("                margin-left: 450px;\n");
      out.write("                left: 90px;\n");
      out.write("                right: 90px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                min-width: 50px;\n");
      out.write("                background-color: #e6f2ff;\n");
      out.write("                display: block;\n");
      out.write("                -webkit-box-sizing: content-box;\n");
      out.write("                -moz-box-sizing: content-box;\n");
      out.write("                box-sizing: content-box;\n");
      out.write("                max-height: 800px;\n");
      out.write("                max-width: 400px;\n");
      out.write("                border-style: outset;\n");
      out.write("                height: 350px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        \n");
      out.write("                \n");
      out.write("                .b{\n");
      out.write("\t\t   background-image: linear-gradient(to right,#ccccff,#cce6ff,#ffcccc);\n");
      out.write("\t\t}\n");
      out.write("                \n");
      out.write("                .t{\n");
      out.write("                background-color:cornsilk;\n");
      out.write("                position:absolute;\n");
      out.write("                top: 200px;\n");
      out.write("                left: 10px;\n");
      out.write("                width: 150px;\n");
      out.write("                height: 140px;\n");
      out.write("\n");
      out.write("                background-position: 0% 20%;\n");
      out.write("                background-size: cover;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                /* Style the side navigation */\n");
      out.write("            .sidenav {\n");
      out.write("              height: 100%;\n");
      out.write("              width: 200px;\n");
      out.write("              position: fixed;\n");
      out.write("              z-index: 1;\n");
      out.write("              top: 0;\n");
      out.write("              left: 0;\n");
      out.write("              background-color: #003366;\n");
      out.write("              overflow-x: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            /* Side navigation links */\n");
      out.write("            .sidenav a {\n");
      out.write("              color: white;\n");
      out.write("              padding: 16px;\n");
      out.write("              text-decoration: none;\n");
      out.write("              display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Change color on hover */\n");
      out.write("            .sidenav a:hover {\n");
      out.write("              background-color: #ddd;\n");
      out.write("              color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the content */\n");
      out.write("            .content {\n");
      out.write("              margin-left: 200px;\n");
      out.write("              padding-left: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("  \n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body class=\"b\">\n");
      out.write("        \n");
      out.write("   \n");
      out.write("<ul>\n");
      out.write("          <div class=\"sidenav\">  \n");
      out.write("             <li><a href=\"addEmployee.jsp\">Add New Employee</a></li>\n");
      out.write("            <li><a href=\"addSupervisor.jsp\">Add New Supervisor</a></li>\n");
      out.write("            <li><a href=\"adminview.jsp\">View Employee</a></li>\n");
      out.write("            <li><a href=\"viewsupervisor.jsp\">View Supervisor</a></li>\n");
      out.write("            <li><a href=\"EmployeeProfile.jsp\">Profile</a></li>\n");
      out.write("            <li><a href=\"firstpage.jsp\">Log Out</a></li>\n");
      out.write("       </div>\n");
      out.write("</ul>\n");
      out.write("          \n");
      out.write("        <div class=\"box\">\n");
      out.write("<h1>Employee Add</h1>  \n");
      out.write("<form action=\"addempprocess.jsp\" method=\"post\">  \n");
      out.write("<table> \n");
      out.write("    \n");
      out.write("<tr><td>Employee Id:</td>\n");
      out.write("    <td><input type=\"text\" name=\"empId\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr><td>Name:</td>\n");
      out.write("    <td><input type=\"text\" name=\"name\"/></td>\n");
      out.write("</tr>  \n");
      out.write(" \n");
      out.write("<tr><td>Password:</td>\n");
      out.write("    <td><input type=\"text\" name=\"password\"/></td>\n");
      out.write("</tr>  \n");
      out.write("\n");
      out.write("<tr><td>Phone Number:</td>\n");
      out.write("    <td><input type=\"text\" name=\"phonenum\" /></td>\n");
      out.write("</tr>  \n");
      out.write("\n");
      out.write("<tr><td>Email:</td>\n");
      out.write("    <td><input type=\"text\" name=\"email\" /></td>\n");
      out.write("</tr> \n");
      out.write("\n");
      out.write("<tr><td>Department:</td>\n");
      out.write("    <td><input type=\"text\" name=\"department\" /></td>\n");
      out.write("</tr> \n");
      out.write("\n");
      out.write("<tr><td>Status:</td><td> \n");
      out.write("<select name=\"status\" style=\"width:155px\">\n");
      out.write("<option>Active</option>  \n");
      out.write("<option>Inactive</option>\n");
      out.write("\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<tr><td colspan=\"2\"><input type=\"submit\" value=\"Add\"/></td></tr>  \n");
      out.write("</table>  \n");
      out.write("</form>  \n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
