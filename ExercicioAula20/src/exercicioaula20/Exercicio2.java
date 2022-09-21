/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula20;

import java.util.Random;

/**
 *
 * @author igora
 */
public class Exercicio2 {
    public static void main(String[] args) {
        // gere e imprima uma matriz M 10x10 com valores aleatorios entre 0-9
        // Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor
        // da coluna 7
        
        int [][] numerosaleatorios = new int[10][10];
        
        Random numerorandom = new Random();// gerar numero random
        
        for(int i = 0; i<numerosaleatorios.length;i++){
            for(int j = 0;j<numerosaleatorios[i].length;j++){
                numerosaleatorios[i][j] = numerorandom.nextInt(100);
            }
        }
        
        for(int i = 0; i<numerosaleatorios.length;i++){// mostrar a matriz 
            for(int j = 0; j<numerosaleatorios[i].length;j++){
                System.out.print(numerosaleatorios[i][j]+" ");
            }
            System.out.println("");
        }
        int maiorl5 = 0;
        int menorl5 = 101 ;
        int linha5 = 5;
        
        
        for(int i = 0; i<numerosaleatorios[5].length;i++){
            if(numerosaleatorios[5][i]> maiorl5){
                maiorl5  = numerosaleatorios[5][i];
            }
            if(numerosaleatorios[5][i]<menorl5){
                menorl5 = numerosaleatorios[linha5][i];
            }
        }
        
        System.out.println("Maior valor da linha 5 = " +maiorl5);
        System.out.println("Menor valor da linha 5 = " +menorl5);
        
        
        int maiorc7 = 0;
        int menorc7 = 101;
        int col7 = 7;
        
        for(int i = 0; i<numerosaleatorios.length;i++){
            if(numerosaleatorios[i][col7] > maiorc7){
                maiorc7 = numerosaleatorios[i][col7];
            }
            if(numerosaleatorios[i][col7] < menorc7){
                menorc7 = numerosaleatorios[i][col7];
            }
        }
        System.out.println("Maior valor da coluna 7 = " +maiorc7);
        System.out.println("Menor valor da coluna 7 = " +menorc7);
        
        
        
    }
}
