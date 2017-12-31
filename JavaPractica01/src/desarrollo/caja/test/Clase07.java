
package desarrollo.caja.test;

import javax.swing.JOptionPane;


public class Clase07 {

    
    public static void main(String[] args) {
        
        int resultado = 1 ;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introducte un número "));
        
        for (int i = numero; i >0 ; i--) {
            resultado = resultado*i;
        }
        
        System.out.println("el factorial del número " +numero + "es  : " + resultado);
        
    }
    
}
