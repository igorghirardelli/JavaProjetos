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
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double [] vetorA = new double[11];
        
        for(int i = 0; i<vetorA.length;i++){
            
            vetorA[i]  = Math.pow(2, i);
        }
        System.out.print("Vetor A = ");
        for(int i = 0; i <vetorA.length; i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();
    }
}
