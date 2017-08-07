package edu.ulima.jdbc;

import edu.ulima.bean.cliente;
import edu.ulima.bean.encuesta;
import edu.ulima.bean.encuesta_realizada;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VeterinariaDAO implements VeterinariaIF {

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ep?user=root&password=root";

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
/*****************CLIENTE**************/
    public List<cliente> listarClientes() {
        List<cliente> l = new ArrayList<cliente>();
        Connection c = null;
        String sql = "SELECT * FROM tb_cliente";

        try {
            c = getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                cliente emp = new cliente();
                emp.setId( rs.getInt("id") );
                emp.setNombres(rs.getString("nombres") );
                emp.setPaterno(rs.getString("paterno") );
                emp.setMaterno(rs.getString("materno") );
                emp.setFecha_nacimiento(rs.getString("fecha_nacimiento") );
                emp.setCorreo(rs.getString("correo") );
                emp.setHabilitado(rs.getBoolean("habilitado") );
                emp.setId_usuario(rs.getInt("id_usuario") );
                l.add( emp ) ;
            } // del While
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return l;
    }
    
    public cliente create(cliente Cliente) {
        Connection c = null;
        PreparedStatement ps = null;
        
        /*System.out.println( Cliente );
        System.out.println( Cliente.getFirstName() );
        System.out.println( Cliente.getLastName() );
        System.out.println( Cliente.getTitle() );*/
        try {
            c = getConnection();
            ps = c.prepareStatement("INSERT INTO tb_cliente (nombres, paterno, materno, "
                    + "fecha_nacimiento, correo, habilitado, id_usuario) "
                    + "VALUES (?, ?, ?, ?, ?, false,1)",
                new String[] { "ID" });
            
            ps.setString(1, Cliente.getNombres());
            ps.setString(2, Cliente.getPaterno());
            ps.setString(3, Cliente.getMaterno());
            ps.setString(4, Cliente.getFecha_nacimiento());
            ps.setString(5, Cliente.getCorreo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();

            /*// Actualizar el ID en el objeto retornado al cliente
            int id = rs.getInt(1);
            employee.setId(id);*/
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
        return Cliente;
    }
    
    public cliente update(cliente Cliente) {
        Connection c = null;
        String sql = "UPDATE tb_cliente SET nombres = ?, paterno = ?, materno = ? " +
                    //"fecha_nacimiento = ?,correo = ?,habilitado = ?, id_usuario = ?"+
                    "WHERE id = ?;";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, Cliente.getNombres());
            ps.setString(2, Cliente.getPaterno());
            ps.setString(3, Cliente.getMaterno());
            ps.setInt(4, Cliente.getId());
            //ps.setDate(4, Cliente.getFecha_nacimiento());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return Cliente;
    }

     public boolean remove(cliente Cliente) {
        Connection c = null;
        String sql = "DELETE FROM tb_cliente WHERE id=?";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, Cliente.getId());
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

     public cliente habilitarEncuestaCliente(cliente Cliente) {
        Connection c = null;
        String sql = "UPDATE tb_cliente SET habilitado = true " +
                    "WHERE id = ?;";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, Cliente.getId());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return Cliente;
    }
     
     public cliente findById(int id) {
        String sql = "SELECT id,nombres,paterno,materno,correo,fecha_nacimiento "
                + " FROM tb_cliente "
                + "WHERE id = ? ";
        cliente emp = null;
        Connection c = null;
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                emp = new cliente();
                emp.setId(rs.getInt("id"));
                emp.setNombres(rs.getString("nombres"));
                emp.setPaterno(rs.getString("paterno"));
                emp.setMaterno(rs.getString("materno"));
                emp.setCorreo(rs.getString("correo"));
                emp.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
            }
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
        return emp;
    }
/*****************CLIENTE**************/
     
     
/*****************ENCUESTA**************/
      public encuesta finddById(int id) {
        String sql = "SELECT id,nombre,descripcion,fecha_inicio,fecha_fin "
                + " FROM tb_encuesta "
                + "WHERE id = ? ";
        encuesta enc = null;
        Connection c = null;
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                enc = new encuesta();
                enc.setId(rs.getInt("id"));
                enc.setNombre(rs.getString("nombre"));
                enc.setFecha_inicio(rs.getString("fecha_inicio"));
                enc.setFecha_fin(rs.getString("fecha_fin"));
                enc.setDescripcion(rs.getString("descripcion"));
                           }
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
        return enc;
    }
     
      public List<encuesta> listarEncuesta() {
        List<encuesta> l = new ArrayList<encuesta>();
        Connection c = null;
        String sql = "SELECT * FROM tb_encuesta";

        try {
            c = getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                encuesta emp = new encuesta();
                emp.setId( rs.getInt("id") );
                emp.setNombre(rs.getString("nombre") );
                emp.setDescripcion(rs.getString("descripcion") );
                emp.setFecha_inicio(rs.getString("fecha_inicio") );
                emp.setFecha_fin(rs.getString("fecha_fin") );
                l.add( emp ) ;
                
               

            } // del While
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return l;
    }
    
    public encuesta create(encuesta Encuesta) {
        Connection c = null;
        PreparedStatement ps = null;
        
        /*System.out.println( Cliente );
        System.out.println( Cliente.getFirstName() );
        System.out.println( Cliente.getLastName() );
        System.out.println( Cliente.getTitle() );*/
        try {
            c = getConnection();
            ps = c.prepareStatement("INSERT INTO tb_encuesta (nombre, descripcion, fecha_inicio, "
                    + "fecha_fin) "
                    + "VALUES (?, ?, ?, ?)",
                new String[] { "ID" });
            
            ps.setString(1, Encuesta.getNombre());
            ps.setString(2, Encuesta.getDescripcion());
            ps.setString(3, Encuesta.getFecha_inicio());
            ps.setString(4, Encuesta.getFecha_fin());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();

            /*// Actualizar el ID en el objeto retornado al cliente
            int id = rs.getInt(1);
            employee.setId(id);*/
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
        return Encuesta;
    }
    
    public encuesta update(encuesta Encuesta) {
        Connection c = null;
        String sql = "UPDATE tb_encuesta SET nombre = ?, descripcion = ? " +
                    //", fecha_inicio = ?, fecha_fin = ? "+
                    "WHERE id = ?;";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, Encuesta.getNombre());
            ps.setString(2, Encuesta.getDescripcion());
            ps.setInt(3, Encuesta.getId());
            ps.setString(4, Encuesta.getFecha_inicio());
            ps.setString(5, Encuesta.getFecha_fin());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return Encuesta;
    }

     public boolean remove(encuesta Encuesta) {
        Connection c = null;
        String sql = "DELETE FROM tb_encuesta WHERE id=?";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, Encuesta.getId());
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
     
             
     public encuesta_realizada RegistrarEncuestaRealizada(encuesta_realizada Encuesta_realizada) {
        Connection c = null;
        PreparedStatement ps = null;
        
        try {
            c = getConnection();
            ps = c.prepareStatement("INSERT INTO tb_encuesta_realizada (fecha, valor,"
                    + "id_cliente, id_encuesta) "
                    + "VALUES (?, ?, ?, ?)",
                new String[] { "ID" });
            
            ps.setDate(1, Encuesta_realizada.getFecha());
            ps.setInt(2, Encuesta_realizada.getValor());
            ps.setInt(3, Encuesta_realizada.getId_cliente());
            ps.setInt(4, Encuesta_realizada.getId_encuesta());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();

            /*// Actualizar el ID en el objeto retornado al cliente
            int id = rs.getInt(1);
            employee.setId(id);*/
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
        return Encuesta_realizada;
    }

    

}
/*****************ENCUESTA**************/