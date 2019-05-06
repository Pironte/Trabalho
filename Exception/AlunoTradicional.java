/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

/**
 *
 * @author Cliente
 */
public class AlunoTradicional extends Aluno {
    private double notaRec;
    
    @Override
    public double getMedia() {
        return (notaB1+notaB2)/2;
    }
    public boolean isAprovado(){
        return getMedia()>=7;
    }
    
    public double getNotaRec() {
        return notaRec;
    }

    public void setNotaRec(double notaRec) {
        this.notaRec = notaRec;
    }
    public double getRecuperacao(){
        return (getMedia()+notaRec)/2;
    }
    public boolean isAprovadoRec(){
        return getRecuperacao() >=5;
    }
    
}
