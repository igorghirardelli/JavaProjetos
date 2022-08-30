/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosaula17;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de n");
        int  n = teclado.nextInt();
        double soma = 0;
        
        for(int i = 1, j = 1; i <= n; i++, j+=2){
            
            System.out.print(i + "/"+ j + " + ");
            
            soma += i/j;
        }
        
        System.out.println("\nSoma = "+soma);
        
        
        
    }
}
