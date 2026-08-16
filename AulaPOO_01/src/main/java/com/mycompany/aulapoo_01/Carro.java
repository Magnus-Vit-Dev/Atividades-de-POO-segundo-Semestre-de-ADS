/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapoo_01;

/**
 *
 * @author Aluno
 */
public class Carro {

    String marca;
    String modelo;
    int ano;

    public void ligar() {
        System.out.println("O Carro está ligado na FASTEG!!!");
    }

    public void mostrarInfo() {
        System.out.println("\nMarca: " + marca + "\n || Modelo: " + modelo + "\n || Ano:" + ano);
    }
}
