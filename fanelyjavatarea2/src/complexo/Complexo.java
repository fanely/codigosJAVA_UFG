package classes;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class Complexo {
    int real;
    int img;

     public Complexo() {
        this.real = 0;
        this.img = 0;
    }
    
    public Complexo(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
    public void mostrar(int real, int img) {
        this.real = real;
        this.img = img;
        System.out.print(real+" + "+img+"i");
        System.out.println("  ");
    }
    
           
}
