/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.servlets;

import edu.ulima.bean.ManejadorFechas;
import edu.ulima.bean.cliente;
import edu.ulima.jdbc.VeterinariaDAO;
import edu.ulima.jdbc.VeterinariaIF;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;


/**
 *
 * @author cynthia_
 */
public class Cliente extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8084/WS_Usuario/WSUsuario.wsdl")
    private usuario.ws.WSUsuarioService service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8084/WEBSERRVICEENVIARCORREO/WSENVIARCORREP.wsdl")
    private ws.eniar.correo.WSENVIARCORREP_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        
               
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
        cliente e = new cliente();
        
        
        
        switch ( accion ) {
            case "HABILITAR":
                 e.setId(id);
        dao.habilitarEncuestaCliente(e);
        response.sendRedirect("ListarClientes");
        return;
        // PASO 4
        // PASO 5
        
            case "EDITAR"://Me trae un cliente para editarlo mas adelante
        cliente ee = dao.findById(id);

        ses.setAttribute("emp", ee);

        RequestDispatcher rd =  
            request.getRequestDispatcher("/editarCliente.jsp");
        rd.forward(request, response);
      return;
              
                 case "NUEVO_0":
                 RequestDispatcher rd1 =  
            request.getRequestDispatcher("/nuevoCliente.jsp");
        rd1.forward(request, response);
        return;
                     
                 case "NUEVO":
                // ASUMIR que recibimos todo ....
                cliente eg = new cliente();
                eg.setNombres(request.getParameter("NOMBRE"));
                eg.setPaterno(request.getParameter("paterno"));
                eg.setMaterno(request.getParameter("materno"));
                eg.setFecha_nacimiento(request.getParameter("fecha") );
                eg.setCorreo(request.getParameter("correo") );
                //System.out.println(eg);
                
                dao.create(eg);
                
                 ///ENVIO DE CORREO DE CONFIRMACIÓN
         String email=request.getParameter("correo");
        String correo="click para confirmar registro http://localhost:8084/VeterinariaAnimalitosEP/notificacion.jsp";
        String asunto="Correo de confirmación Venerinaria Animalitos ";
        enviarcorreodeconfirmacion(email,correo, asunto);
                
                // PASO 5
                response.sendRedirect("ListarClientes");
                return;
            case "ELIMINAR":
        e.setId(id);
        dao.remove(e);
        // PASO 4
        // PASO 5
        response.sendRedirect("ListarClientes");
                return;
                    
                case "UPDATE":
                // ASUMIR que recibimos todo ....
                cliente eu = new cliente();
                eu.setId(id);
                eu.setNombres( request.getParameter("nombre"));
                eu.setPaterno( request.getParameter("paterno"));
                eu.setMaterno(request.getParameter("materno"));
                eu.setCorreo(request.getParameter("correo") );
                
                
                dao.update(eu);
                response.sendRedirect("ListarClientes");
                return;
        }
        
        
        
        
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void enviarcorreodeconfirmacion(java.lang.String correodestino, java.lang.String mensaje, java.lang.String asunto) {
        ws.eniar.correo.WSENVIARCORREP_Service service = new ws.eniar.correo.WSENVIARCORREP_Service();
        ws.eniar.correo.WSENVIARCORREP port = service.getWSENVIARCORREPPort();
        port.enviarcorreodeconfirmacion(correodestino, mensaje, asunto);
    }

    

   
    
    
    
    
    
}
