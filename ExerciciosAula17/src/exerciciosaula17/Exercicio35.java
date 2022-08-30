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
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // PEQUENA REDE DE FASTFOOD
        
        
        boolean naoterminar = true;
        int cod; // codigo
        int qtd; // quantidade
        double total = 0;
        String output = "";
        double valorpago;
        double troco;
        
        System.out.println("Bem vindo ao Rei do hamburguer");
        System.out.println("1 - Hamburguer simples");
        System.out.println("2 - Hamburguer duplo");
        System.out.println("3 - Hamburguer duplo com bacon");
        System.out.println("4 - Hamburguer duplo com cheddar");
        System.out.println("5 - Hamburguer triplo");
        System.out.println("6 - Refrigerante coca cola");
        
        do {
            System.out.println("Digite o código e quantidade. Digite 0 0 para sair ou finalizar o seu pedido.");
            cod = teclado.nextInt();
            qtd = teclado.nextInt();
            
            if(cod == 0 && qtd == 0){
                naoterminar  = false;
                
                System.out.println("Total a pagar = "+total);
                System.out.println("Entre com o valor pago: ");
                valorpago = teclado.nextDouble();
                output += "total a pagar = "+total+"\n";
                output += "Dinheiro: R$ "+ valorpago +"\n";
                troco = valorpago - total;
                
                output += "Troco: R$ "+ troco +"\n";
                
                
                
            }else {
                if(cod == 1){
                    output += "Hamburguer simples -> 1.20 *" +qtd;
                    output += "=" + (1.20*qtd) +"\n";
                    total += 1.20*qtd;
                } else if(cod == 2){
                    output += "Hamburguer duplo -> 1.30 *" +qtd;
                    output += " = " + (1.30*qtd) +"\n";
                    total += 1.30*qtd;
                } else if(cod == 3){
                    output += "Hamburguer duplo com bacon -> 1.50 *" +qtd;
                    output += " = " + (1.50*qtd) +"\n";
                    total += 1.50*qtd;
                } else if(cod == 4){
                    output += "Hamburguer duplo com cheddar -> 1.20 *" +qtd;
                    output += " = " + (1.20*qtd) +"\n";
                    total += 1.20 *qtd;
                } else if(cod == 5){
                    output += "Hamburguer triplo -> 1.30 *"+qtd;
                    output += " = " + (1.30*qtd)+"\n";
                    total += 1.30*qtd;
                } else if(cod == 6){
                    output += "Refrigerante coca cola -> 1.00 *"+qtd;
                    output += " = " + (1.00*qtd)+"\n";
                    total += 1.00*qtd;
                }
            }
            
        }while(naoterminar);
        
        System.out.println(output);
        System.out.println("O estabelecimento agradece sua compra e boa refeição !!");
        
        
    }
}
