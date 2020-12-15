package labpessoas;

/**
 *
 * @author FANNY ROSANA PASTOR HUMPIRI
 */
public class Cliente extends Pessoa{
    int codigo;

    public Cliente(String nome,Data nasc,int codigo) {
        this.nome = nome;
        this.nascimento = nasc;
        this.codigo = codigo;
    }
    
    @Override
    public void imprimeDados(){
        //imprime dados del cliente
        System.out.println("Nombre: "+this.nome);
        System.out.println("Nascimento: "+this.nascimento);
        System.out.println("Codigo: "+this.codigo);
    }
}
