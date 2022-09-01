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
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double [] vetorA = new double [20];
        double cot ; // cotação
        
        System.out.println("Entre com a cotação do dolar: ");
        cot = teclado.nextDouble();
        
        for(int i = 0; i<vetorA.length; i++){
            vetorA[i] = cot * (i+1);
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i] +" ");
        }
        
        System.out.println();
        
        
        
        
        
    }
    
}
