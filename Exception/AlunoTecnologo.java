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
public class AlunoTecnologo extends Aluno {
    private double pim;
    
    @Override
    public double getMedia() {
        return ((notaB1+notaB2)*0.4)+pim*0.2;
    }

    public double getPim() {
        return pim;
    }

    public void setPim(double pim) {
        this.pim = pim;
    }
    

}
