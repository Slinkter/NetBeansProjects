
package desarrollo.caja.test;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Clase02 {
//Area
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion : \n1 : Cudrado  \n2 : Rectángulo \n3 : Triángulo \n4 : Circulo ");
        int figura = entrada.nextInt();
        switch(figura){
            case 1 :
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el lado del cuadrado"));
                System.out.println("El área del cuadrado es : " + Math.pow(lado, 2));
                break;
            case 2 :
                int base = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la base del  rectángulo"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la altura del  rectángulo"));
                System.out.println("El área del rectángulo es : " + (base*altura));
                break;
            case 3 : 
                int base1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la base del  Triángulo"));
                int altura1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la altura del  Triángulo"));
                System.out.println("El área del rectángulo es : " + (base1*altura1)/2);
                break;
            case 4 :
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el radio  del  Circulo"));
                System.out.print("El área del circulo es :"  );
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
                break;
                        
        }
        
        
    }
    
}
