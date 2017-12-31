/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo.caja.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Tukamon
 */
public class uso_coche {

    
    public static void main(String[] args) {
        // Objeto 1 : Renault 
        Coche renault = new Coche();
        System.out.print( "el coche tiene "+  renault.getRuedas() + "coche \n" );
        System.out.print( renault.imprimir());
  
    }
    
}
