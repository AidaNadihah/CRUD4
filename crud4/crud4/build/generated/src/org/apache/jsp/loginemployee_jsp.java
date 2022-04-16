package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginemployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Ubuntu\" rel=\"stylesheet\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("  <title>Sign in</title>\n");
      out.write("\t\n");
      out.write("  <style>\n");
      out.write("   body {\n");
      out.write("        \n");
      out.write("        font-family: 'Ubuntu', sans-serif;\n");
      out.write("        background-image: linear-gradient(to right,#ccccff,#cce6ff,#ffcccc);\n");
      out.write("   }\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    .main {\n");
      out.write("        background-color: #FFFFFF;\n");
      out.write("        width: 400px;\n");
      out.write("        height: 400px;\n");
      out.write("        margin: 7em auto;\n");
      out.write("        border-radius: 1.5em;\n");
      out.write("        box-shadow: 0px 11px 35px 2px rgba(0, 0, 0, 0.14);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .sign {\n");
      out.write("        padding-top: 40px;\n");
      out.write("        color: #8C55AA;\n");
      out.write("        font-family: 'Ubuntu', sans-serif;\n");
      out.write("        font-weight: bold;\n");
      out.write("        font-size: 23px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .un {\n");
      out.write("    width: 76%;\n");
      out.write("    color: rgb(38, 50, 56);\n");
      out.write("    font-weight: 700;\n");
      out.write("    font-size: 14px;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("    background: rgba(136, 126, 126, 0.04);\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    outline: none;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 2px solid rgba(0, 0, 0, 0.02);\n");
      out.write("    margin-bottom: 50px;\n");
      out.write("    margin-left: 46px;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 27px;\n");
      out.write("    font-family: 'Ubuntu', sans-serif;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    form.form1 {\n");
      out.write("        padding-top: 40px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .pass {\n");
      out.write("            width: 76%;\n");
      out.write("    color: rgb(38, 50, 56);\n");
      out.write("    font-weight: 700;\n");
      out.write("    font-size: 14px;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("    background: rgba(136, 126, 126, 0.04);\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    outline: none;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 2px solid rgba(0, 0, 0, 0.02);\n");
      out.write("    margin-bottom: 50px;\n");
      out.write("    margin-left: 46px;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 27px;\n");
      out.write("    font-family: 'Ubuntu', sans-serif;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    .un:focus, .pass:focus {\n");
      out.write("        border: 2px solid rgba(0, 0, 0, 0.18) !important;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .submit {\n");
      out.write("      cursor: pointer;\n");
      out.write("        border-radius: 5em;\n");
      out.write("        color: #fff;\n");
      out.write("        background: linear-gradient(to right, #9C27B0, #E040FB);\n");
      out.write("        border: 0;\n");
      out.write("        padding-left: 40px;\n");
      out.write("        padding-right: 40px;\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("        padding-top: 10px;\n");
      out.write("        font-family: 'Ubuntu', sans-serif;\n");
      out.write("        margin-left: 35%;\n");
      out.write("        font-size: 13px;\n");
      out.write("        box-shadow: 0 0 20px 1px rgba(0, 0, 0, 0.04);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .forgot {\n");
      out.write("        text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);\n");
      out.write("        color: #E1BEE7;\n");
      out.write("        padding-top: 15px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    a {\n");
      out.write("        text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);\n");
      out.write("        color: #E1BEE7;\n");
      out.write("        text-decoration: none\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    @media (max-width: 600px) {\n");
      out.write("        .main {\n");
      out.write("            border-radius: 0px;\n");
      out.write("        }\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body >\n");
      out.write("    ");
  
String profile_msg=(String)request.getAttribute("profile_msg");  
if(profile_msg!=null){  
out.print(profile_msg);  
}  
String login_msg=(String)request.getAttribute("login_msg");  
if(login_msg!=null){  
out.print(login_msg);  
}  
 
      out.write("  \n");
      out.write("  <div class=\"main\" >\n");
      out.write("    <p class=\"sign\" align=\"center\">Login Employee</p>\n");
      out.write("    <form class=\"form1\" method=\"post\" action=\"doLogin.jsp\">\n");
      out.write("      <input class=\"un \" type=\"text\" align=\"center\" placeholder=\"Employee Id\" name=\"empId\">\n");
      out.write("      <input class=\"pass\" type=\"password\" align=\"center\" placeholder=\"Password\" name=\"password\">\n");
      out.write("      <input class=\"submit\" type=\"Submit\" value=\"Submit\" align=\"center\"/>\n");
      out.write("\t<br>\t <span style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\t\n");
      out.write("\t  </form>\n");
      out.write("                \n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
