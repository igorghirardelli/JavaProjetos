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
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int [10];
        
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Entre com o numero para a posição: "+i);
            vetorA[i] = teclado.nextInt();
            
            
    
        }
        /// 1221
        //i = 0
        boolean palindromo = true;
        
        for(int i = 0; i<vetorA.length; i++){
            
            if(vetorA[i] != vetorA[vetorA.length -1 - i]){
                palindromo = false;
                break;
            }    
            
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i<vetorA.length;i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();
        
        if(palindromo){
            System.out.println("Palindromo");
        } else{
            System.out.println("Não é Palindromo");
        }
        
        
        
        
    }
}
