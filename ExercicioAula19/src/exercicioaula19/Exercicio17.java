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
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] idades = new int[10];
        
        for(int i = 0; i<idades.length;i++){
            System.out.println("Entre com a idade da pessoa " +(i+1));
            idades[i] = teclado.nextInt();
        }
        
        int qtd = 0;
        for(int i = 0; i<idades.length; i++){
            if(idades[i] > 35){
                qtd++;
            }
        }
        
        System.out.print("Vetor Idades =  ");
        for(int i = 0; i<idades.length;i++){
            System.out.println(idades[i] +" ");
        }
        System.out.println();
        
        System.out.println("Quantidade de pessoas acima de 35 anos: "+qtd);
        
        
        
        
        
        
        
        
    }
}
