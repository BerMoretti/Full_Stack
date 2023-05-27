
package ejerciciosjava;

import java.util.Scanner;


public class Ejercicio12 {


    public static void main(String[] args) {
        /* Crea un procedimiento EsMultiplo que reciba los dos números pasados 
        por el usuario, validando que el primer numero es múltiplo del segundo e imprima
        si el primer numero es múltiplo del segundo, sino informe que no lo son.*/
        
    Scanner leer = new Scanner(System.in);
        
    System.out.println("Ingrese el primer numero");
    int primerNumero = leer.nextInt();
        
    System.out.println("Ingrese el segundo numero");
    int segundoNumero = leer.nextInt();
        
        esMultiplo(primerNumero , segundoNumero);
        
    }
    
    public static void esMultiplo(int primerNumero , int segundoNumero){
    
    if (primerNumero % segundoNumero == 0) {
            System.out.println("El primer numero es MULTIPLO del segundo");
    } else {
            System.out.println("El primer numero NO es MULTIPLO del segundo");
    }        
}
    
}
