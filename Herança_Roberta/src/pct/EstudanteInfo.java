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
public class EstudanteInfo extends Estudante {

    public EstudanteInfo(double infoBasico, char logica) {
        this.infoBasico = infoBasico;
        this.logica = logica;
    }
    //atributos
    private double infoBasico;
    private char logica; // {B|R|I}
    
    //metodo
    public void atribuirNota(){
        System.out.println("A nota do estudante é: "+ this.logica);
        System.out.println("Sua nota do vestibulinho é: "+this.infoBasico);
    }

    public double getInfoBasico() {
        return infoBasico;
    }

    public char getLogica() {
        return logica;
    }

    public void setInfoBasico(double infoBasico) {
        this.infoBasico = infoBasico;
    }

    public void setLogica(char logica) {
        this.logica = logica;
    }

    public EstudanteInfo() {
    }

    @Override
    public void apresentarEstudante() {
        super.apresentarEstudante(); //To change body of generated methods, choose Tools | Templates.
        this.atribuirNota();
    }

    public EstudanteInfo(double infoBasico, char logica, String nome, int ra) {
        super(nome, ra);
        this.infoBasico = infoBasico;
        this.logica = logica;
    }
    

}

