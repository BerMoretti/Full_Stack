
package ejerciciosjava;

import java.util.Scanner;


public class Ejercicio05 {


    public static void main(String[] args) {
        /* Define una variable de tipo string, int y double. 
        Guarda información en ellas a través del Scanner. */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cual es tu nombre?");
        String nombreUsuario = leer.nextLine();
        
        System.out.println("Cuantos anios tienes?");
        int edad = leer.nextInt();

        System.out.println("Cuantos metros mides de alto?");
        double metrosAlto = leer.nextDouble();
        
        System.out.print("Tu nombre es " + nombreUsuario + " tienes " + edad + " anios y mides " + metrosAlto + " mts.");
        
    }
    
}
