package classes;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */

public class Operaciones {

    public Operaciones() {
    }
    
        public void suma(Complexo c1,Complexo c2){
        int sreal = c1.getReal()+c2.getReal();
        int simg = c1.getImg()+c2.getImg();
        Complexo suma = new Complexo(sreal,simg);
        suma.mostrar(sreal, simg);
        System.out.print("Suma: ");
    } 
        public void resta(Complexo c1,Complexo c2){
        int sreal = c1.getReal()-c2.getReal();
        int simg = c1.getImg()-c2.getImg();
        Complexo resta = new Complexo(sreal,simg);
        resta.mostrar(sreal, simg);
        System.out.print("Resta: ");
    } 
}
