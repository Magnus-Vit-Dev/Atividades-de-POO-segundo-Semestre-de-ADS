/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04;

/**
 *Crie uma classe chamada Paciente com os seguintes:
• atributos: String nome; double peso (em kg); double altura (em
metros); int idade
• método: calcularIMC; classificarIMC (abaixo do peso, peso
normal, sobrepeso ou obesidade, de acordo com as faixas
oficiais de IMC); exibirFicha
 * @author magno
 */
public class Paciente {

    String nome;
    double peso;
    double altura;
    int idade;

    public void calcularIMC() {
        double imc;
        imc = peso /(altura * altura);
        System.out.printf("\nIMC: %.2f" , imc);
    }

    public void classificarIMC() {
        double imc = (peso) / (altura * altura);
    
        if (imc < 18.5) {
            System.out.println("\nAbaixo do Peso.");
        }
        else if (imc < 24.9) {
            System.out.println("\nPeso normal ou adeguado.");
        }
        else if (imc < 29.9) {
            System.out.println("\nSobrepeso.");
        }
        else {
            System.out.println("\nObesidade.");
        }
}
    public void exibirFicha(){
        System.out.println("\nNome: " + nome + "\nPeso: " + peso + "\nAltura: " + altura + "\nIdade: " + idade);
    }
}