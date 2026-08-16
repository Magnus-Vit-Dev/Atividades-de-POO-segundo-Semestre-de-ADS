/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aulapoo_01;

/**
 *
 * @author Aluno
 */
public class AulaPOO_01 {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Supra MK2";
        meuCarro.ano = 2020;

        meuCarro.ligar();
        meuCarro.mostrarInfo();
    }
}
