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
public class InicioCorrida {
    public static void main(String[] args) {
        Lebre lebre = new Lebre();
        Tartaruga tartaruga = new Tartaruga();
        lebre.start();
        tartaruga.start();
    }
}
