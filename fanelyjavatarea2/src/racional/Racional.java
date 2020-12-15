/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

/**
 *
 * @author FANNY PASTOR HUMPIRI
 */
public class Racional {
    int num;
    int den;

     public Racional() {
        this.num = 0;
        this.den = 1;
    }
    
    public Racional(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    public void mostrar(int num, int den) {
        this.num = num;
        this.den = den;
        System.out.println(num+"/"+den);
    }  
}
