/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;
import java.util.Scanner;
/**
 *
 * @author Cliente
 */
public class Escola {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AlunoTradicional aluno = new AlunoTradicional();
        System.out.println("Escola");
        System.out.println("Digite as notas B1 e B2");
        System.out.println("Se perdeu alguma prova,digite -1 em qualquer uma das notas");
        System.out.println("Sua prova será substituida");
        System.out.println("Digite a nota B1 : ");
        try{
            aluno.setNotaB1(Double.valueOf(s.nextLine()));
        }catch(NumberFormatException ex){
            System.out.println("O valor digitado para nota B1 não é um número");
        }
        
        System.out.println("Digite a nota B2:");
        aluno.setNotaB2(Double.valueOf(s.nextLine()));
        if(aluno.getNotaB1() == -1){
            System.out.println("Digite a nota da sub,referente a nota B1 : ");
            try{
                aluno.setNotaSub(Double.valueOf(s.nextLine()));
            }catch(NumberFormatException ex){
                System.out.println("O valor da nota não é um numero");
            }
            
        }
        if(aluno.getNotaB2() == -1){
            System.out.println("Digite a nota da sub,referente a nota B2 : ");
            try{
                aluno.setNotaSub2(Double.valueOf(s.nextLine()));
            }catch(NumberFormatException ex){
                System.out.println("O valor da nota não é um numero");
            }
        }
        if(aluno.isAprovado()){
            System.out.println("Aluno Aprovado");
            System.out.println("Media : "+aluno.getMedia());
        }else{
            System.out.println("Digite a nota de Recuperacao : ");
            try{
            aluno.setNotaRec(Double.valueOf(s.nextLine()));
            }catch(NumberFormatException ex){
                System.out.println("A nota de recuperacão não é um número");
            }
            if(aluno.isAprovadoRec()){
                System.out.println("Aluno Aprovado");
                System.out.println("Media : "+aluno.getRecuperacao());
                }else{
                System.out.println("Aluno Reprovado");
                }
        }
        
    }
}
