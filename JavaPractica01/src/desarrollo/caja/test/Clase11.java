/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollo.caja.test;

/**
 *
 * @author Tukamon
 */
public class Clase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double interes = 0.10;
        double acumulado = 0;
        double [][] saldo = new double[6][5];
        for (int i = 0; i < 6; i++) {
            saldo[i][0] = 10000;
            acumulado = 10000;            
            for (int j = 1; j < 5; j++) {
                acumulado = acumulado + (acumulado*interes );
                saldo[i][j] = acumulado;
            }
            interes = interes + 0.01f;
            
            
        }
        
        for (int i = 0; i < 6; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.printf("%1.2f" ,saldo[i][j]);
                System.out.print("    ");
            }
            System.out.println();
        }
        
    
    }
    
}
