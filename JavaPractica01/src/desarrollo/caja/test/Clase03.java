
package desarrollo.caja.test;

import javax.swing.JOptionPane;


public class Clase03 {

 
    public static void main(String[] args) {
        String clave = "luis";
        String contraseña = "";
        
        while(clave.equals(contraseña)== false){
            contraseña = JOptionPane.showInputDialog("Ingresa contraseña, por favor");
            if (clave.equals(contraseña) == false) {
                System.out.println("contraseña incorrecta");
            }           
        
        }
        System.out.println("contraseña correcta, continuar");
        
        
        
    }
    
}
