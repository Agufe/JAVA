/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejerciciosjava;

/*
 * @author Agu PC
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int vector [];
       vector = rellenovector(100);
       lecturavector(vector);
        
        
                
                
    }
    public static int [] rellenovector (int a){
        int vuelta [] = new int [100];
        for (int i = 0; i < vuelta.length ; i++) {
            vuelta[i] = i +1;
        }
        return vuelta;
    }
    
    
public static void lecturavector (int [] lista){
        for (int i = 99; i >= 0 ; i--) {
            System.out.println(lista[i]);
            
        }
    }    
   
}
