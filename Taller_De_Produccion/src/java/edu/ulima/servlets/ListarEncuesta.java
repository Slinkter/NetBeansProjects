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
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author cynthia_
 */
@WebServlet(name = "ListarEncuesta", urlPatterns = {"/ListarEncuesta"})
public class ListarEncuesta extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          HttpSession ses = request.getSession(true);
        // PASO 2
        
        // PASO 3
        VeterinariaIF dao = new VeterinariaDAO();
        List<encuesta> lencuestas = dao.listarEncuesta();
        
        // PASO 4
        ses.setAttribute("listaEncuesta", lencuestas);
        // PASO 5
        String pag = "/listaEncuestas.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(pag);
        rd.forward(request, response);     
       
}
}
