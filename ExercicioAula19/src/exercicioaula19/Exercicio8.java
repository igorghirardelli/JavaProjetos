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
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];
        
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição A: "+i);
            vetorA[i] = teclado.nextInt();
        }
        for(int i = 0; i<vetorB.length; i++){
            System.out.println("Entre com o valor da posição B: "+i);
            vetorB[i] = teclado.nextInt();
        }
        for(int i = 0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ " ");
        }
        System.out.println("");
        
        System.out.print("Vetor B = ");
        for(int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i]+ " ");
        }
        System.out.println("");
        
        System.out.println("Vetor C = ");
        for(int i = 0; i<vetorC.length; i++){
            System.out.print(vetorC[i]+ " ");
        }
        System.out.println("");
        
        
        
        
        
        
        
    }
}
