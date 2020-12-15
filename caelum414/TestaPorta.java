package caelum414;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class TestaPorta {

    public static void main(String[] args) {
        Porta madera1 = new Porta();
        madera1.abre();
        madera1.fecha();
        madera1.pinta("Blanco");
        madera1.pinta("Celeste");
        madera1.pinta("Azul");
        madera1.abre();
        madera1.alteradimensiones(4, 5, 6);
        madera1.estaAberta();
        madera1.mostra();
    }
    
}
