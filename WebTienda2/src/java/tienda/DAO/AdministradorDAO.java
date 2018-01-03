
package tienda.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tienda.bean.Administrador;

public class AdministradorDAO {
    	
        String  driver = "com.mysql.jdbc.Driver";
        String  Conectar = "jdbc:mysql://127.0.0.1:3306/vidrieria";
        String usuario = "root";
        String password = "";
        Connection con1 ;
        
        public Connection getConnection(){        
			
        try {
                    	
            Class.forName(driver).newInstance();
	    con1 = DriverManager.getConnection(Conectar,usuario,password);
            System.out.println("conectando a la BD");
            //contraseña : 4qu0xGfvoZlpG7GS
        } catch (Exception e){
                    System.out.println("ERROR conectando a la BD");
                    System.out.println("ERROR libreria");
                    
            }
        return con1;

        
	}
        

	public boolean insertarAdmin(Administrador admin){
		
		String id_cliente = admin.getId_admin();
		String name = admin.getName();
		String password = admin.getPassword();
		
		PreparedStatement pstm = null;
		
		String query = "INSERT INTO vidrieria.tb_admin VALUES (?,?,?)";
		
		try{
			Connection con = getConnection();
			
			pstm = con.prepareStatement(query);
			pstm.setString(1, id_cliente);
			pstm.setString(2, name);
			pstm.setString(3, password);
			
			pstm.executeUpdate();
			
			con.close();
			
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	
	}
	
	
	public Administrador loginAdmin(String usuario, String contraseña){
            
                Administrador admin = null;		
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "SELECT * FROM vidrieria.Administrador where nombre = ? and  contraseña = ? ";		
		
		try{
			Connection con = getConnection();			
			pstm = con.prepareStatement(query);
			pstm.setString(1, usuario);
                        pstm.setString(2, contraseña);
			rs = pstm.executeQuery();	
			if(rs.first()){
				String nombre = rs.getString("nombre");//base de datos
				String password = rs.getString("contraseña");//base de datos
				admin = new Administrador(nombre, password);				
			}	
			con.close();				
		}catch(SQLException e){
			e.printStackTrace();
                        System.out.println("tabla incorrecta");
		}  
          return admin;                
	}
	
	

}
