
package repaso.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import repaso.bean.empleado;


public class EmpleadoDAO implements EmpleadoIF{
    
    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/1542-2015-I?user=root&password=root";

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    @Override
    public List<empleado> listaAll() {
       List<empleado>  listado = new ArrayList<empleado>();
       Connection conexion = null;
       String sql =  "select id,firstName,lastName,department from employee";
        try {
            conexion = getConnection();
            Statement s =  conexion.createStatement();
            ResultSet rs =  s.executeQuery(sql);            
            while(rs.next()){
                empleado e1 = new empleado();
                e1.setId(rs.getInt("id"));
                e1.setNombre(rs.getString("firstName"));
                e1.setApellido(rs.getString("lastName"));
                e1.setDepartamento("department");
                System.out.println(e1.getId()+e1.getNombre()+e1.getApellido()+e1.getDepartamento());
                listado.add(e1);   
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }            
        }    
    return listado;
    }

    @Override
    public empleado findByID(int id) {
        empleado emp = null;
        String sql = "select id,firstName,lastName,department,picture from employee where  id = ?";
        Connection conexion =  null;        
        try{
            conexion = getConnection();
            PreparedStatement  ps =  conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                emp = new empleado();
                emp.setId(rs.getInt("id"));
                emp.setNombre(rs.getString("firstName"));
                emp.setApellido(rs.getString("lastName"));
                emp.setDepartamento(rs.getString("department"));
                emp.setFoto(rs.getString("picture"));               
            }        
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                conexion.close();
            }catch(SQLException e){
                e.printStackTrace();
            }                    
        }               
        return emp;
    }

    @Override
    public empleado create(empleado emp) {
        System.out.println("1");
        Connection conexion = null;
        PreparedStatement ps = null ;
        String sql = "INSERT INTO employee (firstName, lastName, department ,picture ) VALUES ( ?, ?, ?, ?)";
        try {
            System.out.println("2");
            conexion = getConnection();
            ps = conexion.prepareStatement(sql,new String[] { "ID" });
            ps.setString(1,emp.getNombre());
            ps.setString(2, emp.getApellido());
            ps.setString(3,emp.getDepartamento());
            ps.setString(4, emp.getFoto());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            emp.setId(id);           
        } catch (Exception e) {
        } finally{
            try {
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }      
       
        return emp ;        
    }

    @Override
    public empleado update(empleado emp) {
        Connection c = null;
        String sql = "update employee set firstName = ?, lastName = ?,department=?,picture=? where id= ?";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApellido());
            ps.setString(3, emp.getDepartamento());
            ps.setString(4, emp.getFoto());
            ps.setInt(5, emp.getId());
            ps.executeUpdate();            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
        
         return emp ;         
    }

    @Override
     public boolean remove(empleado emp) {
        Connection c = null;
        String sql = "DELETE FROM employee WHERE id=?";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, emp.getId());
            int count = ps.executeUpdate();
            return count == 1;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
    
    
}
