/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impareparvetor;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class ImpareParVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // IMPARES E PARES
        int [] vetorA = new int[10];
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
            
            if(vetorA[i] %2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            } else{
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }  
            System.out.print("Vetor A = "); // imprimir o valores de A de 1 a 10
            for(int i = 0; i<vetorA.length; i++){
               System.out.print(vetorA[i] +" ");
                }
                 System.out.println("");
            
            System.out.print("Vetor B = "); // imprimir os valores pares de B
            for(int i = 0; i<posB; i++){
            System.out.print(vetorB[i] +" ");
            }
            System.out.println("");
            
            System.out.print("Vetor C = "); // Imprimir os valores de impares de C
            for(int i = 0; i<posC; i++){
            System.out.print(vetorC[i] +" ");
            }
             System.out.println("");
        
        
             System.out.println("Deseja fazer uma nova consulta? (sim/nao)");
              resp = teclado.next();
        
        
        
        }while(resp.contains("sim"));
        
    }
    
}
