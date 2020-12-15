
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome="Hugo";
        f1.salario=100;
        f1.recebeAumento(50);
        f1.setDepartamento("Sistemas");
        //f1.setDtentrada("16/04/2017");
        /*tratamiento de la fecha*/
        Data odate = new Data();
        odate.setDia(16);
        odate.setMes(04);
        odate.setAno(2018);
        f1.setDataEntrada(odate);
        //f1.dtentrada = ""+f1.date.getDia()+f1.date.getMes()+f1.date.getAno();
        f1.setRg(73828);
        
        System.out.println("salario atual: "+f1.salario);
        System.out.println("ganho anual: "+f1.calculaGanhoAnual());
        
        f1.mostra();
        
        Funcionario f2 = new Funcionario();
        f2.nome="Danilo";
        f2.salario=300;
        f2.recebeAumento(70);
        f2.setDepartamento("Sistemas");
       // f2.setDtentrada("01/05/2017");
        Data odate2 = new Data();
        odate2.setDia(7);
        odate2.setMes(02);
        odate2.setAno(2016);

        f2.setDataEntrada(odate2);
        f2.setRg(5636);
        f2.mostra();
        //f2 = f1;
        //Funcionario f2 = f1;
        if(f1==f2){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
           
        }
        Data data = new Data();
        f1.dataDeEntrada = data;
    }
    }
