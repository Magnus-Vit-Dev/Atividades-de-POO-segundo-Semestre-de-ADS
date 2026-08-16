/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author magno
 */
public class Main {
    public static void main(String[] args) {
        Produto testeProduto = new Produto();
        testeProduto.nome = "Bomba Atomica";
        testeProduto.preco = 50.00;
        testeProduto.quantidadeEmEstoque = 100;
        
        testeProduto.exibirInformacoes();
        testeProduto.vender();
        testeProduto.reabastecer();
        testeProduto.exibirInformacoes();
    }
}
