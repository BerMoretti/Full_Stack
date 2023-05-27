
package ejerciciosjava;

import java.util.Scanner;


public class Ejercicio10 {


    public static void main(String[] args) {
        
        /* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        e imprima el número ingresado seguido de tantos asteriscos como indique su valor.*/
        
        Scanner leer = new Scanner(System.in);
        
                    
        System.out.println("Ingresa el numero 1 (TIENE QUE SER ENTRE 1 Y 20)");
        int numero1 = leer.nextInt();
        
            while (numero1 < 0 || numero1 > 20) {
            System.out.println("ERROR!!! Intentalo de nuevo!");
            numero1 = leer.nextInt();
            }
            
        System.out.println("Ingresa el numero 2 (TIENE QUE SER ENTRE 1 Y 20)");
        int numero2 = leer.nextInt();
        
            while (numero2 < 0 || numero2 > 20) {
            System.out.println("ERROR!!! Intentalo de nuevo!");
            numero2 = leer.nextInt();
            }
            
        System.out.println("Ingresa el numero 3 (TIENE QUE SER ENTRE 1 Y 20)");
        int numero3 = leer.nextInt();
        
            while (numero3 < 0 || numero3 > 20) {
            System.out.println("ERROR!!! Intentalo de nuevo!");
            numero3 = leer.nextInt();
            }

        System.out.println("Ingresa el numero 4 (TIENE QUE SER ENTRE 1 Y 20)");
        int numero4 = leer.nextInt();
        
            while (numero4 < 0 || numero4 > 20) {
            System.out.println("ERROR!!! Intentalo de nuevo!");
            numero4 = leer.nextInt();
            }            
        
        System.out.println("--------------------------------------");
                System.out.println("");
        
        System.out.print(numero1 + " ");
        for (int i = 0; i < numero1; i++) {
            System.out.print("*");
        }
                System.out.println("");
        
        System.out.print(numero2 + " ");
        for (int i = 0; i < numero2; i++) {
            System.out.print("*");
        }
                System.out.println("");
        
        System.out.print(numero3 + " ");
        for (int i = 0; i < numero3; i++) {
            System.out.print("*");
        }
                System.out.println("");
        
        System.out.print(numero4 + " ");
        for (int i = 0; i < numero4; i++) {
            System.out.print("*");
        }
                System.out.println("");
        
    }
    
}
