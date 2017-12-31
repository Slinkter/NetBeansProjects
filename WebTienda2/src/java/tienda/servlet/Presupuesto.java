
package tienda.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tienda.DAO.ClienteDAO;
import tienda.DAO.ProductoDAO;
import tienda.bean.Cliente;
import tienda.bean.Producto;


public class Presupuesto extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
        HttpSession ses = request.getSession(true);
        //======================================================
        String producto = request.getParameter("producto");            
        String ancho = request.getParameter("ancho");
        String altura = request.getParameter("altura");
        //======================================================        
        int a = Integer.parseInt(producto);
        int b = Integer.parseInt(ancho);
        int c = Integer.parseInt(altura);
        //======================================================  
        ProductoDAO productodao =  new ProductoDAO();
        List<Producto> listado = productodao.Precio(a, b, c);
        System.out.println("======================================================  ");
        System.out.println(listado);
        System.out.println("======================================================  ");
        ses.setAttribute("listado", listado);        
        RequestDispatcher rd = request.getRequestDispatcher("AdminAddPresupuesto2.jsp");        
        rd.forward(request, response);      
        //======================================================    
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
