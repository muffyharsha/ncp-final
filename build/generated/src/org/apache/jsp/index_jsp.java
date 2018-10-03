package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/index_page.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Glegoo:700\" rel=\"stylesheet\"> \n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("      <div class=\"page-header d-flex justify-content-center\">\n");
      out.write("          <h1>Payroll management</h1>      \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      <div class = \"box d-flex justify-content-center\">\n");
      out.write("       <div class=\"card\">\n");
      out.write("     \n");
      out.write("        <span class=\"card-header\">Login here</span>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          \n");
      out.write("        <div class = \"input-box flex-col\">\n");
      out.write("           \n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"employeeID\" aria- describedby=\"emailHelp\" placeholder=\"Enter Employee ID\" required>\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"password\" aria-describedby=\"password\" placeholder=\"Enter password\" required>\n");
      out.write("            <button type=\"button\" id = \"login-button\" class=\"btn btn-primary form-control\">login</button>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("          <a href=\"#\" class=\"card-link\">Forgot password ?</a>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<script src=\"js/index_page.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("\n");
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
