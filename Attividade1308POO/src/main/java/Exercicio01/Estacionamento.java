/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**Crie uma classe chamada Estacionamento que tenha os
seguintes:
• atributos: String placa; int horasEstacionadas
• método: calcularValorCobranca (R$ 8,00 pela primeira hora e R$
5,00 por hora adicional; considere o que fazer se
horasEstacionadas for 0); exibirTiquete
 *
 * @author magno
 */
public class Estacionamento {
    String placa;
    int horasEstacionadas;
    
    public void calcularValorCobranca(){
        if(horasEstacionadas == 1){
            System.out.println("Valor Cobranca: R$ " + 8.00);
        }   else if(horasEstacionadas > 1){
            System.out.println("Valor Cobranca: R$ " + ( 8.00 +((horasEstacionadas - 1) * 5.00 )));
        } else {
            System.out.println("Valor Cobranca: Gratis $$!");
        }
    }
    
    public void exibirTiquete(){
        System.out.println("Placa: " + placa);
        System.out.println("Horas Estacionadas: " + horasEstacionadas);
    }
    
}
