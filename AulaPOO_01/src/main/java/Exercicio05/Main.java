/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05;

/**Crie uma classe chamada Carro que tenha os seguintes:
• atributos:String marca; String modelo; int ano; double
velocidadeAtual
• métodos: acelerar (para aumentar a velocidade atual);
frear (para diminuir a velocidade atual, sem permitir
velocidade negativa); verificarVelocidade (para exibir a
velocidade atual); exibirInformacoes (para exibir marca,
modelo, ano e velocidade atual).
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Carro supraCarro = new Carro();
        supraCarro.marca = "Toyota0";
        supraCarro.ano = 1990;
        supraCarro.modelo = "Supra MK4";
        supraCarro.velocidadeAtual = 200;
        
        supraCarro.frear();
        supraCarro.frear();
        supraCarro.verificaarVelocidade();
        supraCarro.acelerar();
        supraCarro.exibirInformacoes();
        
    }
}
