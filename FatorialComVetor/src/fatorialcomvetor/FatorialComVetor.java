/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorialcomvetor;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class FatorialComVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        
        
        for(int i = 0; i<vetorA.length;i++){
            System.out.println("Entre com o valor da posição - "+i);
            vetorA[i] = teclado.nextInt();
        }
        
        for(int i = 0; i< vetorA.length;i++){
            vetorB[i] = 1;
            for(int j = 1; j <vetorA[i];j++){
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
