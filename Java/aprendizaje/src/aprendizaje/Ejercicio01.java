
package aprendizaje;

import java.util.Scanner;

public class Ejercicio01 {


    public static void main(String[] args) {
        /* Escribir un programa que pida dos números enteros por teclado y 
        calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma */
        
Scanner leer = new Scanner(System.in);

        System.out.println("Escriba el primer numero");
        int primerNumero = leer.nextInt();
        
        System.out.println("Escriba el segundo numero");
        int segundoNumero = leer.nextInt();
        
        int suma = primerNumero + segundoNumero;
        
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("La suma de los dos numeros es " + suma);
        System.out.println("");

    }

}
