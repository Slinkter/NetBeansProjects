
package tienda.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tienda.bean.Cliente;

public class ClienteDAO {
    
    String URL = "jdbc:mysql://localhost:3306/vidrieria?user=root&password=root";

	public Cliente  insertarCliente(Cliente cli){	
		
		int id_cliente = cli.getId_cliente();
		String nombre = cli.getNombre();                 
		String apellido = cli.getApellido();
                String direccion =  cli.getDireccion();
                String distrito = cli.getDistrito();
                String telefono = cli.getTelefono();
                String correo = cli.getCorreo();
                float cuenta = cli.getCuenta();
		String estado = cli.getEstado();   
		Connection conexion = null;
                PreparedStatement ps = null ;
		
		String sql = "INSERT INTO `vidrieria`.`tb_cliente` (`estado`, `direccion`, `nombre`, `apellido`, `correo`, `telefono`, `distrito`, `cuenta`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try{
			
                        conexion = getConnection();
                        
                        ps = conexion.prepareStatement(sql,new String[] { "ID" });
                        
                        System.out.println(ps+ "dentro de try");
                       
                        ps.setString(3,nombre);
                        ps.setString(4,apellido);
                        ps.setString(2,direccion);
                        ps.setString(7,distrito );
                        ps.setString(6,telefono );
                        ps.setString(5,correo );
                        ps.setFloat(8,cuenta );
                        ps.setString(1,estado );                       
                        
                        ps.executeUpdate();
                        ResultSet rs = ps.getGeneratedKeys();
                        rs.next();
                        int id = rs.getInt(1);
                        cli.setId_cliente(id_cliente);
              
		  } catch (Exception e) {
                  } finally{
                        try {
                            conexion.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                  }               
                
	return cli;
	}       
	
	public Cliente getCliente(int id_cliente){
		
        Cliente c4 = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Connection con = null;
        String query = "SELECT idCliente,nombre,apellido,telefono,direccion,distrito,estado,cuenta FROM vidrieria.tb_cliente WHERE idCliente = ?";

        try{
                con = getConnection();
                pstm = con.prepareStatement(query);
                pstm.setInt(1, id_cliente);
                rs = pstm.executeQuery();
                if(rs.next()){
                    c4 = new Cliente();
                    c4.setId_cliente(rs.getInt("idCliente"));
                    c4.setNombre(rs.getString("nombre"));
                    c4.setApellido(rs.getString("apellido"));
                    c4.setTelefono(rs.getString("telefono"));
                    c4.setDireccion(rs.getString("direccion"));
                    c4.setDistrito(rs.getString("distrito"));
                    c4.setEstado(rs.getString("estado"));
                    c4.setCuenta(rs.getFloat("cuenta"));
                }               
                con.close();

        }catch(Exception e){
                e.printStackTrace();

        }

        return c4;
	
	}
        
    public boolean remove (Cliente cliente ){
    Connection conexion = null ;
    String sql =  "delete from `vidrieria`.`tb_cliente` where idCliente=? ";
    try {
        conexion = getConnection();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, cliente.getId_cliente());
        int count  = ps.executeUpdate();
        return count == 1;        
    } catch (Exception e) {
        e.printStackTrace();
        throw  new RuntimeException(e);
    } finally {
        try {
            conexion.close();
        } catch ( Exception e) {
            e.printStackTrace();
        }
    
    }

} 	
    public List<Cliente> getAllCliente(){

    List<Cliente> listaClientes = new ArrayList<>();				 

    String sql = "SELECT idCliente,nombre,apellido,direccion,distrito,telefono,correo,cuenta,estado FROM vidrieria.tb_cliente";
    try{
            Connection con = getConnection();			
            Statement s =  con.createStatement();
            ResultSet rs =  s.executeQuery(sql); 
            while(rs.next()){
                    Cliente cliente = new Cliente();
                    cliente.setId_cliente(rs.getInt("idCliente"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setDireccion(rs.getString("direccion"));
                    cliente.setDistrito(rs.getString("distrito"));
                    cliente.setTelefono(rs.getString("telefono"));
                    cliente.setCorreo(rs.getString("correo"));
                    cliente.setCuenta(rs.getFloat("cuenta"));
                    cliente.setEstado(rs.getString("estado"));
                    listaClientes.add(cliente);
            }


    }catch (Exception e) {
        e.printStackTrace();
    }finally {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    return listaClientes;
	}
	
      
        
	public boolean cambiarEstadoCliente(Cliente cli){	
		PreparedStatement pstm = null;
		String estado = cli.getEstado();
		String nuevo_estado = "";
		
		if (estado.equals("ACTIVO")){
			nuevo_estado="INACTIVO";
		}else{
			nuevo_estado="ACTIVO";
		}
		
		String query = "UPDATE tb_cliente SET estado = ? WHERE id_cliente = ?";
		
		try{
			Connection con = getConnection();			
			pstm = con.prepareStatement(query);
			pstm.setString(1, nuevo_estado);
		//	pstm.setString(2, cli.getId_cliente());
			
			pstm.executeUpdate();
			
			con.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}
	
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
	
	
	
	
    
    
}