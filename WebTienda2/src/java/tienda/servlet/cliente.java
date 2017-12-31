
package tienda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tienda.DAO.ClienteDAO;
import tienda.bean.Cliente;


public class cliente extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        HttpSession ses = request.getSession(true);
        String accion =  request.getParameter("accion") ;
        String idString = request.getParameter("id");
        int id = -1;
        if (idString !=null)
            id = Integer.parseInt(idString);            
               
        ClienteDAO dao = new ClienteDAO();
        Cliente c1 = new Cliente();
        switch(accion) {
            case "CONSULTA":     
                  Cliente c3 = dao.getCliente(id );
                  ses.setAttribute("c3", c3);
                  RequestDispatcher rd1 = request.getRequestDispatcher("/mostrarCliente.jsp");
                  rd1.forward(request, response); 
                  return;
            case "ELIMINAR":
                c1.setId_cliente(id);
                dao.remove(c1);
                response.sendRedirect("login2");                
                break;  
            case "AGREGAR":
                Cliente c2 = new Cliente();
                c2.setNombre(request.getParameter("nombre"));
                c2.setApellido(request.getParameter("apellido"));
                c2.setDireccion(request.getParameter("direccion"));
                c2.setDistrito(request.getParameter("districto"));
                c2.setTelefono(request.getParameter("telefono"));
                c2.setCorreo(request.getParameter("correo"));                
                c2.setEstado(request.getParameter("estdo"));               
                dao.insertarCliente(c2);
                response.sendRedirect("login2");
                break;               
            case "EDITAR":
                
                    break;
            case "UPDATE":
                
                        break;
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
