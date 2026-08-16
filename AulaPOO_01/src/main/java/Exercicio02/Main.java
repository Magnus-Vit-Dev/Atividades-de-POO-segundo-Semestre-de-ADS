/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Retangulo retanguloInicial = new Retangulo();
        retanguloInicial.altura = 1.80;
        retanguloInicial.largura = 2.35;

        retanguloInicial.calcularArea();
        retanguloInicial.calcularPerimetro();
        retanguloInicial.exibirArea();
        retanguloInicial.exibirPerimetro();
    }
}
