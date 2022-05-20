/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Agu PC
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número:");
       double numero;
       double  doble;
       double triple;
       double raiz;
        numero = leer.nextDouble();
        doble =(numero * 2);
        triple = (numero * 3);
        raiz= Math.sqrt(numero);
        System.out.println(doble);
        System.out.println(triple);
        System.out.println(raiz);
        
        
                
    }
    
}
