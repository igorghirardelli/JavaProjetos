/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio6 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String resp = "";
       do{
        System.out.println("---------------------");
        System.out.println("---Criança esperança--");
        System.out.println("-Muito obrigado por ajudar!-");
        System.out.println("1 - para doar 10 reais");
        System.out.println("2 - para doar 25 reais");
        System.out.println("3 - para doar 50 reais");
        System.out.println("4 - para doar outro valor ");
        System.out.println("5 - cancelar");
        System.out.println(">>>>>>>>>>>>>> Digite sua opção");
        
        byte op = teclado.nextByte();// operacao
        double valor = 0; // declarando o valor 0
        
        
        switch(op){
            case 1 : valor = 10; break;
            case 2 : valor = 25; break;
            case 3 : valor = 50;break;
            case 4 : System.out.println("Qual valor voce deseja doar? ");
                    valor  = teclado.nextDouble(); break;
            case 5 : valor = 0; break;
             
        }
        
        System.out.println("Sua doação foi de : "+ valor+"R$");
        System.out.println("Obrigado por doar!!!");
        
        System.out.println("");
           System.out.println("Deseja continuar? (sim/nao)");
           resp = teclado.next();
        
       } while(resp.equalsIgnoreCase("sim"));
        
        
        
    }
}
