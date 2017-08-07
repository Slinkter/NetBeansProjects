/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import usuario.ws.WSUsuarioService;

/**
 *
 * @author Administrador
 */
public class LoginServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost:8084/WS_Usuario/WSUsuario?wsdl")

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        RequestDispatcher rd;
        WSUsuarioService service = new usuario.ws.WSUsuarioService();

        boolean entrar = service.getWSUsuarioPort().login(usuario, clave);

        if (entrar == true) {
            rd = request.getRequestDispatcher("listaClientes.jsp");
            rd.forward(request, response);
        } else {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("Error", "Error, no se ha ingresado correctamente los datos");
            response.sendRedirect("Login.jsp");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static boolean login(java.lang.String usuario, java.lang.String clave) {
        usuario.ws.WSUsuarioService service = new usuario.ws.WSUsuarioService();
        usuario.ws.WSUsuario port = service.getWSUsuarioPort();
        return port.login(usuario, clave);
    }

}
