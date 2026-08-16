/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04;

import java.util.Scanner;

/**
 * 4. Crie uma classe chamada Produto que tenha os seguintes: • atributos:
 * String nome; double preco; int quantidade; String categoria • métodos:
 * adicionarEstoque (para aumentar a quantidade disponível); removerEstoque
 * (para diminuir a quantidade, verificando se há estoque suficiente);
 * calcularValorEstoque (para calcular o valor total dos produtos em estoque);
 * exibirInformacoes (para exibir nome, preço, quantidade e categoria).
 *
 * @author Aluno
 */
public class Produto {

    Scanner sc = new Scanner(System.in);
    String nome;
    double preco;
    int quantidade;
    String categoria;

    public void adicionarEstoque() {
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Informe a quantidade a adicionar: ");

            if (sc.hasNextInt()) {
                int adicionando;
                adicionando = sc.nextInt();
                if (adicionando > 0) {
                    quantidade = quantidade + adicionando;
                    entradaValida = true;
                } else {
                    System.out.println("Valor digitado invalido, tente um numero maior que 0.");

                }
            } else {
                System.out.println("Erro: Você não digitou um número inteiro.");
                sc.next();
            }

        }
    }

    public void removerEstoque() {
        boolean entradaValida = false;
        int removendo = 0;

        while (!entradaValida) {
            System.out.println("Informe a quantidade a remover: ");

            if (sc.hasNextInt()) {
                removendo = sc.nextInt();

                if (removendo > 0 && removendo <= quantidade) {
                    quantidade = quantidade - removendo;
                    entradaValida = true;
                } else if (removendo > quantidade) {
                    System.out.println("Erro. Estoque insuficiente! Voce so possui " + quantidade + " unidades");
                } else {
                    System.out.println("Valor digitado invalido. Digite um numero maior que 0");
                }
            } else {
                System.out.println("Erro. Voce nao digitou um numero inteiro.");
                sc.next();
            }

        }
    }

    public void calcularValorEstoque() {
        double valorTotal = quantidade * preco;
        System.out.println("Preco do Estoque: " + valorTotal);

    }

    public void exibirInformacoes() {
        System.out.println("\nNome do Produto: " + nome + "\nPreco: " + preco + "\nQuantidade:" + quantidade + "\nCategoria:" + categoria);
    }
}
