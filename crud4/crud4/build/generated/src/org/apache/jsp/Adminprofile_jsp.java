package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.admin.admindao;
import com.admin.admin;
import java.util.*;

public final class Adminprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Profile</title>\n");
      out.write("        <style>\n");
      out.write("\t\t.p{\n");
      out.write("\t\t\ttext-decoration: underline;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("                .b{\n");
      out.write("\t\t   background-image: linear-gradient(to right,#ccccff,#cce6ff,#ffcccc);\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("                .box {\n");
      out.write("                \n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding-left: 30px;\n");
      out.write("                margin-left: 400px;\n");
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
      out.write("                height: 500px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .t{\n");
      out.write("                    background-color:cornsilk;\n");
      out.write("                    position:absolute;\n");
      out.write("                top: 200px;\n");
      out.write("                left: 10px;\n");
      out.write("                width: 150px;\n");
      out.write("                height: 140px;\n");
      out.write("\n");
      out.write("                background-position: 0% 20%;\n");
      out.write("                background-size: cover;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("        /* Style the side navigation */\n");
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
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"b\">\n");
      out.write("\t\n");
      out.write("      \n");
      out.write("        <ul> <!<!--tukar nama untuk page admin -->\n");
      out.write("      <div class=\"sidenav\">  \n");
      out.write("             <li><a href=\"addEmployee.jsp\">Add New Employee</a></li>\n");
      out.write("            <li><a href=\"addSupervisor.jsp\">Add New Supervisor</a></li>\n");
      out.write("            <li><a href=\"EmployeeProfile.jsp\">Profile</a></li>\n");
      out.write("            <li><a href=\"firstpage.jsp\">Log Out</a></li>\n");
      out.write("       </div>\n");
      out.write(" </ul>\n");
      out.write("        \n");
      out.write("        ");
  
List<admin> list=admindao.getProfile();  
request.setAttribute("list",list);  

      out.write("  \n");
      out.write("\n");
      out.write(" <div class=\"box\">\n");
      out.write("     ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("u");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("     <form action=\"Updateadminprofile.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\">\n");
          out.write("        <h1>Update Admin Info</h1>\n");
          out.write("        <br>\n");
          out.write("        \n");
          out.write("            \n");
          out.write("        <label>Admin Id :</label>\n");
          out.write("\t\t<p class=\"p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getAdId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t<label>Name :</label>\n");
          out.write("\t\t<p class=\"p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t<label>Phone Number :</label>\n");
          out.write("\t\t<p class=\"p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getPhonenum()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                <label>Email    :</label>\n");
          out.write("\t\t<p class=\"p\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("\t\t\n");
          out.write("                \n");
          out.write("        <br>\n");
          out.write("        <input type=\"submit\" value=\"Update\" >\n");
          out.write("           \n");
          out.write("            </form>\n");
          out.write("                 ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
