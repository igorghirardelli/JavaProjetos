/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula20;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio3 {
    public static void main(String[] args) {
    //capture do teclado valores para preenchimento de uma matriz M 3x3. apos a captura imprima a matriz criada
    // e encontre a quantidade de numeros pares e impares
    Scanner teclado = new Scanner(System.in);
    int [][] numeros = new int[3][3];
    
    for(int i = 0; i<numeros.length;i++){
        for(int j = 0; j<numeros[i].length;j++){
            
            System.out.println("Entre com o valor da posicao [" +i+ "," +j+ "]");
            numeros[i][j] = teclado.nextInt();
        }
        
    }
    int qtdpares = 0;
    int qtdimpares = 0;
    for(int i = 0; i<numeros.length;i++){
      for(int j = 0; j<numeros[i].length;j++){
            
          if(numeros[i][j] % 2 == 0){
              qtdpares++;
          }else{
              qtdimpares++;
          }
          
        }  
    }
        
        for(int i = 0; i<numeros.length;i++){// mostrar a matriz 
            for(int j = 0; j<numeros[i].length;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("");
        }
    
        System.out.println("Pares = "+qtdpares);
        System.out.println("Impares = "+qtdimpares);
 
    }
}
