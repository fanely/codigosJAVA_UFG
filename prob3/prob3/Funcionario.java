package prob3;

/**
 *
 * @author Fanny Pastor Humpiri
 */
public class Funcionario {
    double salario;
    String nome;
    String departamento;
    String dtentrada;
    String rg;
    Data dataDeEntrada;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(String dtentrada) {
        this.dtentrada = dtentrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public double recebeAumento(double aum){
        double saum;
        saum= salario+aum;
        return saum;
    }
    public double calculaGanhoAnual(){
        
        return salario*12;
        
    }
     public void mostra() {
         System.out.println("salario: "+this.salario);
         System.out.println("nome: "+this.nome);
         System.out.println("departamento: "+this.departamento);
         System.out.println("dtentrada: "+this.dtentrada);
         System.out.println("rg: "+this.rg);
         
         System.out.println("Dia: "+this.dataDeEntrada.dia);
         System.out.println("Mes: "+this.dataDeEntrada.mes);
         System.out.println("Ano: "+this.dataDeEntrada.ano);
         
         
    }
}
