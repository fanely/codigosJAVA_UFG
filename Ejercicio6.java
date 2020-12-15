package probstringmath;
import java.util.Scanner;
/**
 *
 * @author fanny.humpiri
 */
public class Ejercicio6 {

        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double num = sc.nextDouble();

        
        System.out.println("Cuadrado: "+Math.pow(num,2));
        System.out.println("Raiz: "+Math.sqrt(num));
    }
    
}
