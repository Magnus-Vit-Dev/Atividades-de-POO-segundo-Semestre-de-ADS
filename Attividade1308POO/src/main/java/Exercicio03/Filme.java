/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**Crie uma classe chamada Filme com os seguintes:
• atributos: String titulo; String diretor; int anoLancamento; double
duracaoEmHoras
• método: exibirDetalhes; verificarFilmeClassico (lançado há mais
de 30 anos, considerando o ano atual)
 *
 * @author magno
 */
public class Filme {
    String titulo;
    String diretor;
    int anoLacamento;
    double duracaoEmHoras;
    
    public void exibirDetalhes(){
        System.out.println("\n Titulo: " + titulo + "\nDireto: " + diretor + "\nAno de Lacamento: " + anoLacamento + "\nDuracao: " +duracaoEmHoras);
    }
    
    public void verificarFilmeClassico(){
        if (2026 - anoLacamento >= 30 ){
            System.out.println("\nFilme Classico!");
        }
        else System.out.println("\nNao e classico.");
    }
}
