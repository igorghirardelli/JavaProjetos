/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula19;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] idades = new int [10];
        
        for(int i = 0; i<idades.length;i++){
            System.out.println("Entre com as idades: "+(i+1));
            idades[i] = teclado.nextInt();
        }
        
       int menor = idades[0];
       int indexmenor = 0;
       int maior = idades [0];
       int indexmaior = 0;        
       
            
       for(int i = 1; i <idades.length; i++){
           if(idades[i] > maior ){
               maior = idades[i];
               indexmaior = i;   
           } else if(idades[i]< menor){
               menor = idades[i];
               indexmenor = i;
           }
       }     
            
        System.out.print("Vetor de idades: ");
        for(int i = 1; i<idades.length; i++){
            System.out.print(idades[i] +" ");
        }
        System.out.println();    
            
        System.out.println("Menor de idade: "+menor);
        System.out.println("Indice menor de idade: "+indexmenor);
        System.out.println("Maior de idade: "+maior);
        System.out.println("Indice maior de idade: "+indexmaior);
            
            
            
    }
}
