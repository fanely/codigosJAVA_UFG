package labpessoas;

/**
 *
 * @author FANNY ROSANA PASTOR HUMPIRI
 */
public class TestaCadastro {
      public static void main(String[] args) {
          
          CadastroPessoas cp1 = new CadastroPessoas();
          
          Data d1 = new Data(18,5,2000);
          Data d2 = new Data(23,4,1983);
          Data d3 = new Data(13,7,1943);
          Data d6 = new Data(7,5,1943);
          Data d4 = new Data(12,1,1963);
          Data d5 = new Data(24,8,1988);
          
          Cliente c1 = new Cliente("Juan Ruiz",d1,4541);
          Cliente c2 = new Cliente("Franky Zavala",d2,4234);
          Gerente g1 = new Gerente("Roberto", d3,3154,"TI",1800);
          Gerente g2 = new Gerente("Celso", d4,3444,"Compras",1700);
          Gerente g3 = new Gerente("Gabriel", d5,3754,"Financeiro",2100);
          Gerente g4 = new Gerente("Darcy", d6,3234,"Vendas",1300);
          
          cp1.cadastraPessoa(c1);
          cp1.cadastraPessoa(c2);
          cp1.cadastraPessoa(g1);
          cp1.cadastraPessoa(g2);
          cp1.cadastraPessoa(g3);
          cp1.cadastraPessoa(g4);
          
          cp1.imprimeCadastro();
          
          
      }
}
