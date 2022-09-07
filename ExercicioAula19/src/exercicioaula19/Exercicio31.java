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
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int [20];
        int [] vetorB = new int [vetorA.length]; // pares e impares
        
        
        for(int i = 0; i<vetorA.length;i++){
            System.out.println("Entre com o valor da posição 1 - "+i);
            vetorA[i] = teclado.nextInt();
            
        }
        
        int posB = 0;
        
        for(int i = 0; i<vetorA.length; i++){ ///PAR
            if(vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }  
        }
        
        for(int i = 0; i<vetorA.length;i++){ // impar
            if(vetorA[i] % 2 != 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println("");
        
        
        System.out.print("Vetor B = ");
        for(int i = 0; i<posB;i++){
            System.out.print(vetorB[i] +" ");
        }
        System.out.println("");
    }
}
