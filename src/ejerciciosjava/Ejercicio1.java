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
public class Ejercicio1 {

    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      System.out.println("Ingrese dos números reales:");
      int numero = leer.nextInt();
      int numero2 = leer.nextInt();
      int resultado;
      resultado = numero + numero2;
      System.out.println("La suma de los numeros es : " + resultado);
    }
    
}
