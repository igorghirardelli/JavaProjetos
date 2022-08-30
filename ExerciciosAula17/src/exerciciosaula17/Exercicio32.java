/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosaula17;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        
        
        boolean naoterminar = true;
        int cod; // codigo
        int qtd; // quantidade
        double total = 0;
        String output = "";
        
        do {
            System.out.println("Digite o código e quantidade. Digite 0 0 para sair.");
            cod = teclado.nextInt();
            qtd = teclado.nextInt();
            
            if(cod == 0 && qtd == 0){
                naoterminar  = false;
                output += "total a pagar = "+total;
            }else {
                if(cod == 100){
                    output += "Cachorro Quente -> 1.20 *" +qtd;
                    output += "=" + (1.20*qtd) +"\n";
                    total += 1.20*qtd;
                } else if(cod == 101){
                    output += "Bauru Simples -> 1.30 *" +qtd;
                    output += " = " + (1.30*qtd) +"\n";
                    total += 1.30*qtd;
                } else if(cod == 102){
                    output += "Bauru com ovo -> 1.50 *" +qtd;
                    output += " = " + (1.50*qtd) +"\n";
                    total += 1.50*qtd;
                } else if(cod == 103){
                    output += "Hamburguer -> 1.20 *" +qtd;
                    output += " = " + (1.20*qtd) +"\n";
                    total += 1.20 *qtd;
                } else if(cod == 104){
                    output += "Cheeseburguer -> 1.30 *"+qtd;
                    output += " = " + (1.30*qtd)+"\n";
                    total += 1.30*qtd;
                } else if(cod == 105){
                    output += "Refrigerante -> 1.00 *"+qtd;
                    output += " = " + (1.00*qtd)+"\n";
                    total += 1.00*qtd;
                }
            }
            
        }while(naoterminar);
        
        System.out.println(output);
        
        
        
    }
}
