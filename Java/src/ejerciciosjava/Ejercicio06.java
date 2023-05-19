
package ejerciciosjava;

import java.util.Scanner;


public class Ejercicio06 {


    public static void main(String[] args) {
        /* Implementar un programa que le pida dos números enteros al usuario 
        y determine si ambos o alguno de ellos es mayor a 25.*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero entero");
        int numero1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo numero entero");
        int numero2 = leer.nextInt();
        
        if (numero1 > 25){
            System.out.println("El PRIMER numero es MAYOR a 25");
        } else {
            System.out.println("El PRIMER numero es MENOR a 25");
        }
        
        if (numero2 > 25){
            System.out.println("El SEGUNDO numero es MAYOR a 25");
        } else {
            System.out.println("El SEGUNDO numero es MENOR a 25");
        }
    }
    
}
