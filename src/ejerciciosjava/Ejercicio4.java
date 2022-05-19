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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe la temperatura en celcius:");
        int tempera;
        tempera= leer.nextInt();
        int fare;
        fare = (32+(9*(tempera/5)));
        System.out.println("La temperatura en Fahrenheit es :" +fare );
                
        
    }
    
}
