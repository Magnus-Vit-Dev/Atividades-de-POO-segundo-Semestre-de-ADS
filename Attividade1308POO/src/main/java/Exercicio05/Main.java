/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05;

/**
 *
 * @author magno
 */
public class Main {
    public static void main(String[] args) {
        Funcionario vitorFuncionario = new Funcionario();
        vitorFuncionario.nome = "Vitor";
        vitorFuncionario.salarioBruto = 3500.00;
        vitorFuncionario.horasExtras = 28;
        
        vitorFuncionario.calcularValorHoraExtra();
        vitorFuncionario.calcularSalarioLiquido();
        vitorFuncionario.exibirContraCheque();
    }
}
