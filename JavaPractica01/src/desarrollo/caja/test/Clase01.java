
package desarrollo.caja.test;

import java.util.Scanner;

public class Clase01 {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("**Introduce tu edad , por favor**");
        int edad = entrada.nextInt();
        if (edad>18){
            System.out.println("eres mayor de edad");
        }else if (edad<18){
            System.out.println("eres menor de edad");
        }else if (edad >=25){
            System.out.println("eres mayor de 25");
        }
              
    }
}