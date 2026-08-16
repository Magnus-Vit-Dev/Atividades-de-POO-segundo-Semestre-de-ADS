/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *Crie uma classe chamada Filme com os seguintes:
• atributos: String titulo; String diretor; int anoLancamento; double
duracaoEmHoras
• método: exibirDetalhes; verificarFilmeClassico (lançado há mais
de 30 anos, considerando o ano atual)
 * @author magno
 */
public class Main {
    public static void main(String[] args) {
        Filme testeFilme = new Filme();
        testeFilme.titulo = "Bastardos Inglorios";
        testeFilme.diretor = "Quentin Taratino.";
        testeFilme.anoLacamento = 2009;
        testeFilme.duracaoEmHoras = 2.33;
        
        testeFilme.exibirDetalhes();
        testeFilme.verificarFilmeClassico();
    }
}
