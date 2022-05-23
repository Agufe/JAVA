/*
 Ejercicio 10
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Agu PC
 */
public class Ejercicio10 {

    /*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el valor límite:");
        int val = leer.nextInt();
        int suma;
        suma = 0;
        while (val>suma){
            System.out.println("Ingrese un numero hasta llegar al límite: ");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("El total sumado hasta el momento es :" + suma);
            System.out.println("");
        }
        System.out.println("El programa a superado el limite .");
    }
    
}
