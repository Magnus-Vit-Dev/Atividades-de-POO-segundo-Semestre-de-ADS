/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

import java.util.Scanner;

/**
 * Crie uma classe chamada Produto com os seguintes: • atributos: String nome;
 * double preco; int quantidadeEmEstoque • método: vender (não pode vender mais
 * unidades do que há em estoque); reabastecer; exibirInformacao
 *
 * @author magno
 */
public class Produto {

    String nome;
    double preco;
    int quantidadeEmEstoque;
    Scanner sc = new Scanner(System.in);

    public void vender() {
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("\nDigite a quantidade da venda: ");
            if (sc.hasNextInt()) {
                int quantidadeVenda = sc.nextInt();
                if (quantidadeVenda > 0) {
                    if (quantidadeVenda <= quantidadeEmEstoque) {
                        quantidadeEmEstoque = quantidadeEmEstoque - quantidadeVenda;
                        entradaValida = true;
                    } else {
                        System.out.println("Estoque insuficiente. Disponivel para venda: " + quantidadeEmEstoque);
                    }
                } else {
                    System.out.println("\nErro. Digite um valor maior que 0.");
                }
            } else {
                System.out.println("\nErro. Tente um numero inteiro valido.");
                sc.next();
            }
        }
    }

    public void reabastecer() {
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("\nDigite a quantidade a adiconar.");
            if (sc.hasNextInt()) {
                int adicionar = sc.nextInt();
                if (adicionar > 0) {
                    quantidadeEmEstoque = quantidadeEmEstoque + adicionar;
                    entradaValida = true;
                } else {
                    System.out.println("Erro. Tente um valor maior que 0.");
                }
            } else {
                System.out.println("Erro. Tente um numero inteiro valido.");
                sc.next();
            }
        }

    }

    public void exibirInformacoes() {
        System.out.println("\nNome: " + nome + "\nPreco: " + preco + "\nQuantidade Em Estoque: " + quantidadeEmEstoque);
    }
}
