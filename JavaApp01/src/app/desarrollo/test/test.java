
package app.desarrollo.test;

import app.desarrollo.Venta;


public class test {

   
    public static void main(String[] args) {
        
        Venta  refVenta = null;
        refVenta = new Venta();
        refVenta.ingresarVenta();
        
        System.out.println(refVenta);
        
        
    }
    
}
