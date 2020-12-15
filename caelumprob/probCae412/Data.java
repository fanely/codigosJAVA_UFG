
/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data() {
		
		dia = 1;
		mes = 1;
		ano = 2000;
	}
    public Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String formatada(){
		return dia+"/"+mes+"/"+ano;
	}
}