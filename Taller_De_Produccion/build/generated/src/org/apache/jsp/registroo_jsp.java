package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar cliente</title>\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\" ></script>\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\"/><script src=\"https://code.jquery.com/jquery-1.10.2.js\"></script> \n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       <link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("  \n");
      out.write("       \n");
      out.write("  \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.10.2.js\"></script> \n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("        <!no corre este JS>\n");
      out.write("        <!script src=\"js/nuevoCliente.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("                    \n");
      out.write("         var expr = /^[a-zA-Z0-9_\\.\\-]+@[a-zA-Z0-9\\-]+\\.[a-zA-Z0-9\\-\\.]+$/;\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            \n");
      out.write("            $(\"#bEnviar\").click(function(){              \n");
      out.write("               var nombre = $(\"#nombre\").val();\n");
      out.write("                var paterno = $(\"#usuario\").val();\n");
      out.write("                var materno = $(\"#clave\").val();\n");
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
      out.write("    </script>\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                padding-top: 40px;\n");
      out.write("                padding-bottom: 40px;\n");
      out.write("                background-color: #eee;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("              .form-signin .h1{\n");
      out.write("                max-width: 330px;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                color: #eee;\n");
      out.write("                font-size: 55px !important;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .form-signin {\n");
      out.write("                max-width: 330px;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                color: #eee;\n");
      out.write("                \n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .form-signin .form-signin-heading, .form-signin .checkbox {\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                color: #eee;\n");
      out.write("            }\n");
      out.write("            .form-signin .checkbox {\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("            .form-signin .form-control {\n");
      out.write("                position: relative;\n");
      out.write("                font-size: 16px;\n");
      out.write("                height: auto;\n");
      out.write("                padding: 10px;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .form-signin .form-control:focus {\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("            .form-signin input[type=\"text\"] {\n");
      out.write("                margin-bottom: -1px;\n");
      out.write("                border-bottom-left-radius: 0;\n");
      out.write("                border-bottom-right-radius: 0;\n");
      out.write("            }\n");
      out.write("            .form-signin input[type=\"password\"] {\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                border-top-left-radius: 0;\n");
      out.write("                border-top-right-radius: 0;\n");
      out.write("                \n");
      out.write("                .form-signin input[type=\"submit\"] {\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                    border-top-left-radius: 0;\n");
      out.write("                    border-top-right-radius: 0;\n");
      out.write("                    color:black !important;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body   background=\"imagenes/wallpaper-naturaleza-1366x768-3739-82dd82e[1].jpg\">\n");
      out.write("            <h1 class=\"form-signin\">REGISTRO</h1>\n");
      out.write("\n");
      out.write("            <form method=\"post\" action=\"RegistroServlet\">\n");
      out.write("                <p class=\"form-signin\">Nombre:</p>\n");
      out.write("                <p class=\"form-signin\"><input type=\"text\" name=\"nombre\" id=\"nombre\"></p>\n");
      out.write("                <div id=\"mensaje1\" class=\"errores\"> Ingresa tu nombre</div>\n");
      out.write("                <p class=\"form-signin\">Usuario:</p>\n");
      out.write("                <p class=\"form-signin\"><input type=\"text\" name=\"usuario\" id=\"usuario\"></p>\n");
      out.write("                <div id=\"mensaje2\" class=\"errores\"> Ingresa tu usuario</div>\n");
      out.write("                <p class=\"form-signin\">Password:</p>\n");
      out.write("                <p class=\"form-signin\"><input type=\"password\" name=\"clave\" id=\"clave\"></p>\n");
      out.write("                <div id=\"mensaje3\" class=\"errores\"> Ingresa tu contraseña</div>\n");
      out.write("                <p class=\"form-signin\"><input type=\"submit\" value=\"Guardar\" id=\"bEnviar\" >\n");
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
      out.write("        </body>\n");
      out.write("    </html>\n");
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
