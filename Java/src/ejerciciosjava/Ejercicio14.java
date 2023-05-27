
package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio14 {


    public static void main(String[] args) {
        /* Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo */
        
Scanner leer = new Scanner(System.in);
    
        System.out.println("Cuantos companieros de equipo tienes?");
        int numCompanieros = leer.nextInt();
        
        String[] equipo = new String[numCompanieros];
        
        for (int i = 0; i < numCompanieros; i++) {
            
            System.out.println("Nombre companiero:");
            equipo[i] = leer.next();
            
        }
        
        System.out.println("");
        System.out.println("**************");
        System.out.println("");
        System.out.println("Los nombres que ingresaste son:");

        
        for (int i = 0; i < numCompanieros; i++) {
            
            System.out.println(equipo[i]);
            
        }

    }

}
