/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corrida;

import java.util.Random;

/**
 *
 * @author Cliente
 */
public class Tartaruga extends Thread {
    public final Random random;
    public Tartaruga(){
        random = new Random();
    }
    @Override
    public void run(){
        
        int tartaruga = 0;
        while(tartaruga <= 100){
            System.out.println("Tartaruga : "+tartaruga);
            tartaruga += random.nextInt(4);
        }
        System.out.println("Fim da Corrida para Tartaruga");
    }
}
