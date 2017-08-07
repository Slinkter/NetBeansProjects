/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ulima.servlets;



import edu.ulima.bean.encuesta;
import edu.ulima.jdbc.VeterinariaDAO;
import edu.ulima.jdbc.VeterinariaIF;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tita
 */

@WebServlet(name = "encuestas", urlPatterns = {"/Encuestas"})
public class Encuesta extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // PASO 1
        HttpSession ses = request.getSession(true);
        // PASO 2
        String accion = request.getParameter("accion");
        String idString = request.getParameter("id");
        int id = -1;
        if ( idString != null ) 
            id = Integer.parseInt(idString);
        // PASO 3
        VeterinariaIF dao = new VeterinariaDAO();
        encuesta enc = new encuesta();
        switch ( accion ) {
           
               case "VER"://Me trae un cliente para editarlo mas adelante
        encuesta eN = dao.finddById(id);

        ses.setAttribute("emp", eN);

        RequestDispatcher rd3 =  
            request.getRequestDispatcher("/verEncuestas.jsp");
        rd3.forward(request, response);
      return;
                   
            case "EDITAR"://Me trae un cliente para editarlo mas adelante
        encuesta e = dao.finddById(id);

        ses.setAttribute("emp", e);

        RequestDispatcher rd =  
            request.getRequestDispatcher("/crearEncuesta.jsp");
        rd.forward(request, response);
      return;
                 case "NUEVO_0":
                 RequestDispatcher rd1 =  
            request.getRequestDispatcher("/crearEncuesta.jsp");
        rd1.forward(request, response);
        return;
                 case "NUEVO":
                // ASUMIR que recibimos todo ....
                encuesta en = new encuesta();
                en.setNombre(request.getParameter("nombre"));
                en.setDescripcion(request.getParameter("descripcion"));
                en.setFecha_fin(request.getParameter("fecha_inicio"));
                en.setFecha_inicio(request.getParameter("fecha_fin"));
                
               
                dao.create(en);
                // PASO 5
                response.sendRedirect("ListarEncuesta");
                return;
            case "ELIMINAR":
        enc.setId(id);
        dao.remove(enc);
        // PASO 4
        // PASO 5
        response.sendRedirect("ListarEncuesta");
                return;
                    
                case "UPDATE":
                // ASUMIR que recibimos todo ....
                encuesta encues = new encuesta();
                encues.setId(id);
                encues.setNombre(request.getParameter("nombre"));
//                enc.setFecha_inicio(request.getParameter("fecha_inicio"));
//                enc.setFecha_fin(request.getParameter("fecha_fin"));
                encues.setDescripcion(request.getParameter("descripcion") );
               
                
                dao.update(encues);
                response.sendRedirect("ListarEncuesta");
                return;
        }
    }

 
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

}
