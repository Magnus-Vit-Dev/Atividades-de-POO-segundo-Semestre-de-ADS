/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

import java.util.Scanner;

/**
 * Crie uma classe chamada ContaBancaria que tenha os seguintes: • atributos:
 * String titular; double saldo; String numeroConta • métodos: depositar (para
 * adicionar um valor ao saldo); sacar (para retirar um valor do saldo,
 * verificando se há saldo suficiente); exibirSaldo (para exibir o titular,
 * número da conta e saldo atual).
 *
 * @author Aluno
 */
public class ContaBancaria {

    Scanner sc = new Scanner(System.in);
    String titular;
    double saldo;
    String numeroConta;

    public void exibirSaldo() {
        System.out.println("\nTitular: " + titular + "\nNumero da Conta: " + numeroConta + "\nSaldo Atual: " + saldo);
    }

    public void depositar() {
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("\nInforme o valor a ser depositado: ");

            if (sc.hasNextDouble()) {
                double deposito = sc.nextDouble();
                if (deposito > 0) {
                    saldo = saldo + deposito;
                    entradaValida = true;
                } else {
                    System.out.println("\nValor invalido. O deposito deve ser maior que 0.");

                }
            } else {
                System.out.println("\nErro. Voce nao digitou um valor numerico valido.");
                sc.next();
            }
        }
    }

    public void sacar() {
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("\nInforme o valor do saque: ");

            if (sc.hasNextDouble()) {
                double saque = sc.nextDouble();
                if (saque <= saldo && saque > 0) {
                    saldo = saldo - saque;
                    entradaValida = true;
                }
                else if(saque > saldo){
                    System.out.println("\nSaldo Insuficiente, seu saldo atual e: " + saldo);
                }
                else {
                    System.out.println("\nValor Invalido. O saque deve ser maior que 0.");
                }

            } else {
                System.out.println("\nErro. Voce nao digitou um valor numerico valido.");
                sc.next();
            }
        }
    }
}
