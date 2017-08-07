
package repaso.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import repaso.DAO.EmpleadoDAO;
import repaso.DAO.EmpleadoIF;
import repaso.bean.empleado;


public class s02 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession ses = request.getSession(true);
        String accion =  request.getParameter("accion") ;
        String idString = request.getParameter("id");
        int id = -1;
        if (idString !=null)
            id = Integer.parseInt(idString);            
               
        EmpleadoIF dao = new EmpleadoDAO();
        empleado e = new empleado();
        switch(accion) {
            case "CONSULTA":
                empleado x1 = dao.findByID(id);
                System.out.println("llega hasta consulta");
                ses.setAttribute("emp", x1);
                RequestDispatcher rd1 = request.getRequestDispatcher("/mostrar.jsp");
                rd1.forward(request, response);
                return;
                
            case "ELIMINAR":
                e.setId(id);
                dao.remove(e);
                response.sendRedirect("s01");
                return;
            
            case "AGREGAR":
                empleado emp = new empleado();
                emp.setNombre(request.getParameter("nombre"));
                emp.setApellido(request.getParameter("apellido"));
                emp.setDepartamento(request.getParameter("departamento"));
                emp.setFoto(request.getParameter("foto"));
                dao.create(emp); 
                response.sendRedirect("s01");
                return;                
            case "EDITAR":
                empleado ee = dao.findByID(id);
                ses.setAttribute("emp", ee);
                RequestDispatcher rd = request.getRequestDispatcher("/editarEmpleado.jsp");
                rd.forward(request, response);                             
                return;
                
            case "UPDATE":
                empleado eu = new empleado();
                eu.setId(id);
                eu.setNombre(request.getParameter("nombre"));
                eu.setApellido(request.getParameter("apellido"));
                eu.setDepartamento(request.getParameter("departamento"));
                eu.setFoto(request.getParameter("foto"));
                dao.update(eu);
                response.sendRedirect("s01");
                return;
                    
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
