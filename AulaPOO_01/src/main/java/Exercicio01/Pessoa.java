/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    String nome;
    int idade; 
    double altura;
    String nacionalidade;

    public void aniversáriar(){
        idade = idade +1;        
    } 
    public void exibirInformacoes(){
        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nAltura:  " + altura +"\nNacionalidadea: " + nacionalidade );
    }
}
