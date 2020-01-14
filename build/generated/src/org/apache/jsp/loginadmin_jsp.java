package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>TheBuukstore</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("         <title>\n");
      out.write("            Manage The BuukStore\n");
      out.write("        </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("        <script src=\"js/jquery-3.4.1.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <nav class=\"nav main-nav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("                    <li><a href=\"store.jsp\">STORE</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">ABOUT</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("                    <li><a href=\"register.html\">SIGN UP</a></li>\n");
      out.write("                    <ul><a href=\"loginadmin.jsp\">ADMIN</a></ul>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"panel panel-success\">\n");
      out.write("                <div class=\"panel-heading\" align=\"center\">\n");
      out.write("                    <h4><b><font color=\"black\">Login Admin Page</font> </b></h4>\n");
      out.write("                    <form action=\"LoginAdminServlet\" method=\"post\" >\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                   Username \n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    :\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Masukkan Username\" required=\"required\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    Password\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    :\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Masukkan Password\" required=\"required\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                </td>\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success\" style=\"width: 195px;\"><b>Login</b></button>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
