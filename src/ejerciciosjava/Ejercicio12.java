/*
 Ejercicio 12
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author Agu PC
 */
public class Ejercicio12 {

    /*
     Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int largo;
        String prin;
        String fin;
        int suma;
        int contador;
        contador = 0;
        suma = 0;
        System.out.println("Dispositivo RS232");
        do {
            System.out.println("Ingrese una cadena para continuar.");
            cadena = leer.next();
            largo = cadena.length();
            if (largo == 5) {
                prin = cadena.toUpperCase().substring(0, 1);
                fin = cadena.toUpperCase().substring(4, 5);
                if (cadena.equals("&&&&&")) {
                    contador = 1;
                } else if (prin.equals("X") && (fin.equals("O"))) {
                    suma = (suma + 1);
                    System.out.println(suma);
                } else {
                    System.out.println("La cadena ingresada no comienza con x o termina con o./n+"
                            + "Ingrese una cadena nuevamente");
                }
            } else if (largo != 5) {
                System.out.println("La cadena ingresada supera la cantidad de caracteres permitidor (5) o./n+"
                        + "Ingrese una cadena nuevamente");
            }
        } while (contador == 0);
        System.out.println("La cantidad de cadenas ingresadas de manera correcta en el programa es de: " + suma);
        System.out.println("El programa a finalizado.");

    }
}
