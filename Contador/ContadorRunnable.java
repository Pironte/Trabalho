/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corrida;

/**
 *
 * @author Cliente
 */
public class ContadorRunnable implements Runnable {

    @Override
    public void run() {
        for(int x =0;x<=100;x++){
            System.out.println(x);
        }
    }
    
}
