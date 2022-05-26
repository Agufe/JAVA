/*
 Ejercicio 13
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Agu PC
 */
public class Ejercicio14 {

    /*
     Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros que desea convertir a pesos: ");
        int euro =leer.nextInt();
       double resultado1 = cambio1(euro);
        System.out.println("La cantidad de Euros corresponde a "+ resultado1 +" pesos");
       
    }
    
    public static double cambio1(int a){
        double cambio = a * (1.28611);
                return cambio;
    }
}
