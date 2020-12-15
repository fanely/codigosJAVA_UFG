package caelum414;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class Porta {
    boolean aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;
    
    public void abre(){
        System.out.println("A porta está aberta ");
        aberta=true;
    }
    
    public  void fecha(){
        System.out.println("A porta está fechada ");
        aberta=false;
    }
    public  void pinta(String cor){
        System.out.println("A porta está pintada de cor "+cor);

    }
    public  boolean estaAberta(){
        if(aberta==true)           
            return true;
        else       
            return false;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    public void alteradimensiones(int x,int y, int z){
        this.dimensaoX=x;
        this.dimensaoY=y;
        this.dimensaoZ=z;
    }
    public void mostra(){
        System.out.println("Ancho: "+this.dimensaoX);
        System.out.println("Altura: "+this.dimensaoY);
        System.out.println("Profundidad: "+this.dimensaoZ);
    }
}
