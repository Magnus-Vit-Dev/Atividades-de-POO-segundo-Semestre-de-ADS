/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author magno
 */
public class Main {
    public static void main(String[] args) {
        Estacionamento testeEstacionamento =  new Estacionamento();
        testeEstacionamento.horasEstacionadas = 5;
        testeEstacionamento.placa = "555-KKK";
        testeEstacionamento.calcularValorCobranca();
        testeEstacionamento.exibirTiquete();
        
        
    }
}
