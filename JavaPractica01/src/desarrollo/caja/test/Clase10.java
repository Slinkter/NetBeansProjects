
package desarrollo.caja.test;

import java.util.Random;


public class Clase10 {

    
    public static void main(String[] args) {
        int [][] mi_matriz = new int[4][5];
        Random x =  new Random();
        for (int i = 0; i < 4; i++) {            
            for (int j = 0; j < 5; j++) {                
                mi_matriz[i][j] = x.nextInt(100) ;                        
            }            
        }
//        
//        for (int i = 0; i < 4; i++) {              
//            for (int j = 0; j < 5; j++) {
//                System.out.print(mi_matriz[i][j]+ " ");                        
//            }
//            System.out.println();           
//        }     
        
        
        for(int[]fila:mi_matriz){
            for(int columna:fila){
                System.out.print(columna + " ");
            }
            System.out.println();
        }
  
        
    }
    
}
