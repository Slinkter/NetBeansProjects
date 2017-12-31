//
//       Clase 12
//
package desarrollo.caja.prueba;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    
    String color;

    public Coche() {
        ruedas= 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        
    }
    
    public String imprimir(){
    
    String texto = "el largo del coche es " + largo;
    
    return texto ;
    }
    
    public void establece_color(){
        color = "azul";    
    }
    
    public String establece_color1(){
       
    return "el color de tu coche es " + color;
       
    }
    
    

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
    
}
