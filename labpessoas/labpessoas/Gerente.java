package labpessoas;

/**
 *
 * @author FANNY ROSANA PASTOR HUMPIRI
 */
public class Gerente extends Funcionario{
        String area;

        
    public Gerente(String nome, Data nasc,int codigo, String area,float salario) {
        
        this.area = area;
        this.nome=nome;
        this.codigo=codigo;
        this.area=area;
        this.salario=salario;
        this.nascimento=nasc;
        
    }

        
        
        @Override
    public float calculaImposto(){
        return (5/100)*this.salario;
    }
        @Override
    public void imprimeDados(){
        //imprime dados
        System.out.println("Nombre: "+this.nome);
        System.out.println("Nascimento: "+this.nascimento);
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Area: "+this.area);
        System.out.println("Imposto: "+this.calculaImposto());
        
        
    }
}
