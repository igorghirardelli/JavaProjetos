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
public class Exercicio37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Entre com o a posição "+i);
            vetorA[i] = teclado.nextInt();
        }
        
        for(int i = 0; i<vetorA.length; i++){
            vetorB[i] = 1; /// opcional
            for(int j = 1; j <= vetorA[i]; j++){
             vetorB[i] *= j;   
            }
            
    
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println("");
        
        System.out.print("Vetor B = ");
        for(int i = 0; i<vetorB.length;i++){
            System.out.print(vetorB[i]+" ");
        }
    }
}
