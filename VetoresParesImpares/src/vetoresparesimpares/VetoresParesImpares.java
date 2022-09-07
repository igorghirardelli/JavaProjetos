/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoresparesimpares;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class VetoresParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        // IMPARES E PARES
        int [] vetorA = new int[20];
        int [] vetorB = new int[vetorA.length]; // pares
        int [] vetorC = new int[vetorA.length]; // impares
        
        String resp = "";
        do{
        for(int i = 0; i <vetorA.length; i++){
            System.out.println("Entre com o valor da posição 1 - "+i);
            vetorA[i] = teclado.nextInt();
            
        }
        
        int posB = 0;  // POSIÇÃO DE B
        int posC = 0; // POSIÇÃO DE C
        
        for(int i = 0; i< vetorA.length; i++){
            
            if(vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }else {
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println("");
        
        System.out.print("Vetor B = ");
        for(int i = 0; i<posB; i++){
            System.out.print(vetorB[i] +" ");
        }
        System.out.println("");
        
        System.out.print("Vetor C = ");
        for(int i = 0; i<posC; i++){
            System.out.print(vetorC[i] +" ");
        }
        System.out.println("");
        
            System.out.println("Deseja fazer uma nova consulta ? (Sim ou Nao)");
            resp = teclado.next();
        }while(resp.contains("sim")); 
    }
    }
   
