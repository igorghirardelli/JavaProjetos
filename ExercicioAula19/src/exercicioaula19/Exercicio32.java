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
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int[5];
        
        for(int i = 0; i<vetorA.length;i++){
            System.out.println("Entre com a posição"+i);
            vetorA[i] = teclado.nextInt();
        }
        
        
        for(int i = 0; i<vetorA.length;i++){
            System.out.println("Tabuada de " + vetorA[i]);
            
            for(int j = 1; j<=10;j++){
                System.out.println(j+" * " + vetorA[i] + " = " +(vetorA[i]*j) );
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        
        
    }
}
