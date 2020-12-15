package probFibo;

/**
 *
 * @author FANNY ROSANA PASTOR HUMPIRI
 */
public class Fibonacci {
    public int indice;

    public Fibonacci() {
        this.indice = 0;
    }

    public Fibonacci(int indice) {
        this.indice = indice;
    }
    public int calculaFibonacci(int n){
        //algoritmo de fibonacci
        /*if(n==1 || n==2)
            return 1;
        else 
            return calculaFibonacci(n-1)+calculaFibonacci(n-2);*/
        return (n==1 || n==2)? 1: calculaFibonacci(n-1)+calculaFibonacci(n-2);
    }
}
