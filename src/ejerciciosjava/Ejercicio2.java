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
public class Ejercicio2 {
      public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingrese su nombre");
       String nombre;
       nombre= leer.nextLine();
       System.out.println("El nombre que introdujiste es: " + nombre);
    }
    
}
