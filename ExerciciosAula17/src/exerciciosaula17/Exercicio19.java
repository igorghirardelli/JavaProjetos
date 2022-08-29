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
public class Exercicio19 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Entre com o numero de notas");
        int notas = teclado.nextInt();
        
        double soma = 0;
        double media;
        double nota;
        
        for(int i = 0; i < notas; i++){
            System.out.println("Entre com a nota" + (i+1));
            nota = teclado.nextDouble();
            
            soma += nota;
            
            
        }
        media = soma / notas;
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
           
    }
}
