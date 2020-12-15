package probstringmath;
import java.util.Scanner;
/**
 *
 * @author fanny.humpiri
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double num = sc.nextDouble();
        
        System.out.println("Valor arredondado: "+Math.round(num));
    }
    
}
