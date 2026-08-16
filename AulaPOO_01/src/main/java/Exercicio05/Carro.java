/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05;

/**
 * Crie uma classe chamada Carro que tenha os seguintes: • atributos:String
 * marca; String modelo; int ano; double velocidadeAtual • métodos: acelerar
 * (para aumentar a velocidade atual); frear (para diminuir a velocidade atual,
 * sem permitir velocidade negativa); verificarVelocidade (para exibir a
 * velocidade atual); exibirInformacoes (para exibir marca, modelo, ano e
 * velocidade atual).
 *
 * @author Aluno
 */
public class Carro {

    String marca;
    String modelo;
    int ano;
    double velocidadeAtual;

    public void acelerar() {
        
        if (velocidadeAtual < 200) {
            velocidadeAtual = velocidadeAtual + 10;
        }
    }

    public void frear() {
        if (velocidadeAtual > 0 ){
            velocidadeAtual = velocidadeAtual - 10;
        }
    }

    public void verificaarVelocidade() {
        System.out.println("Velocidade Atual --- " + velocidadeAtual);
    }

    public void exibirInformacoes() {
        System.out.println("\nMarca --- " + marca + "\nModelo --- " + modelo + "\nAno --- " + ano + "\nVelocidade Atual --- " + velocidadeAtual);
    }
}
