package loja;

public class Vendedor {
   String nome;
   int edad;
   int cpf;
   int rg;
   double desconto;
   double fixo;
   double salario;
   double comissao;
   
   public Vendedor() {
	   this.desconto=0;
	   this.salario=0;
	   this.comissao=0;
	   this.fixo=0;
   }
   public Vendedor(String nome, int edad, int cpf, int rg,double fx) {
	   this.nome = nome;
	   this.edad = edad;
	   this.cpf = cpf;
	   this.rg = rg;
	   this.fixo=fx;
   }
   public void calculaDesconto(){
	   //double inss;
	   this.desconto=0.08; //8% de desconto para INSS
	   
   }
   public void calculasalario(){
	   this.salario=(this.fixo+this.comissao)*(1-this.desconto);
	   if(this.salario>=700){
		   this.salario=this.salario*(1-0.005); //Desconto del 5%
	   }
   }
   public void comissao(int ntv,boolean t){
	   if(t==true){ //tela plana
		   if(ntv>=10)
			   this.comissao=50;
		   else //menor que 10
			   this.comissao=30;
	   }else{ //tela comun
		   if(ntv>=20)
			   this.comissao=30;
		   else //menor que 10
			   this.comissao=20;
	   }
	   
   }
   public void mostrar(){
	   System.out.println("Salario Bruto: " +this.fixo);
	   System.out.println("Salario Liquido: " +this.salario);
	   
   }
   
}
