/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04;

/**
 *
 * @author magno
 */
public class Main {
    public static void main(String[] args) {
        Paciente testePaciente = new Paciente();
        testePaciente.nome = "Vitor";
        testePaciente.peso = 60;
        testePaciente.altura = 1.69;
        testePaciente.idade = 26;
        
        testePaciente.calcularIMC();
        testePaciente.classificarIMC();
        testePaciente.exibirFicha();
    }
}
