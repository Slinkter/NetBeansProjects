/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.servlets;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import edu.ulima.bean.cliente;
import edu.ulima.jdbc.VeterinariaDAO;
import edu.ulima.jdbc.VeterinariaIF;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "listarclientes", urlPatterns = {"/ListarClientes"})
public class ListarClientes extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          // PASO 1
        HttpSession ses = request.getSession(true);
        // PASO 2
        
        // PASO 3
        VeterinariaIF dao = new VeterinariaDAO();
        List<cliente> lclientes = dao.listarClientes();
        
        // PASO 4
        ses.setAttribute("listaCliente", lclientes);
        // PASO 5
        String pag = "/listaClientes.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(pag);
        rd.forward(request, response);
        
        }
    }

