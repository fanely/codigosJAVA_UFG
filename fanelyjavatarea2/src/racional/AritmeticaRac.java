package racional;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class AritmeticaRac {

   public void suma(Racional r1,Racional r2){
           int pden = r1.getNum()*r2.getDen();
           int snum = (pden/r1.getDen())*r1.getNum()+(pden/r2.getDen())*r2.getNum();
           Racional suma = new Racional(snum,pden);
           
           System.out.print("Suma: ");
           suma.mostrar(snum, pden);     
   } 
   
    public void resta(Racional r1,Racional r2){
           int pden = r1.getNum()-r2.getDen();
           int snum = (pden/r1.getDen())*r1.getNum()-(pden/r2.getDen())*r2.getNum();
           Racional resta = new Racional(snum,pden);
           
           System.out.print("Resta: ");
           resta.mostrar(snum, pden);
    }
    
}
