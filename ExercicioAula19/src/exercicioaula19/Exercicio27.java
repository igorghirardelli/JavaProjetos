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
public class Exercicio27 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int [] vetorA = new int[10];
     char [] vetorB = new char[vetorA.length];
     
     for(int i = 0; i<vetorA.length; i++){
         System.out.println("Entre com um numero para a posição: "+i);
         vetorA[i] = teclado.nextInt();
         
         if(vetorA[i] < 7){
             vetorB[i] = 'a';
         } else if(vetorA[i] == 7){
             vetorB[i] = 'b';
         } else if(vetorA[i] > 7 && vetorA[i] < 10){
             vetorB[i] = 'c';
         } else if(vetorA[i] == 10 ){
             vetorB[i] = 'd';
         } else if (vetorA[i] > 10){
             vetorB[i] = 'e';
         }
         
             
             
     }
         
        System.out.print("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
            
        }
        System.out.println("");
        
        System.out.print("Vetor B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }
        System.out.println("");
        
    }

}