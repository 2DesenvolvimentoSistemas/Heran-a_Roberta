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
public class TesteEstudante {
    public static void main(String[] args) {
        
        //criação e instancia do objeto da classe Estudante
        Estudante estudante = new Estudante();
        
        //construcao do objeto
        //estudante.setNome("Roberta");
        //estudante.setRa(12345);
        
        //imprimindo as infofrmaçoes
        System.out.println("\n\t\t\t DADOS DO ESTUDANTE \n");
        estudante.apresentarEstudante();
        
        //criacao e instancia do objeto da classe EstudanteInfo
        EstudanteInfo estudanteInfo = new EstudanteInfo();
        
        //construindo o objeto EstudanteInfo
        estudanteInfo.setNome("Roberta");
        estudanteInfo.setRa(157);
        estudanteInfo.setInfoBasico(10);
        estudanteInfo.setLogica('B');
        
        //imprimindo o objeto
        System.out.println("\n\t\t\t NOTA \n");
        //estudanteInfo.atribuirNota();
        //estudanteInfo.apresentarEstudante();
        estudanteInfo.apresentarEstudante();
    }
    
}

