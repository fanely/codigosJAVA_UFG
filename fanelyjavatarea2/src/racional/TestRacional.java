/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;


/**
 *
 * @author Fanny Pastor Humpiri
 */
public class TestRacional {

    public static void main(String[] args) {
        Racional r1 = new Racional(5,2);
        Racional r2 = new Racional(3,3);
        AritmeticaRac op = new AritmeticaRac();
        
  
        r1.mostrar(7, 8);
        r2.mostrar(9, 2);
        op.suma(r1,r2);
        op.resta(r1,r2);
        

        
    }
    
}
