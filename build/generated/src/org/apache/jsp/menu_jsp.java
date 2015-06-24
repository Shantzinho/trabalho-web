package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>O Banco do Futuro</title>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.css\"  media=\"screen,projection\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                background-image: url(images/index_background.jpg);\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color: #0059bc\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col z-depth-2 m10 s10 l10 grey lighten-4 offset-l1 offset-m1 offset-s1\" style=\"margin-top: 2%\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <!--<div class=\"col s12 center\" style=\"margin-top: 5%\">\r\n");
      out.write("                            <h4 class=\"grey-text text-darken-5\">Informe a senha.</h4>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"input-field col s2 offset-s5\">\r\n");
      out.write("                                        <input id=\"dig1\" type=\"password\" class=\"validate center\" style=\"font-size: 50px\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"input-field col s1\">\r\n");
      out.write("                                      <input disabled id=\"dig2\" type=\"password\" class=\"validate center\" style=\"font-size: 50px\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"input-field col s1\">\r\n");
      out.write("                                      <input disabled id=\"dig3\" type=\"password\" class=\"validate center\" style=\"font-size: 50px\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"input-field col s1\">\r\n");
      out.write("                                      <input disabled id=\"dig4\" type=\"password\" class=\"validate center\" style=\"font-size: 50px\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </div>-->\r\n");
      out.write("                        <div class=\"row\" style=\"margin-top: 10%\">\r\n");
      out.write("                            <div class=\"col s6\">\r\n");
      out.write("                                <a class=\"center teal darken-1 waves-effect waves-light btn-large s8\" style=\"width: 100%\">Saldo</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col s6\">\r\n");
      out.write("                                <a class=\"center teal darken-1 waves-effect waves-light btn-large s8\" style=\"width: 100%\">Extrato</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\" style=\"margin-top: 5%\">\r\n");
      out.write("                            <div class=\"col s6\">\r\n");
      out.write("                                <a class=\"center teal darken-1 waves-effect waves-light btn-large s8\" style=\"width: 100%\">Dep&oacute;sito</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col s6\">\r\n");
      out.write("                                <a class=\"center teal darken-1 waves-effect waves-light btn-large s8\" style=\"width: 100%\">Saque</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\" style=\"margin-top: 5%\">\r\n");
      out.write("                            <div class=\"col s6\">\r\n");
      out.write("                                <a class=\"center teal darken-1 waves-effect waves-light btn-large s8\" style=\"width: 100%\">Transfer&ecirc;ncia</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col s6\">\r\n");
      out.write("                                <a class=\"center teal darken-1 waves-effect waves-light btn-large s8\" style=\"width: 100%\">Investimento</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
