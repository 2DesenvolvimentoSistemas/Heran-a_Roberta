/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Roberta
 */
public class Estudante {

    public Estudante(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }
    //atributos
    private String nome;
    private int ra;
    
    //método
    public void apresentarEstudante (){
        System.out.println("Nome: "+ this.nome);
        System.out.println("RA: "+ this.ra);
    }

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public Estudante() {
        this.setNome("Nome não informado!");
    }



}

