package edu.ulima.jdbc;

import edu.ulima.bean.Employee;
import edu.ulima.bean.EmployeeGrabar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements EmployeeIF {

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

    public List<Employee> findAll() {
        List<Employee> l = new ArrayList<Employee>();
        Connection c = null;
        String sql = "SELECT e.id, e.firstName, e.lastName, e.title, e.picture, "
                + "count(r.id) reportCount "
                + " FROM employee as e "
                + "LEFT JOIN employee r ON e.id = r.managerId "
                + "GROUP BY e.id "
                + "ORDER BY e.id,e.firstName, e.lastName";

        try {
            c = getConnection();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId( rs.getInt("id") );
                emp.setFirstName( rs.getString("firstName") );
                emp.setLastName( rs.getString("lastName") );
                emp.setTitle( rs.getString("title") );
                emp.setPicture( rs.getString("picture") );
                emp.setReportCount( rs.getInt("reportCount") );

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

    public List<Employee> findByManager(int managerId) {
        List<Employee> l = new ArrayList<Employee>();
        Connection c = null;
        String sql = "SELECT e.id, e.firstName, e.lastName, e.title, e.picture, "
                + "count(r.id) reportCount "
                + " FROM employee as e "
                + "LEFT JOIN employee r ON e.id = r.managerId "
                + "WHERE e.managerId=? "
                + "GROUP BY e.id "
                + "ORDER BY e.firstName, e.lastName";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, managerId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId( rs.getInt("id") );
                emp.setFirstName( rs.getString("firstName") );
                emp.setLastName( rs.getString("lastName") );
                emp.setTitle( rs.getString("title") );
                emp.setPicture( rs.getString("picture") );
                emp.setReportCount( rs.getInt("reportCount") );
                l.add( emp );
            } // del while
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

    public Employee findById(int id) {
        String sql = "SELECT e.id, e.firstName, e.lastName, e.managerId, e.title, e.department, "
                + " e.city, e.officePhone, e.cellPhone, e.email, e.picture, "
                + " m.firstName managerFirstName, m.lastName managerLastName, count(r.id) reportCount "
                + " FROM employee as e "
                + "LEFT JOIN employee m ON e.managerId = m.id "
                + "LEFT JOIN employee r ON e.id = r.managerId "
                + "WHERE e.id = ? "
                + "GROUP BY e.id";
        Employee emp = null;
        Connection c = null;
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setTitle(rs.getString("title"));
                emp.setDepartment(rs.getString("department"));
                emp.setCity(rs.getString("city"));
                emp.setOfficePhone(rs.getString("officePhone"));
                emp.setCellPhone(rs.getString("cellPhone"));
                emp.setEmail(rs.getString("email"));
                emp.setPicture(rs.getString("picture"));

                int managerId = rs.getInt("managerId");
                if (managerId > 0) {
                    Employee gerente = new Employee();
                    gerente.setId(managerId);
                    gerente.setFirstName(rs.getString("managerFirstName"));
                    gerente.setLastName(rs.getString("managerLastName"));
                    emp.setManager(gerente);
                }
                emp.setReportCount(rs.getInt("reportCount"));

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

    /* OPERACIONES DE ESCRITURA */
    public EmployeeGrabar create(EmployeeGrabar employee) {
        Connection c = null;
        PreparedStatement ps = null;

        System.out.println( employee );
        System.out.println( employee.getFirstName() );
        System.out.println( employee.getLastName() );
        System.out.println( employee.getTitle() );
        try {
            c = getConnection();
            ps = c.prepareStatement("INSERT INTO employee (firstName, lastName, title, department, "
                    + "managerId, city, officePhone, cellPhone, email, picture) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new String[] { "ID" });
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getTitle());
            ps.setString(4, employee.getDepartment());
            ps.setInt(5, 0);
            ps.setString(6, employee.getCity());
            ps.setString(7, employee.getOfficePhone());
            ps.setString(8, employee.getCellPhone());
            ps.setString(9, employee.getEmail());
            ps.setString(10, employee.getPicture());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();

            // Actualizar el ID en el objeto retornado al cliente
            int id = rs.getInt(1);
            employee.setId(id);
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
        return employee;
    }

    public Employee update(Employee employee) {
        Connection c = null;
        String sql = "UPDATE employee SET firstName=?, lastName=?, title=?, department=?, " +
                "managerId=?, city=?, officePhone=?, cellPhone=?, email=?, picture=? " +
                "WHERE id=?";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getTitle());
            ps.setString(4, employee.getDepartment());
            ps.setInt(5, employee.getManager().getId());
            ps.setString(6, employee.getCity());
            ps.setString(7, employee.getOfficePhone());
            ps.setString(8, employee.getCellPhone());
            ps.setString(9, employee.getEmail());
            ps.setString(10, employee.getPicture());
            ps.setInt(11, employee.getId());
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
        return employee;
    }

    public boolean remove(Employee employee) {
        Connection c = null;
        String sql = "DELETE FROM employee WHERE id=?";
        try {
            c = getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, employee.getId());
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

}



