
package probstringmath;

import java.util.Scanner;

/**
 *
 * @author fanny.humpiri
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese outro numero: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Maior: "+Math.max(num1,num2));
        System.out.println("Menor: "+Math.min(num1,num2));
    }
    
}
