
package ejerciciosjava;

import java.util.Scanner;


public class Ejercicio09 {


    public static void main(String[] args) {
        
        /* Escriba un programa que lea 20 números. Si el número leído es igual a cero 
        se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
        El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
        pero si el número es negativo no debe sumarse.
        
        Nota: recordar el uso de la sentencia break.*/
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int contador = 0;
                
        do {
        System.out.println("Ingresa un numero!");
        numero = leer.nextInt();
        
        if (numero >= 0){
            suma += numero;
        }
        
        if (numero == 0){
            System.out.println("Se capturó el numero cero");
        }
        
        contador ++;
            
        } while (contador < 2 && numero != 0);
        
        System.out.println("El total de todos los numeros que ingresaste es " + suma);
                
        
    }
    
}
