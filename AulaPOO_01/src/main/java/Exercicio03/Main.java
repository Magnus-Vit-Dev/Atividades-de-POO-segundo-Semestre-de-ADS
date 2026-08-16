/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        ContaBancaria magnoContaBancaria = new ContaBancaria();
        magnoContaBancaria.titular = "Magno Vitor";
        magnoContaBancaria.numeroConta = "666777-3";
        magnoContaBancaria.saldo = 2000;

        magnoContaBancaria.sacar();
        magnoContaBancaria.exibirSaldo();
        magnoContaBancaria.depositar();
        magnoContaBancaria.exibirSaldo();
    }
}
