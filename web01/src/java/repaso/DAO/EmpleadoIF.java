/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.DAO;

import java.util.List;
import repaso.bean.empleado;

/**
 *
 * @author Asus
 */
public interface EmpleadoIF {
    
        public List<empleado> listaAll();
        public empleado findByID( int id);
        public empleado create(empleado emp);
        public empleado update(empleado emp);
        public boolean remove(empleado emp);
        
    
}
