package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.las.formdao;
import com.las.form;
import java.util.*;

public final class supervisorview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>  \n");
      out.write("  \n");
      out.write("<html>  \n");
      out.write("<head>  \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \n");
      out.write("<title>View Users</title>  \n");
      out.write("<style>\n");
      out.write("    .box{\n");
      out.write("        border-radius: 10px;\n");
      out.write("        padding-left: 30px;\n");
      out.write("\tpadding-right: 30px;\n");
      out.write("\tmargin-left: 300px;\n");
      out.write("\tleft: 90px;\n");
      out.write("\tright: 90px;\n");
      out.write("        margin-top: 20px;\n");
      out.write("        min-width: 50px;\n");
      out.write("        background-color: #e6f2ff;\n");
      out.write("        display: block;\n");
      out.write("        -webkit-box-sizing: content-box;\n");
      out.write("        -moz-box-sizing: content-box;\n");
      out.write("        box-sizing: content-box;\n");
      out.write("        max-height: 1000px;\n");
      out.write("        max-width: 800px;\n");
      out.write("        border-style: outset;\n");
      out.write("        height: 500px;\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("    .b{\n");
      out.write("\tbackground-image: linear-gradient(to right,#ccccff,#cce6ff,#ffcccc);\n");
      out.write("\t}\n");
      out.write("    \n");
      out.write("    .t{\n");
      out.write("        background-color:cornsilk;\n");
      out.write("        position:absolute;\n");
      out.write("    top: 200px;\n");
      out.write("    left: 10px;\n");
      out.write("    width: 150px;\n");
      out.write("    height: 140px;\n");
      out.write("    \n");
      out.write("    background-position: 0% 20%;\n");
      out.write("    background-size: cover;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Style the side navigation */\n");
      out.write(".sidenav {\n");
      out.write("  height: 100%;\n");
      out.write("  width: 200px;\n");
      out.write("  position: fixed;\n");
      out.write("  z-index: 1;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  background-color: #003366;\n");
      out.write("  overflow-x: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Side navigation links */\n");
      out.write(".sidenav a {\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change color on hover */\n");
      out.write(".sidenav a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the content */\n");
      out.write(".content {\n");
      out.write("  margin-left: 200px;\n");
      out.write("  padding-left: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>  \n");
      out.write("<body class=\"b\">  \n");
      out.write("  \n");
      out.write("  \n");
      out.write(" \n");
      out.write("  \n");
      out.write(" \n");
      out.write("<ul>\n");
      out.write("    <div class=\"sidenav\"> \n");
      out.write("            <li><a href=\"supervisorview.jsp\">View Employee Leave</a></li>\n");
      out.write("            <li><a href=\"supervisorprofile.jsp\">Supervisor Profile</a></li>\n");
      out.write("            <li><a href=\"firstpage.jsp\">Log Out</a></li>\n");
      out.write("    </div>\n");
      out.write("        </ul>\n");
      out.write("\n");
  
List<form> list=formdao.getAllRecords();  
request.setAttribute("list",list);  

      out.write(" \n");
      out.write("<div class=\"box\">\n");
      out.write("    <h1>Leave Application</h1>\n");
      out.write("    <br>\n");
      out.write("<table border=\"1\" width=\"90%\">  \n");
      out.write("<tr><th>Id</th>\n");
      out.write("    <th>Name</th>\n");
      out.write("    <th>Employee Id</th>\n");
      out.write("    <th>From Date</th>  \n");
      out.write("    <th>To Date</th>\n");
      out.write("    <th>Leave Type</th>\n");
      out.write("    <th>Description</th>\n");
      out.write("    <th>Status</th> \n");
      out.write("    <th>Edit Form</th>\n");
      out.write("    </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("</table>  \n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("</body>  \n");
      out.write("</html>  \n");
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
          out.write("    \n");
          out.write("<tr><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getEmpId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getFromdate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getTodate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getLeavetype()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getDes()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getStatus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td><a href=\"editformsupervisor.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a>  \n");
          out.write("   \n");
          out.write("\n");
          out.write("\n");
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
