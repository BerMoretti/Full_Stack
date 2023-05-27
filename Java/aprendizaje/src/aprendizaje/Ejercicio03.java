
package aprendizaje;

import java.util.Scanner;

public class Ejercicio03 {


    public static void main(String[] args) {
        /* Escribir un programa que pida una frase y la muestre toda en 
        mayúsculas y después toda en minúsculas. */
        
Scanner leer = new Scanner(System.in);

        System.out.println("Escribe una frase:");
        String frase = leer.nextLine();
        String fraseEnMayusculas = frase.toUpperCase();
        String fraseEnMinusculas = frase.toLowerCase();
        
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println(fraseEnMayusculas);
        System.out.println("");
        
        System.out.println("Oprime el numero '0' para escribir la frase en minusculas");
        int minusculas = leer.nextInt();
        
        if (minusculas == 0) {
            
            System.out.println("");
            System.out.println("********************");
            System.out.println("");
            System.out.println(fraseEnMinusculas);
            System.out.println("");
            
        }
        
        System.out.println("Se termino de ejecutar el programa");

    }

}
