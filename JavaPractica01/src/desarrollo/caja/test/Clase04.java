
package desarrollo.caja.test;

import javax.swing.JOptionPane;


public class Clase04 {

    
    public static void main(String[] args) {
        String genero = "";
        do {
             genero = JOptionPane.showInputDialog("Ingresar genero");
        }while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false  ) ;
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresar altura"));
        
        int pesoIdeal = 0;
        if (genero.equalsIgnoreCase("H")){
            pesoIdeal = altura -110 ;
        }else if (genero.equalsIgnoreCase("M")){
            pesoIdeal = altura -120 ;        
        }
        
        System.out.println("tu peso ideal es : " + pesoIdeal);
        
        
    }
    
}
