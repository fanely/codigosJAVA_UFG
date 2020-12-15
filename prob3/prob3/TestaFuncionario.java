package prob3;

/**
 *
 * @author Fanny Pastor Humpiri
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome="Hugo";
        f1.salario=100;
        f1.recebeAumento(50);
        
        System.out.println("salario atual: "+f1.salario);
        System.out.println("ganho anual: "+f1.calculaGanhoAnual());
        
        f1.mostra();
        
        Funcionario f2 = new Funcionario();
        f2.nome="Danilo";
        f2.salario=200;
        
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
    

