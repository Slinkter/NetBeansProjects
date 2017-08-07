/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import bean.Employee;
import bean.EmployeeGrabar;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface EmployeeIF {
    
    public List<Employee> findAll() ;
    public List<Employee> findByManager(int managerId) ;
    public Employee findById(int id) ;
    
    /* Operaciones de Escritura */
    public EmployeeGrabar create(EmployeeGrabar employeeGrabar);
    public Employee update(Employee employee);
    public boolean remove(Employee employee);
    
    
    
}
