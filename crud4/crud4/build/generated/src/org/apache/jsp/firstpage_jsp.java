package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class firstpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>First Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write(" html {\n");
      out.write("                height: 100%;\n");
      out.write("                width: 100%;\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-color: #e6f2ff;\n");
      out.write("        }\n");
      out.write("            body {\n");
      out.write("                height: 100%;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("    background-color: powderblue; \n");
      out.write("    border: none;\n");
      out.write("    color: black;\n");
      out.write("    padding: 15px 32px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 12px;\n");
      out.write("    width: 190px;\n");
      out.write("    margin-left: 30px;\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("}\n");
      out.write(".button:hover {\n");
      out.write("    border: 4px solid rgb(64, 64, 145);\n");
      out.write("    width: 190px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("   text-align: center;\n");
      out.write("   color: teal;\n");
      out.write("   font-family: merriweather;\n");
      out.write("   position: relative;\n");
      out.write("   bottom:-30px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write(".container {\n");
      out.write("    position:absolute;\n");
      out.write("    right: 0;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    margin-right: 37%;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    width: 250px;\n");
      out.write("    padding: 30px;\n");
      out.write("    height: 280px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon {\n");
      out.write("    height:20px;\n");
      out.write("}\n");
      out.write("h2{\n");
      out.write("    margin-top: 5px;\n");
      out.write("    text-align: center;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>LEAVE APPLICATION SYSTEM</h1><br>\n");
      out.write("        <h2>LOGIN&ensp;FOR&ensp;STAFF</h2>\n");
      out.write("        <div class=\"bg-img\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                \n");
      out.write("                <button class=\"button\" onclick=\"myFunction()\">&nbspEMPLOYEE</button>\n");
      out.write("                <button class=\"button\" onclick=\"myFunction2()\">&nbspSUPERVISOR</button>\n");
      out.write("                <button class=\"button\" onclick=\"myFunction3()\">&nbspADMIN</button>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                function myFunction() {\n");
      out.write("                    window.location.href = \"loginemployee.jsp\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function myFunction2() {\n");
      out.write("                    window.location.href = \"loginsupervisor.jsp\";\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                function myFunction3() {\n");
      out.write("                    window.location.href = \"loginadmin.jsp\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
