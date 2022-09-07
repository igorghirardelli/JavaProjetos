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
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] vetorA = new int [10];
        
        for(int i =0; i<vetorA.length;i++){
            System.out.println("Entre com a posição "+i);
            vetorA[i]  = teclado.nextInt();
        }
        System.out.println("");
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Analizando o numero "+vetorA[i]);
            
            for(int j = 2; j <vetorA[i];j++){ // primeiro numero 2 é par
                if(j % 2 == 0){
                    System.out.println(j+ " é par ");
                    
                }
                
            }
            System.out.println("");
            
            
        }
        
        
        
    }
}
