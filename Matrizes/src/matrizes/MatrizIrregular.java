/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner teclado  =  new Scanner(System.in);
        
        System.out.println("Entre com o numero de pessoas que serão entrevistadas: ");
        int numEntrevistados = teclado.nextInt();
        
        String [][] nomesFilhos = new String [numEntrevistados][]; 
        
       for(int i = 0; i < nomesFilhos.length; i++){
           
           System.out.println("Entre com a quantidade de filhos ");
           int qtdFilhos  = teclado.nextInt();
           
           nomesFilhos[i] = new String [qtdFilhos];
           
           for(int j = 0; j < nomesFilhos[i].length; j++){
               
               System.out.println("Digite o nome do filho "+(j+i));
               
               nomesFilhos[i][j] = teclado.next();
               
               
               
           }
           
       } 
       
       for(int i = 0; i < nomesFilhos.length; i++){
           System.out.println("Pessoa "+i+ " tem " +nomesFilhos[i].length+ " filhos ");
           for(int j = 0; j < nomesFilhos[i].length; j++){
               System.out.println(nomesFilhos[i][j]);
           }   
       }
        
        
    }
}
