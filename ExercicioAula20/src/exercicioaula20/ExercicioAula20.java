/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioaula20;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author igora
 */
public class ExercicioAula20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // gere e imprima uma matriz M 4x4 com valores aleatorios entre 0-9
        // Após isso determine o maior numero da matriz  e sua posição(linha,coluna)
        Scanner teclado = new Scanner(System.in);
        
        int [][] numerosaleatorios = new int [4][4];
        
        
        Random numerorandom = new Random();// valores aleatorios
        
        for(int i=0; i<numerosaleatorios.length;i++){
            for(int j=0; j<numerosaleatorios[i].length;j++){
                
                numerosaleatorios[i][j] = numerorandom.nextInt(100);
            }
        }
        
        int maior = 0; 
        int linha = 0;
        int col = 0;
        
        for(int i=0; i<numerosaleatorios.length;i++){
            for(int j=0; j<numerosaleatorios[i].length;j++){
                if(numerosaleatorios[i][j] > maior ){
                    maior = numerosaleatorios[i][j];
                    linha = i;
                    col = j;
                }
                
            }
        }
        
        for(int i=0; i<numerosaleatorios.length;i++){ //  fez isso aqui pra mostrar os valores dos numeros 
            for(int j=0; j<numerosaleatorios[i].length;j++){
                
                System.out.print(numerosaleatorios[i][j]+ " ");
            }
            System.out.println();
        } 
        
        System.out.println("Maior valor = "+maior);
        System.out.println("Linha = "+linha);
        System.out.println("Coluna = "+col);
        
        
        
        
    }
    
}
