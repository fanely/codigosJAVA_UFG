
package classes;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class Prob1 {
   
    public static void main(String[] args) {
        Complexo c1 = new Complexo(5,2);
        Complexo c2 = new Complexo(3,3);
        Operaciones op = new Operaciones();
        op.suma(c1,c2);
        op.resta(c1,c2);
        
        c1.mostrar(7, 8);
        c2.mostrar(9, 2);
        
       
    }
    
}
