package tienda.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import tienda.bean.Producto;


public class ProductoDAO {
    String URL = "jdbc:mysql://localhost:3306/vidrieria?user=root&password=root";
    
    public Connection getConnection(){
        Connection con = null;		
        try {        	
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(URL);			
		} catch (Exception e){
			System.out.println("ERROR conectando a la BD");
		}        
	return con;
	}
    
    public float Precio(int numProducto , int altura, int ancho){
        float resultado  = 0;
        int precio = 0;
        Connection conexion = null;
        PreparedStatement ps = null ;
        ResultSet rs = null;
        String sql = "select id_Precio,descripcion, precio from vidrieria.tb_precio where id_Precio =? ;";
        try {
            conexion =  getConnection();
            
            ps = conexion.prepareStatement(sql);            
            ps.setInt(1, numProducto);
            rs = ps.executeQuery();
            if(rs.next()){
                Producto p1 =  new Producto();                
                p1.setPrecio(rs.getInt("precio"));
                precio = rs.getInt("precio");
                System.out.print("esto es el dao " + precio);            
            }
                    
        } catch (Exception e) {
        }
        
        switch (numProducto){
            case 1 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 1");
                
            }
            case 2 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 2");
                
            }
            case 3 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 3");
                
            }
            case 4 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 4");
                
            }case 5 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 5");
                
            }case 6 :{
                resultado = ((altura * ancho)/900) * precio;
                
                System.out.println("Ancho" +ancho) ;
                System.out.println("Altura " + altura );
                System.out.println("Precio " + precio);
                System.out.println("resultado "+ resultado);
                System.out.println("=============") ;
                System.out.println("otro" +(altura * ancho)/900) ;

            }case 7 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 7");
                
            }case 8 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 8");
                
            }case 9 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 9");
                
            }case 10 :{
                resultado = ((altura * ancho)/900) * precio;
                System.out.println("Producto 10");
                
            }case 11 :{
                System.out.println("Producto 11");
            }case 12 :{
                System.out.println("Producto 12");
            }case 13 :{
                System.out.println("Producto 13");
            }case 14 :{
                System.out.println("Producto 14");
            }case 15 :{
                System.out.println("Producto 15");
            }case 16 :{
                System.out.println("Producto 16");
            }case 17 :{
                System.out.println("Producto 17");
            }case 18 :{
                System.out.println("Producto 18");
            }case 19 :{
                System.out.println("Producto 19");
            }case 20 :{
                System.out.println("Producto 20");
            }case 21 :{
                System.out.println("Producto 21");
            }case 22 :{
                System.out.println("Producto 22");
            }case 23 :{
                System.out.println("Producto 23");
            }case 24 :{
                System.out.println("Producto 24");
            }case 25 :{
                System.out.println("Producto 25");
            }case 26 :{
                System.out.println("Producto 26");
            }case 27 :{
                System.out.println("Producto 27");
            }case 28 :{
                System.out.println("Producto 28");
            
            }case 29 :{
                System.out.println("Producto 29");
            }
            case 30 :{
                System.out.println("Producto 30");
            }
            case 31 :{
                System.out.println("Producto 31");
            }  
            
        }
        
        //resultado = altura * ancho * precio;
        
        
        return resultado;
    } 
    
    
    
    
    
}
