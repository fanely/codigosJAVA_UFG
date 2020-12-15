

/**
 *
 * @author Fanny Pastor Humpiri
 */
public class Funcionario {
    public String nome;
    public String departamento;
    public double salario;
    public String dtentrada; //dataEntrada
    public int rg;
    public boolean estaNaEmpresa;
    public Data dataDeEntrada; //utilizando la clase Data

    
    
    public Funcionario() {
    	nome = "";
		departamento = "";
		salario = 0;
		//dtentrada = dtentrada;
		rg = 0;
		estaNaEmpresa = true;
		dataDeEntrada = new Data();		
		//super();
	}

	public Funcionario(String nome, String departamento, double salario, int rg,
			boolean estaNaEmpresa, Data dataDeEntrada) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		//this.dtentrada = dtentrada;
		this.rg = rg;
		this.estaNaEmpresa = estaNaEmpresa;
		this.dataDeEntrada = dataDeEntrada;
	}

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

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
    public Data getDataEntrada() {
        return dataDeEntrada;
    }

    public void setDataEntrada(Data data_entrada) {
        this.dataDeEntrada = data_entrada;
    }
    public double recebeAumento(double aum){ //bonifica
        double saum;
        saum= salario+aum;
        return saum; //Salario con aumento.
    }
    public double calculaGanhoAnual(){
        
        return salario*12; //Salario total por 1 año.
        
    }
    public void demite(){
        
        this.estaNaEmpresa=true; //boolean.
        System.out.println(this.nome+" esta Demitido");
    }
    
     public void mostra() {
         System.out.println("salario: "+this.salario);
         System.out.println("nome: "+this.nome);
         System.out.println("departamento: "+this.departamento);
         //System.out.println("dtentrada: "+this.dtentrada);
         System.out.println("rg: "+this.rg);
         double anual=this.calculaGanhoAnual();
         System.out.println("Ganho Anual: "+anual);
         
         System.out.println("Dia: "+this.dataDeEntrada.dia);
         System.out.println("Mes: "+this.dataDeEntrada.mes);
         System.out.println("Ano: "+this.dataDeEntrada.ano);
         
         System.out.println("Data de Entrada: "+this.dataDeEntrada.formatada());
         
         
    }
}