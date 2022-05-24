/*
Ejercicio 11
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Agu PC
 */
public class Ejercicio11 {

    /*
    Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
    
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int val = 0;
        int suma;
        int restar;
        int multiplicar;
        int dividir;
        do {            
            System.out.println("MENU:\n" +
            "1. Sumar\n" +
            "2. Restar\n" +
            "3. Multiplicar\n" +
            "4. Dividir\n" +
            "5. Salir\n" +
            "Elija opción:");
           int opcion = leer.nextInt();
            switch (opcion) {
            case 1:
                suma = (num1 + num2);
                System.out.println("La suma de los numeros es: " + suma);       
                break;
            case 2:
                restar = (num1 - num2);
                System.out.println("La resta de los numeros es: " + restar);
                break;
            case 3:
                multiplicar = (num1 * num2);
                System.out.println("La multiplicación de los numeros es: " + multiplicar);
                break;
            case 4:
                dividir = (num1 % num2);
                System.out.println("La divición de los numeros es: " + dividir);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String sino = leer.next();
                if (sino.toUpperCase().equals("S")) {
                    System.out.println("El programa a finalizado.");
                    val = 1;
                } else {
                    System.out.println("");
                    System.out.println("El programa continua.");
                    System.out.println("");
                }
                break;
        }
            
            
        } while (val == 0);
        
    }
    
}
