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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>O Banco do Futuro</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.css\"  media=\"screen,projection\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(images/index_background.jpg);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #0059bc\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"fixed-action-btn\" style=\"bottom: 45px; right: 24px;\">\n");
      out.write("                <a class=\"btn-floating btn-large grey\" title=\"Operações Sem Cartão\" href=\"operacoes_sem_cartao.jsp\">\n");
      out.write("                  <i class=\"large mdi-action-dns\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a class=\"btn-floating teal accent-2\" title=\"Consultas\"><i class=\"large mdi-action-account-balance\"></i></a></li>\n");
      out.write("                  <li><a class=\"btn-floating teal accent-3\" title=\"Pagamentos\"><i class=\"large mdi-action-payment\"></i></a></li>\n");
      out.write("                  <li><a class=\"btn-floating teal accent-4\" title=\"Depósitos\"><i class=\"large mdi-editor-attach-money\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col z-depth-2 m8 s10 l6 grey lighten-4 offset-l3 offset-m2 offset-s1\" style=\"margin-top: 10%\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <form method=\"post\" action=\"ValidaLogin\">\n");
      out.write("                            <div class=\"input-field col s8 offset-s2 center\" style=\"margin-top: 10%\">\n");
      out.write("                                <input id=\"num_cartao\" name=\"num_cartao\" type=\"text\" class=\"validate\">\n");
      out.write("                                <label for=\"num_cartao\">Nº Cart&atilde;o</label>\n");
      out.write("                                <div class=\"input-field col s2 offset-s5\">\n");
      out.write("                                        <input id=\"num_senha\" name=\"num_senha\"  type=\"password\" maxlength=\"6\" class=\"validate\" style=\"font-size: 50px\">\n");
      out.write("                                        <label for=\"num_senha\">Senha</label>\n");
      out.write("                                </div>\n");
      out.write("                                <button class=\"btn waves-effect waves-light\" type=\"submit\" name=\"acessar\">Acessar\n");
      out.write("                                    <i class=\"mdi-content-send right\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"col s12 center\" style=\"margin-top: 15%\">\n");
      out.write("                            <a class=\"center teal darken-2 waves-effect waves-light btn-large s8\" style=\"width: 100%;\" href=\"operacoes_sem_cartao.jsp\">Operações sem Cartão</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
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
}
