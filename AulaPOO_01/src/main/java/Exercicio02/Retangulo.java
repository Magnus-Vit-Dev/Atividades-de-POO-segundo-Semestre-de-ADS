/*
 * Click 
 * Click
 */
package Exercicio02;

/**
 *Crie uma classe chamada Retangulo com os seguintes:
• atributos: double altura; double largura
• método: calcularArea; calcularPerimetro; exibirArea;
exibirPerimetro
 * @author Aluno
 */
public class Retangulo {

    double altura;
    double largura;
    double areaRetangulo;
    double perimetroRetangulo;

    public void calcularArea() {
        areaRetangulo = altura * largura;

    }

    public void calcularPerimetro() {
        perimetroRetangulo = 2 * (altura + largura);
    }

    public void exibirArea() {
        System.out.println("\nArea do Retangulo: " + areaRetangulo);
    }

    public void exibirPerimetro() {
        System.out.println("\nPerimentro Retangulo: " + perimetroRetangulo);
    }
}
