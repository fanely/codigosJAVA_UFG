package labpessoas;

import java.util.ArrayList;

/**
 *
 * @author FANNY ROSANA PASTOR HUMPIRI
 */
public class CadastroPessoas {
   int qtdAtual;
   ArrayList<Pessoa> apessoa;
   
   public void cadastraPessoa(Pessoa pess){
       apessoa = new ArrayList<>();
       apessoa.add(pess);
   }
   public void imprimeCadastro(){
       for(int i=0;i<5;i++){
         apessoa.get(i);
       }
       
   }
}
