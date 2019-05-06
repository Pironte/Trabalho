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
public abstract class Aluno {
    protected String nome,ra;
    protected double notaB1,notaB2,notaSub;
    protected Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNotaB1() {
        return notaB1;
    }

    public void setNotaB1(double notaB1) {
        if(validaNota(notaB1))
        this.notaB1 = notaB1;
    }

    public double getNotaB2() {
        return notaB2;
    }

    public void setNotaB2(double notaB2) {
        if(validaNota(notaB2))
        this.notaB2 = notaB2;

    }
    
    public abstract double getMedia();
    
    private boolean validaNota(double nota){
        return nota>=-1 && nota<=10;
    }

    public double getNotaSub() {
        return notaSub;
    }

    public void setNotaSub(double notaSub) {
        this.notaB1 = notaSub;
    }
    public void setNotaSub2(double notaSub){
        this.notaB2 = notaSub;
    }
    
    
}
