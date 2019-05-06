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
public class Lebre extends Thread {
    public final Random random;
    public Lebre(){
        random = new Random();
    }
    @Override
    public void run(){
        
        int lebre = 0;
        while(lebre <= 100){
            System.out.println("lebre : "+lebre);
            lebre += random.nextInt(6);
        }
        System.out.println("Fim da Corrida para lebre");
    }
}
