/*
Ejercicio 8
*/
package ejerciciosjava;

import java.util.Scanner;

/*
Afustin Frankenberger
*/
public class Ejercicio8 {

    /*
    Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
    */

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una palabra o frase de 8 de largo: ");
        String pal;
        pal = leer.nextLine();
        int cant;
        cant = pal.length();
        if (cant == 8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
            
            
        }
        
        
    }
    
}
