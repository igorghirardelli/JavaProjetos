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
public class Exercicio27 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de temperaturas: ");
        int qtdtemperaturas = teclado.nextInt();
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        
        
        
        for(int i = 1; i<=qtdtemperaturas; i++){
          
            System.out.println("Entre com a temperatura"+i);
            temp = teclado.nextDouble();
             
            
            soma += temp;
            
            if(temp > maior){
                maior  = temp;
            }
            if(temp < menor){
                menor = temp;
            }
            
    }
        
            System.out.println("Média: " +(soma/qtdtemperaturas) );
            System.out.println("Menor temperatura: "+menor);
            System.out.println("Maior temperatura: "+maior);
        
        
        
        
        
    }
}
