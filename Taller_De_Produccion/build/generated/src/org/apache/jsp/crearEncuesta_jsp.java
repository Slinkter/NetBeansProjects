package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearEncuesta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("    <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\" ></script>\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\"/><script src=\"https://code.jquery.com/jquery-1.10.2.js\"></script> \n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       <link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  \n");
      out.write("         \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.10.2.js\"></script> \n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("                    \n");
      out.write("         var expr = /^[a-zA-Z0-9_\\.\\-]+@[a-zA-Z0-9\\-]+\\.[a-zA-Z0-9\\-\\.]+$/;\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            \n");
      out.write("            $(\"#bEnviar\").click(function(){              \n");
      out.write("               var nombre = $(\"#nombre\").val();\n");
      out.write("                var paterno = $(\"#appaterno\").val();\n");
      out.write("                var materno = $(\"#apmaterno\").val();\n");
      out.write("                var correo = $(\"#correo\").val();\n");
      out.write("              \n");
      out.write("                if(nombre == \"\"){\n");
      out.write("                    $(\"#mensaje1\").fadeIn(\"slow\");\n");
      out.write("                    return false;\n");
      out.write("                }     \n");
      out.write("                else{\n");
      out.write("                    $(\"#mensaje1\").fadeOut();\n");
      out.write(" \n");
      out.write("                    if(paterno == \"\"){\n");
      out.write("                        $(\"#mensaje2\").fadeIn(\"slow\");\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    else{\n");
      out.write("                        $(\"#mensaje2\").fadeOut();\n");
      out.write(" \n");
      out.write("                        if(materno == \"\"){\n");
      out.write("                            $(\"#mensaje3\").fadeIn(\"slow\");\n");
      out.write("                            return false;\n");
      out.write("                        }\n");
      out.write("                        else{\n");
      out.write("                            $(\"#mensaje3\").fadeOut();\n");
      out.write(" \n");
      out.write("                            if(correo == \"\" || !expr.test(correo)){\n");
      out.write("                                $(\"#mensaje4\").fadeIn(\"slow\");\n");
      out.write("                                return false;\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write(" \n");
      out.write("            });//click\n");
      out.write("        });//ready\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write(" \n");
      out.write("       \n");
      out.write("         <script>\n");
      out.write("            $(function() {   \n");
      out.write("            $( \"#fechainicio\" ).datepicker();  \n");
      out.write("          });\n");
      out.write("       \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <script>\n");
      out.write("          $(function() {   \n");
      out.write("            $( \"#fechafin\" ).datepicker();  \n");
      out.write("          });\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body background=\"imagenes/wallpaper-naturaleza-1366x768-4199-27324552[1].jpg\">\n");
      out.write("         <header>\n");
      out.write("            <nav>\n");
      out.write("                <a class=\"a espacio-derecha1 re \"> </a>   \n");
      out.write("\n");
      out.write("                <img class=\"a espacio-derecha re  \" src=\"imagenes/logo2.png\" alt=\"\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"ListarClientes\"> Clientes</a>           \n");
      out.write("\n");
      out.write("                <a class=\"a espacio-derecha re \" href=\"Login1.jsp\"> Personal</a>\n");
      out.write("\n");
      out.write("                <a  href=\"ListarEncuesta\"> Encuestas </a>\n");
      out.write("                  <div class=\"container\">\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <p id=\"iconos\" style=\"float:right; width: 20%; display: inline-block;\">\n");
      out.write("                            <img src=\"imagenes/jobs_icon[1].png\" style=\"float: right; width: 15% \" onmouseout=\"this.style.opacity = 1;\n");
      out.write("                                    this.filters.alpha.opacity = '100';\" onmouseover=\"this.style.opacity = 0.2;\n");
      out.write("                                            this.filters.alpha.opacity = '20';\" onclick=\"location.href = 'Login.jsp'\" title=\"Ingreso Empleado\">\n");
      out.write("                            <img src=\"imagenes/icon_clientes[1].png\" style=\"float: right;width: 15%\" onmouseout=\"this.style.opacity = 1;\n");
      out.write("                                    this.filters.alpha.opacity = '100';\" onmouseover=\"this.style.opacity = 0.2;\n");
      out.write("                                            this.filters.alpha.opacity = '20';\" onclick=\"location.href = 'Login.jsp'\" title=\"Ingreso Clientes\">\n");
      out.write("                            <img src=\"imagenes/icono_18[1].png\" style=\"float: right;width: 15%\" onmouseout=\"this.style.opacity = 1;\n");
      out.write("                                    this.filters.alpha.opacity = '100';\" onmouseover=\"this.style.opacity = 0.2;\n");
      out.write("                                            this.filters.alpha.opacity = '20';\" onclick=\"location.href = 'registroo.jsp'\" title=\"Registro\">\n");
      out.write("                            <img src=\"imagenes/images[11].jpg\" style=\"float: right; width: 15% \" onmouseout=\"this.style.opacity = 1;\n");
      out.write("                                    this.filters.alpha.opacity = '100';\" onmouseover=\"this.style.opacity = 0.2;\n");
      out.write("                                            this.filters.alpha.opacity = '20';\" onclick=\"location.href = 'index.html'\" title=\"ir pagina de inicio\">\n");
      out.write("                            \n");
      out.write(" \n");
      out.write("   \n");
      out.write("                            <a href=\"https://www.facebook.com\" target=\"_blank\"><img alt=\"ir a facebook\" height=\"40\" \n");
      out.write("                           src=\"http://3.bp.blogspot.com/-MQuocq7OzfU/UiXwUY81yQI/AAAAAAAAB0Q/h6-R_R2-buI/s1600/face.png\" title=\"siguenos en facebook\" width=\"30\" /></a>\n");
      out.write("                            <a href=\"https://twitter.com/\" target=\"_blank\"><img alt=\"siguenos en Twitter\" height=\"40\" \n");
      out.write("                             src=\"http://2.bp.blogspot.com/-B0wCtNXYV3U/UiX1VnAQSrI/AAAAAAAAB6Q/ILY3m0NJVE8/s1600/Twitter+NEW.png\" title=\" ir a Twitter\" width=\"30\" /></a>\n");
      out.write("                            <a href=\"https://www.youtube.com\" target=\"_blank\"><img alt=\"Canal de youtube\" height=\"40\" \n");
      out.write("                             src=\"http://1.bp.blogspot.com/-NEytJH3mFZ8/UidLG3fePdI/AAAAAAAAB_A/WbH7IJAh1qE/s1600/youtube2.png\" title=\"ir a  youtube\" width=\"30\" /></a>\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <HR width=100% align=\"left\"> \n");
      out.write("        <div>\n");
      out.write("            <h1  class=\"titulo\"  display: inline-block>Encuestas / Crear</h1>\n");
      out.write("            <p>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <HR width=70% align=\"left\"> \n");
      out.write("<div>\n");
      out.write("            <h1 class=\"titulo\" display: inline-block\">Edite los Datos Basicos de una Encuesta</h1>\n");
      out.write("            <p>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <form method=\"post\" action=\"Encuestas\">\n");
      out.write("                <p>Nombre de la Encuesta:</p>\n");
      out.write("                <p><input type=\"text\" name=\"nombre\" id=\"nombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.emp.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></p>\n");
      out.write("                <div id=\"mensaje1\" class=\"errores\"> Dame tu nombre</div>\n");
      out.write("                <p>Fecha Inicio:</p>\n");
      out.write("                <p><input type=\"text\" name=\"fechainicio\" id=\"fechainicio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.emp.fecha_inicio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></p>\n");
      out.write("                <p>Fecha Fin:</p>\n");
      out.write("                <p><input type=\"text\" name=\"fechafin\" id=\"fechafin\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.emp.fecha_fin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></p>\n");
      out.write("                <p>Descripcion de la Encuesta:</p>\n");
      out.write("                <p><input class=\"descripcion\" type=\"text\" name=\"descripcion\" id=\"descripcion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.emp.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></p>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" name=\"accion\"  value=\"UPDATE\">\n");
      out.write("                <input type=\"hidden\" name=\"id\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.emp.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                <p><input class=\"boton1\" type=\"submit\"  id=\"bEnviar\" value=\"Guardar Cambios\" >\n");
      out.write("                    \n");
      out.write("                    ");
 String mensaje = "";
                        if (request.getSession().getAttribute("Error") != null) {
                            mensaje = request.getSession().getAttribute("Error").toString();
                        }
      out.write(' ');
      out.print( mensaje);
      out.write("</p>\n");
      out.write("\n");
      out.write("                ");
 request.getSession().removeAttribute("Error");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("<br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br><br>\n");
      out.write("        <br>\n");
      out.write("        <br><br>\n");
      out.write("      \n");
      out.write("        <footer>     \n");
      out.write("\n");
      out.write("            <div class=\"a re asd\" >\n");
      out.write("                <a class=\"a espacio-derecha1 re  \"> </a>   \n");
      out.write("                <img class=\"imgulima\" src=\"imagenes/logo_footer.png\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"asd\">\n");
      out.write("                <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("                <strong> Ingeniera de Sistemas </strong>\n");
      out.write("                <br>\n");
      out.write("                <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("                <strong>  Programacion Internet</strong>\n");
      out.write("                <br>\n");
      out.write("                <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("                <strong>  Universidad de lima ,2015</strong> \n");
      out.write("                <br>\n");
      out.write("                <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("                <strong>  GRUPO XYZ</strong>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </footer>\n");
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
