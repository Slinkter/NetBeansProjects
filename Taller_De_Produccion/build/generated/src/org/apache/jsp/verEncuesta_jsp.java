package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verEncuesta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registrarse al Sistema</title>\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\" ></script>\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <a class=\"a espacio-derecha1 re \"> </a>   \n");
      out.write("\n");
      out.write("                <img class=\"a espacio-derecha re  \" src=\"imagenes/logo2.png\" alt=\"\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <a class=\"a espacio-derecha re \" href=\"Login.jsp\"> Cliente</a>           \n");
      out.write("\n");
      out.write("\n");
      out.write("                <a class=\"a espacio-derecha re \" href=\"Login1.jsp\"> Personal</a>\n");
      out.write("\n");
      out.write("                <a class=\"a espacio-derecha re \" href=\"listaEncuestas.jsp\"> Encuestas </a>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <HR width=100% align=\"left\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <h1>Encuesta</h1>\n");
      out.write("            <form method=\"get\" action=\"Encuestas\">\n");
      out.write("                <p><input type=\"text\" name=\"nombre\" id=\"nombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.emp.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></p>\n");
      out.write("                <p><input type=\"text\" name=\"descripcion\" id=\"descripcion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.emp.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></p>\n");
      out.write("           \n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <footer >     \n");
      out.write("\n");
      out.write("        <div class=\"a re asd\" >\n");
      out.write("            <a class=\"a espacio-derecha1 re  \"> </a>   \n");
      out.write("            <img class=\"imgulima\" src=\"imagenes/logo_footer.png\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"asd\">\n");
      out.write("            <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("            <strong> Ingeniera de Sistemas </strong>\n");
      out.write("            <br>\n");
      out.write("            <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("            <strong>  Programacion Intener</strong>\n");
      out.write("            <br>\n");
      out.write("            <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("            <strong>  Universidad de lima ,2015</strong> \n");
      out.write("            <br>\n");
      out.write("            <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("            <strong>  GRUPO XYZ</strong>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
