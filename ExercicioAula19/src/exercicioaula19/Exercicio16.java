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
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int [10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a posição: "+i);
            vetorA[i] = teclado.nextInt();
        }
         
        int menor15 = 0;
        int igual15 = 0;
        int maior15 = 0;
        for(int i = 0; i <vetorA.length; i++){           
            if(vetorA[i] == 15){
                igual15++;
            }
            if(vetorA[i] <15 ){ 
                menor15 += vetorA[i];
            } else if(vetorA[i] >15){
                maior15++;
                maior15 += vetorA[i];
            }
        }
        
        System.out.print("Vetor A: ");
        for(int i = 0; i <vetorA.length; i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();
        
        
        System.out.println("Quantidade de numeros == 15: "+igual15);
        System.out.println("Soma dos numeros < 15: "+menor15);
        System.out.println("Média numeros > 15: " + (maior15/menor15));
        
    }
}
