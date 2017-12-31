
package desarrollo.caja.test;

import javax.swing.JOptionPane;


public class Clase06 {

    
    public static void main(String[] args) {
        

        
        boolean arroba = false;
        String email = JOptionPane.showInputDialog("ingresar tu email");
        
        for (int i = 0; i < 10; i++) {
             if(email.charAt(i)=='@' ){
                 System.out.println("longitud de tu email es :" + email.length());
                 arroba = true;
             }
        }
        
        System.out.println("longitud de tu email es :" + email.length() + " y "+ arroba);

        
        
        
    }
    
}
