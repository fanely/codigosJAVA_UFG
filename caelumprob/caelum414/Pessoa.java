/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum414;

/**
 *
 * @author USER
 */
public class Pessoa {
    public String nome;
    public int edade;
    public int edadenova;

    public Pessoa() {
        this.nome = null;
        this.edade = 0;
        this.edadenova=0;
    }
    public Pessoa(String nome, int edade,int edadenova) {
        this.nome = nome;
        this.edade = edade;
        this.edadenova=edadenova;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public int getEdadenova() {
        return this.edadenova;
    }

    public void setEdadenova(int edadenova) {
        this.edadenova = edadenova;
    }
    
    public void fazAniversario(){
        this.setEdadenova(getEdadenova()+1);
    }
    public void mostra(){
        System.out.println(nome+" "+edade+" "+edadenova);
    }
    
}
