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
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //System.out.println("Lojas Tabajaras ");
        //PEQUENO CAIXA
        
        
        boolean sair = false;
        String contcompra;  // continuar compra
        int qtdprod;  // quantidade de produto 
        double preco;
        double total;
        String output;
        double valorpago, troco;
        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            contcompra = teclado.next();
            if(contcompra.equalsIgnoreCase("s")){
                output= "lojas tabajara\n";
                          
                System.out.println("Digite a quantidade de produtos da compra:");
                qtdprod = teclado.nextInt();
                total = 0;
                
                for(int i = 1; i<= qtdprod; i++){
                
                    System.out.println("Informe preço do produto " +i);
                    preco = teclado.nextDouble();
                    total += preco;
                    output += "Produto "+ i +": R$ "+ preco + "\n";  
            }
             output += "Total: R$ " +total +"\n";  
             
                System.out.println("Total: R$ " +total);
                
                
                System.out.println("Entre com o valor pago: ");
                valorpago = teclado.nextDouble();

                output += "Dinheiro: R$ "+ valorpago +"\n";

                
                troco = total - valorpago;
                
                output += "Troco: R$ "+ troco +"\n";
                
                System.out.println(output);
                 
    
            } else {
                sair = true;
            }
            
            
            
        }while(!sair);
        
        
        
        
        
        
    }
}
