
package aprendizaje;

import java.util.Scanner;

public class Ejercicio05 {


    public static void main(String[] args) {
        /* Escribir un programa que lea un número entero por teclado y muestre 
        por pantalla el doble, el triple y la raíz cuadrada de ese número. */
        
Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero entero");
        int numero = leer.nextInt();
        double raiz = Math.sqrt(numero);
        
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("El doble es: " + numero * 2);
        System.out.println("El triple es: " + numero * 3);
        System.out.println("La raiz cuadrada es: " + raiz);
        System.out.println("");        

    }

}
