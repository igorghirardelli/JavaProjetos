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
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        char [][] jogovelha = new char [3][3];
        
        System.out.println("Jogador 1 = X ");
        System.out.println("Jogador 2 = O ");
        
        boolean ganhou  = false;
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna = 0;
        
        while(!ganhou){
            
            if(jogada % 2 == 1){//jogador1
                
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3) ");  
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3) ");
                sinal = 'O';
            }
            // continua logica
            
            boolean linhavalida = false;
            
            while(!linhavalida){
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = teclado.nextInt();
                
                if(linha >=1 && linha <=3){
                    linhavalida = true;
                } else{
                    System.out.println("Entrada invalida, tente novamente");
                }
                
            }
            boolean colunavalida = false;
            while(!colunavalida){
                System.out.println("Entre com a coluna(1, 2 ou 3)");
                coluna = teclado.nextInt();
                
                if(coluna >=1 && coluna <=3){
                    colunavalida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente");
                }
                
                
            }
            
            linha --; // basicamente é deixar o jogo mais 'facil' para o usuario 
            coluna --;// pq se ele colocar linha 3 e coluna 3 vai dar um erro 
            if(jogovelha[linha][coluna] == 'X' || jogovelha[linha][coluna] == 'O' ){
                System.out.println("Posição ja usada, tente novamente ");
            }else{
                jogovelha[linha][coluna] = sinal;
                jogada++;
            }
            
            //imprimir tabuleiro
            
            for(int i=0; i<jogovelha.length;i++){
                for(int j=0; j<jogovelha[i].length;j++){
                    System.out.print(jogovelha[i][j] +" | ");
                }
                System.out.println("");
            }
            // verificar se tem ganhador
            
             if((jogovelha[0][0] == 'X' && jogovelha [0][1] == 'X' && jogovelha[0][2] == 'X') ||    // linha 1
                 (jogovelha[1][0] == 'X' && jogovelha [1][1] == 'X' && jogovelha[1][2] == 'X') ||   // linha 2
                 (jogovelha[2][0] == 'X' && jogovelha [2][1] == 'X' && jogovelha[2][2] == 'X') ||   // linha 3
                 (jogovelha[0][0] == 'X' && jogovelha [1][0] == 'X' && jogovelha[2][0] == 'X') ||   // coluna 1
                  (jogovelha[0][1] == 'X' && jogovelha [1][1] == 'X' && jogovelha[2][1] == 'X')||   // coluna 2
                   (jogovelha[0][2] == 'X' && jogovelha [1][2] == 'X' && jogovelha[2][2] == 'X')||  // coluna 3
                     (jogovelha[0][0] == 'X' && jogovelha [1][1] == 'X' && jogovelha[2][2] == 'X')){ // diagonal
                 ganhou = true;
                 System.out.println("Parabéns jogador 1 ganhou !");
             } else if((jogovelha[0][0] == 'O' && jogovelha [0][1] == 'O' && jogovelha[0][2] == 'O') ||    // linha 1
                 (jogovelha[1][0] == 'O' && jogovelha [1][1] == 'O' && jogovelha[1][2] == 'O') ||   // linha 2
                 (jogovelha[2][0] == 'O' && jogovelha [2][1] == 'O' && jogovelha[2][2] == 'O') ||   // linha 3
                 (jogovelha[0][0] == 'O' && jogovelha [1][0] == 'O' && jogovelha[2][0] == 'O') ||   // coluna 1
                  (jogovelha[0][1] == 'O' && jogovelha [1][1] == 'O' && jogovelha[2][1] == 'O')||   // coluna 2
                   (jogovelha[0][2] == 'O' && jogovelha [1][2] == 'O' && jogovelha[2][2] == 'O')||  // coluna 3
                     (jogovelha[0][0] == 'O' && jogovelha [1][1] == 'O' && jogovelha[2][2] == 'O')){ // diagonal
                 ganhou = true;
                 System.out.println("Parabéns jogador 2 ganhou !");
             } else if(jogada > 9){
                 ganhou = true;
                 System.out.println("Ninguem ganhou essa partida");
             }
            
            
            
        }     
    }
}
