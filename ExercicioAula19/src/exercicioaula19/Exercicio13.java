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
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int[10];
        
        for(int i = 0; i<vetorA.length;i++){
            System.out.println("Entre com o valor da posição: "+i);
            vetorA[i] = teclado.nextInt();
        }
        
        int soma = 0;
        for(int i = 0; i<vetorA.length;i++){
            if(vetorA[i] %5 == 0){
                soma += vetorA[i];
            }
        }
        
        System.out.print("Vetor = A ");
        for(int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();
        
        System.out.println("Soma dos numeros: "+soma);
        
        
    }
}
