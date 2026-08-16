/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto testeProduto = new Produto();
        testeProduto.nome = "Bomba atomica.";
        testeProduto.preco = 99.99;
        testeProduto.categoria = "Arma de Destruicao em Massa.";
        testeProduto.quantidade = 59;

        testeProduto.adicionarEstoque();
        testeProduto.exibirInformacoes();
        testeProduto.removerEstoque();
        testeProduto.exibirInformacoes();
        testeProduto.calcularValorEstoque();
        testeProduto.exibirInformacoes();
    }

}
