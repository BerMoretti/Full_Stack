
package aprendizaje;

import java.util.Scanner;

public class Ejercicio02 {


    public static void main(String[] args) {
        /* Escribir un programa que pida tu nombre, lo guarde en una variable
        y lo muestre por pantalla. */
        
Scanner leer = new Scanner(System.in);

        System.out.println("Escribe tu nombre completo");
        String nombre = leer.nextLine();
        
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("El nombre que ingresaste es " + nombre);
        System.out.println("");

    }

}
