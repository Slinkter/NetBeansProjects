
package app.desarrollo;

import javax.swing.JOptionPane;


public class Venta {
    
    private int []venta;
    private int menorVenta,mayorVenta;
    private float ventaProm;

    public Venta() {
        venta = new int[10];
        menorVenta = 0;
        mayorVenta = 0;
        ventaProm = 0.0f;
    }

    // Inicio de  métodos
    public void ingresarVenta(){
        for (int i = 0; i < venta.length; i++) {
            do{
                venta[i] = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos vendidos [0-20]"));
                if (venta[i]<0 || venta[i]>20){
                    JOptionPane.showMessageDialog(null, "Cantidad inválida .Ingrese nuevamnete");
                }            
            }while(venta[i] < 0 || venta[i] >20);
        }
    }
    
    // Algoritmo para hallar el mayor de Cantidad de productor
    public void hallarMayorVenta(){
        mayorVenta = venta[0];
        for (int i = 0; i < venta.length; i++) {
            if(venta[i]>mayorVenta){
                mayorVenta = venta[i];
            }
        }
    }
    
    public void hallarMenorVenta(){
        menorVenta = venta[0];
        for (int i = 0; i < venta.length; i++) {
            if(venta[i]< menorVenta ){
                menorVenta = venta[i];
            }
        }
    }
    public void hallarVentaProm(){
        
        
        
    }
    private int hallarSumaVenta(){
        int suma = 0;
        for (int i = 0; i < venta.length; i++) {
            suma = suma + venta[i];
        }
        
        return suma;
    }
    private int hallarCantMayor(){
        int can = 0;
        
        return can;
    }
    private String concatNotasSupProm(){
        String cadena = "";
        
        return cadena;
    }
    
    // Fin de métodos
 
    
    
    
    public int[] getVenta() {
        return venta;
    }

    public void setVenta(int[] venta) {
        this.venta = venta;
    }

    public int getMenorVenta() {
        return menorVenta;
    }

    public void setMenorVenta(int menorVenta) {
        this.menorVenta = menorVenta;
    }

    public int getMayorVenta() {
        return mayorVenta;
    }

    public void setMayorVenta(int mayorVenta) {
        this.mayorVenta = mayorVenta;
    }

    public float getVentaProm() {
        return ventaProm;
    }

    public void setVentaProm(float ventaProm) {
        this.ventaProm = ventaProm;
    }
    
    
    
    
    
    
    
    
}
