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
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num ;
        int soma = 0;
        double media;
        
        for (int i = 0; i <5; i++){
            System.out.println("Entre com o numero");
            num = teclado.nextInt();
            
            soma +=num;
            
            
        }
        media = soma /5;
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
        
    }
}
