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
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double reais;
        double parcela;
        double resu; // 20% de juros para descobrir quanto ele vai pagar
        double valorparc;
        double y = 20;// 20% de juros
        
        System.out.println("Quantos reais voce quer pegar emprestado ?");
        reais = teclado.nextDouble();
        
        System.out.println("Quantas parcelas vc quer pagar? ");
        parcela = teclado.nextDouble();
        
        
        resu = reais *(y/100); // o quanto ele vai pagar de juros
        
        System.out.println("O preco sera de : "+ (resu+reais));
        System.out.println("Cada parcela vai ser de : "+(reais+resu)/parcela);
        
        
        
        
    }
}
