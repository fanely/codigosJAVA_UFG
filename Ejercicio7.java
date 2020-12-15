package probstringmath;
import java.util.Scanner;
/**
 *
 * @author fanny.humpiri
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        long num1 = sc.nextLong();
        System.out.println("Ingrese outro numero: ");
        long num2 = sc.nextLong();
        
        System.out.println("Soma: "+Math.addExact(num1,num2));
        System.out.println("Substrção: "+Math.subtractExact(num1,num2));
        System.out.println("Multiplicação: "+Math.multiplyExact(num1,num2));
        System.out.println("Divisão: "+Math.min(num1,num2));  
    }
    
}
