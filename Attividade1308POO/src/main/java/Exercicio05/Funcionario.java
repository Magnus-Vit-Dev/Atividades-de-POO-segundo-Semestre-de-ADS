/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05;

/**Crie uma classe chamada Funcionario com os seguintes:
• atributos: String nome; double salarioBruto; int horasExtras
• método: calcularValorHoraExtra (hora extra com acréscimo de
50% sobre o valor da hora normal); calcularSalarioLiquido
(aplicando um desconto simplificado de INSS);
exibirContracheque
 *
 * @author magno
 */
public class Funcionario {
    String nome;
    double salarioBruto;
    int horasExtras;
    
//  CONSTANTES
    final int JORNADA_MENSAL = 220;
    final double ADICIONAL_HORA_EXTRA = 1.5;
    final double DESCONTO_INSS = 178.31;
    
    public double calcularValorHoraExtra(){
        double valorHoraExtra = (salarioBruto / JORNADA_MENSAL) * horasExtras * ADICIONAL_HORA_EXTRA;
        return valorHoraExtra;
    }
    public double calcularSalarioLiquido(){
        double salarioLiquido = (salarioBruto + calcularValorHoraExtra()) -DESCONTO_INSS;
        return salarioLiquido;
        
    }
    public void exibirContraCheque(){
        System.out.println("\n=== CONTRACHEQUE ===");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Salario Bruto: R$ %.2f%n" , salarioBruto);
        System.out.printf("Horas Extras: %d%n" , horasExtras);
        System.out.printf("Valor Horas Extras: R$ %.2f%n", calcularValorHoraExtra());
        System.out.printf("Desconto INSS: R$ %.2f%n" , DESCONTO_INSS);
        System.out.printf("Salario Liquido: R$ %.2f%n" , calcularSalarioLiquido());
        System.out.println("===============================");
        
    }
}
