/*
Ejercicio 6
*/
package ejerciciosjava;

import java.util.Scanner;

/*
Agustin
*/
public class Ejercicio6 {

    /*
    Crear un programa que dado un numero determine si es par o impar.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Escrbir un numero entero: ");
        double num;
        num = leer.nextDouble();
        if (num % 2 == 0 ){
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
    
}
