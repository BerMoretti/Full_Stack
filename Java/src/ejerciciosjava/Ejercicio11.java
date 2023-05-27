
package ejerciciosjava;

import java.util.Scanner;


public class Ejercicio11 {


    public static void main(String[] args) {
        /* Escribir un programa que procese una secuencia de caracteres 
        ingresada por teclado y terminada en punto, y luego codifique la palabra
        o frase ingresada de la siguiente manera: cada vocal se reemplaza por el
        carácter que se indica en la tabla y el resto de los caracteres
        (incluyendo a las vocales acentuadas) se mantienen sin cambios.
        
        a e i o u
        @ # $ % *
        
        */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe una frase");
        String frase = leer.nextLine();
        String nuevaFrase = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            if ("a".equalsIgnoreCase(frase.substring(i,i+1))) {
                nuevaFrase = nuevaFrase.concat("@");
                continue;
            }
            if ("e".equalsIgnoreCase(frase.substring(i,i+1))) {
                nuevaFrase = nuevaFrase.concat("#");
                continue;
            }
            if ("i".equalsIgnoreCase(frase.substring(i,i+1))) {
                nuevaFrase = nuevaFrase.concat("$");
                continue;
            }
            if ("o".equalsIgnoreCase(frase.substring(i,i+1))) {
                nuevaFrase = nuevaFrase.concat("%");
                continue;
            }
            if ("u".equalsIgnoreCase(frase.substring(i,i+1))) {
                nuevaFrase = nuevaFrase.concat("*");

            } else {
                nuevaFrase = nuevaFrase.concat(frase.substring(i,i+1));
            }
        
        }
        
        System.out.println(nuevaFrase);
        
    }
    
}