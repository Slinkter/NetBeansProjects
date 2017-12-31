package edu.ulima.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet01 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // PASO 1: Crear o recuperar una sesion
        HttpSession ses = request.getSession(true);
        
        // Paso 2: Recuperar los parametros
        String usuario = request.getParameter("user");
        String clave = request.getParameter("password");
        
        // Podria ser que tenga que sacar ALGO de la sesion
        //String s = (String)ses.getAttribute("XXXX");
        
        // Paso 3: hacer algo con los datos
        // TODO Aqui viene el curso de PRgramacion 5to ciclo
        
        // Paso 4: Colocar algo importante en la Sesion
        ses.setAttribute("KEY", usuario+"******");

        // Paso 5: Enviar la rpta al navegador
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet01</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet01 at " + request.getContextPath() + "</h1>");
            out.println("<br>");
            out.println("Click para continuar <a href='s02'>Aqui</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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

}
