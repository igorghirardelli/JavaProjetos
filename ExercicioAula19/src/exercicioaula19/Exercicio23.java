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
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int[10];
        
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Entre com um numero para a posição: "+i);
            vetorA[i] = teclado.nextInt();
            
            if(vetorA[i] % 2 == 0){
                break;
            }
            
            
        }
        
        
        
        
        
        
        
        
    }
}
