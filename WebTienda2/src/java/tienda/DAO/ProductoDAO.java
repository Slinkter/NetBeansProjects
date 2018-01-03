package tienda.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import tienda.bean.Cliente;
import tienda.bean.Producto;


public class ProductoDAO {
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
    
    public List<Producto>  Precio(int numProducto , int altura, int ancho){
        List<Producto> listaProducto = new ArrayList<>();	
        float resultado  = 0.00f;
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
            Producto p1 = new Producto();
            if(rs.next()){
                //p1.setIdProducto(rs.getInt("id_Precio"));
                p1.setNomProducto(rs.getString("descripcion"));
                p1.setPrecio(rs.getInt("precio"));                
                p1.setAltura(altura);
                p1.setAncho(ancho); 
                p1.setPrecio(rs.getInt("precio"));
                precio = p1.getPrecio();
                
                    switch (numProducto){            
                    case 1 :{                
                        resultado = ((altura * ancho)/900) * precio;                
                        break;}
                    case 2 :{
                        resultado = ((altura * ancho)/900) * precio;            
                        break;}
                    case 3 :{
                        resultado = ((altura * ancho)/900) * precio;
                        break;            }
                    case 4 :{
                        resultado = ((altura * ancho)/900) * precio;
                    }case 5 :{
                        resultado = ((altura * ancho)/900) * precio;
                        break;
                    }case 6 :{
                        System.out.println("Ancho  --> " + ancho) ;
                        System.out.println("Altura --> " + altura );
                        System.out.println("Precio --> " + precio);
                        resultado = altura * ancho/900f;
                        System.out.println("resultado 1 --> "+ resultado);
                        resultado = (resultado * precio);   
                        System.out.println("resultado 2 --> "+ resultado);
                        System.out.println("=============") ;
                        System.out.println("otro" +(altura * ancho)/900) ;
                        break;
                    }case 7 :{
                        resultado = ((altura * ancho)/900) * precio;
                        System.out.println("Producto 7");
                        break;                
                    }case 8 :{
                        resultado = ((altura * ancho)/900) * precio;
                        System.out.println("Producto 8");
                        break;                
                    }case 9 :{
                        resultado = ((altura * ancho)/900) * precio;
                        System.out.println("Producto 9");
                        break;

                    }case 10 :{
                        resultado = ((altura * ancho)/900) * precio;
                        System.out.println("Producto 10");
                        break;

                    }case 11 :{

                    }case 12 :{

                    }case 13 :{

                    }case 14 :{

                    }case 15 :{

                    }case 16 :{

                    }case 17 :{

                    }case 18 :{

                    }case 19 :{

                    }case 20 :{

                    }case 21 :{

                    }case 22 :{

                    }case 23 :{

                    }case 24 :{

                    }case 25 :{

                    }case 26 :{

                    }case 27 :{

                    }case 28 :{


                    }case 29 :{

                    }
                    case 30 :{

                    }
                    case 31 :{


                    }
            
             
             
           }
            p1.setResultado(resultado);       
            listaProducto.add(p1);  
            }                    
        } catch (Exception e) {
        }
        
       
        return listaProducto;
    } 
    
    
    
    
    
}
