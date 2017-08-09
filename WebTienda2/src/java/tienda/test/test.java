/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.test;

import java.util.List;
import tienda.DAO.ClienteDAO;
import tienda.bean.Cliente;

/**
 *
 * @author Asus
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        ClienteDAO dao2 = new ClienteDAO();       
        Cliente c4 =  new Cliente();
        
        c4.setNombre("juan");
        c4.setApellido("carrasco");
        c4.setDireccion("calle tukan");
        c4.setDistrito("Cajamarca");
        c4.setTelefono("5468464");
        c4.setCorreo("carlos@cueva");
        c4.setCuenta(100.36f);
        c4.setEstado("deuda");
        
        dao2.insertarCliente(c4);
        
       
    }
    
}
