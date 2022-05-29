/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 * @author Agu PC
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int longitud = leer.nextInt();
        int vector [];
        vector = rellenovector(longitud);
        lecturavector(vector);
        busqueda(vector);
       
        
                
    }
    public static int [] rellenovector (int a){
        int relle [] = new int [a];
        for (int i = 0; i < relle.length; i++) {
            relle[i] = (int) (Math.random() * 100); 
        }
        return relle;
    }
    public static void lecturavector (int [] lista){
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            
        }
    }
    public static void busqueda (int b []){
        Scanner leer2 = new Scanner(System.in);
        int cont = 0 ;
        do {            
            System.out.println("Ingrese un numero para ser buscado o presione 000 para finalizar: ");
            int num = leer2.nextInt();
            int contador = 0;
            int contador2 = 0;
            for (int i = 0; i < b.length; i++) {
                if (num == b [i]){ 
                System.out.println("El numero "+num+" se encuentra en la posision  " + i );
                contador = contador + 1;
                System.out.println("El numero se repite " + contador); 
            }else if (num != b [i]){
                    contador2 = contador2 +1;     
            }
            if (contador2 >= b.length ){
                System.out.println("El numero Ingresado no se encuentra digite otro.");
                    System.out.println("  ");
            }
            if (num == (123)){
                    System.out.println("El programa a finalizado.");
                    cont=1;
                }
            }
        } while (cont==0);
            
            }
        }
                
        
    
    

