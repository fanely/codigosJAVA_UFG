package labpessoas;

/**
 *
 * @author FANNY ROSANA PASTOR HUMPIRI
 */
public class Funcionario extends Pessoa{
    float salario=0;
    int codigo;


    
    
    public float calculaImposto(){
        return (3/100)*this.salario;
    }
    @Override
    public void imprimeDados(){

    }
}
