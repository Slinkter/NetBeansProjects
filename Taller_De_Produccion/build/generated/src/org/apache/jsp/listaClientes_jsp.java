package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listaClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body  background=\"imagenes/wallpaper-naturaleza-1366x768-4199-27324552[1].jpg\">\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <a class=\"a espacio-derecha1 re \"> </a>   \n");
      out.write("\n");
      out.write("                <img class=\"a espacio-derecha re\" src=\"imagenes/logo2.png\" alt=\"\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"Login.jsp\"> Clientes</a>           \n");
      out.write("\n");
      out.write("\n");
      out.write("                <a class=\"a espacio-derecha re\" href=\"Login1.jsp\"> Personal</a>\n");
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
      out.write("        </header>\n");
      out.write("       \n");
      out.write("        <HR width=100% align=\"left\"> \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div>\n");
      out.write("                <h1 >Clientes</h1>\n");
      out.write("                <p>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"table\" style=\"width: 60%; float:left\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("\n");
      out.write("                    <tr style=\"color:#269abc; background-color: \">\n");
      out.write("                        <th>\n");
      out.write("                            Nombre\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            Usuario\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            Habilitado\n");
      out.write("                        </th>\n");
      out.write("\n");
      out.write("                        <th colspan=\"3\">\n");
      out.write("                            Operaciones\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body >\n");
      out.write(" \n");
      out.write("        <br>\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("    <form action=\"#\" method=\"post\" >\n");
      out.write("\n");
      out.write("        <input class=\"boton1\" type=\"button\" value=\"Nuevo Clientee\" onclick=\"location.href = 'Cliente?accion=NUEVO_0'\" >\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br><br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("     <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("    <footer>     \n");
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
      out.write("            <strong>  Programacion Internet</strong>\n");
      out.write("            <br>\n");
      out.write("            <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("            <strong>  Universidad de lima ,2015</strong> \n");
      out.write("            <br>\n");
      out.write("            <a class=\"a espacio-derecha1 re \"> </a> \n");
      out.write("            <strong>  GRUPO XYZ</strong>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </footer>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("cliente");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listaCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>        <td>\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.nombres}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.correo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            <td>\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.habilitado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                            </td>\n");
          out.write("                            \n");
          out.write("                                <td><a href=\"Cliente?accion=HABILITAR&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-info btn-xs active\" >Habilitar</a></td>\n");
          out.write("                                <td><a href=\"Cliente?accion=EDITAR&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" ><span class=\"glyphicon glyphicon-menu-hamburger\" aria-hidden=\"true\"></span>Editar</a></td>\n");
          out.write("                                <td><a href=\"Cliente?accion=ELIMINAR&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>Eliminar</a></td>\n");
          out.write("                                ");
          out.write("\n");
          out.write("                        </tr>   ");
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
