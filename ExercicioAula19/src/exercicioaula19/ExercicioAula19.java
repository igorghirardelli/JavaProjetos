/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioaula19;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class ExercicioAula19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int [] vetorA = new int [5];
        int [] vetorB = new int [vetorA.length];
        
        for(int i = 0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição: "+i);
            vetorA[i] = teclado.nextInt();
            
            vetorB[i] = vetorA[i];
        }
        
          System.out.print("Vetor A = ");      
          for (int i = 0; i<vetorA.length; i++){
              System.out.print(vetorA[i] + "");
          }
          System.out.println();
          
          System.out.print("Vetor B = ");      
          for (int i = 0; i<vetorB.length; i++){
              System.out.print(vetorB[i] + "");
          }
          System.out.println();
    }
    
}
