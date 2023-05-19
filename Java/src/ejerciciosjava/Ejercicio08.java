
package ejerciciosjava;

import java.util.Scanner;


public class Ejercicio08 {


    public static void main(String[] args) {
        /* Escriba un programa que valide si una nota está entre 0 y 10, 
        sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("La NOTA debe ser entre 0 y 10. Intentalo de nuevo!");
            nota = leer.nextInt();
    }
        System.out.println("La nota se ingreso correctamente");
        
    }
    
}
