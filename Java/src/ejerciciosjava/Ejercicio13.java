
package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio13 {


    public static void main(String[] args) {
        /* Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de 
        compañeros de equipo y define su tipo de dato de tal manera que te permita
        alojar sus nombres más adelante.*/
        
Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantos companieros de equipo tienes?");
        int numCompanieros = leer.nextInt();
        
        String[] equipo = new String[numCompanieros];
        
        System.out.println("El vector EQUIPO tiene una dimension de " + numCompanieros + " elementos de tipo String");

    }

}
