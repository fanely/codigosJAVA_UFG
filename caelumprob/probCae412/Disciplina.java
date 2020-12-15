
public class Disciplina {
  String nome;
  double cargahoraria;
  String conteudoProgramativo;
  String dataexame;
  
public Disciplina() {
     this.nome = null;
	 this.cargahoraria = 0;
	 this.conteudoProgramativo=null;
	 this.dataexame=null;
 }
public Disciplina(double disc) {
     this.nome = null;
	 this.cargahoraria = 0;
	 this.conteudoProgramativo=null;
	 this.dataexame=null;
 } 
    public void setNome(String nome) {
      this.nome = nome;
   }
   public String getNome() {
      return nome;
   }
   public void setDataExame(String date) {
      this.dataexame = date;
   }
   public String getDataExame() {
      return dataexame;
   }
   public void setCargaHorario() {
      this.cargahoraria = 4;
   }
   public String getCargaHorario() {
      return "texto";
   }
}