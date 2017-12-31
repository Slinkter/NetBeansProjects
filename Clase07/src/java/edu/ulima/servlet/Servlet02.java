package edu.ulima.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Servlet02", urlPatterns = {"/s02"})
public class Servlet02 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // PASO 1: Recuperar la sesion
        HttpSession ses = request.getSession(true);
        
        // PASO 2: Recuperar parametros
        // Notengo parametros
        // pero tengo algo en la sesion
        String usuarioX = (String)ses.getAttribute("KEY");
        
        // PASO 3: TODO de algo
        String l = " hola";

        // PASO 4 : Poner la data en sesion
        // Para que la data se pueda guardar en la sesion
        // ACORDARSE de implementar Serializable
        ses.setAttribute("datos", l);

        // PASO 5: Enviar la rpta
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Rpta mas elaborada</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            
            out.println("<p>" + l + "</p>");
            
            out.println("<br> El usuario de la session es " + usuarioX );
            out.println("<br>");
            out.println("Click para continuar <a href='s03'>Aqui</a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
