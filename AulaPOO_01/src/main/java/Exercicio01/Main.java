/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Pessoa MagnoPessoa = new Pessoa();
        MagnoPessoa.altura = 1.80;
        MagnoPessoa.idade = 26;
        MagnoPessoa.nacionalidade = "Brasileiro";
        MagnoPessoa.nome = "Magno";
        
        MagnoPessoa.aniversáriar();
        MagnoPessoa.exibirInformacoes();
    }
}
