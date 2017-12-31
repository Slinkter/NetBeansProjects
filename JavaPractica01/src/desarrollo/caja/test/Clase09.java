
package desarrollo.caja.test;

import javax.swing.JOptionPane;

public class Clase09 {


    public static void main(String[] args) {
      
//        
//        String [] paises = new String [8];
//        
//        paises[0] = "España";
//        paises[1] = "Mexico";
//        paises[2] = "Colombia";
//        paises[3] = "Perú";
//        paises[4] = "Chile";
//        paises[5] = "Argentina";
//        paises[6] = "Ecuador";
//        paises[7] = "Venezuela";
//       
//        for (String x :paises) {
//            System.out.println(x);
//        }
        
        String [] ciudades = new String[3];
        for (int i = 0; i < ciudades.length; i++) {
            ciudades[i]= JOptionPane.showInputDialog("ingresar ciudades");
        }
        
        for(String x : ciudades){
            System.out.println(x);
        }
        
        
        
    }
    
}
