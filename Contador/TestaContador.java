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
public class TestaContador extends Thread {
    public static void main(String[] args) {
        // Contador Thread
        ContadorThread contador = new ContadorThread();
        contador.start();
        // Contador implementando Runnable
        ContadorRunnable contador2 = new ContadorRunnable();
        Thread t = new Thread(contador2);
        t.start();
    }
}
