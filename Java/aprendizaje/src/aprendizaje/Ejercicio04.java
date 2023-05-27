
package aprendizaje;

import java.util.Scanner;

public class Ejercicio04 {


    public static void main(String[] args) {
        /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
        
Scanner leer = new Scanner(System.in);

        System.out.println("Introduce la cantidad de grados CENTIGRADOS");
        double centigrados = leer.nextDouble();
        
        double fahrenheit = 32 + (9 * centigrados / 5);
                
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println(centigrados + " grados CENTIGRADOS son " + fahrenheit + " grados FAHRENHEIT");
        System.out.println("");

    }

}
