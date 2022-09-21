/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Matrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       double [][] notasalunos = new double [3][4]; // 3 alunos para 4 notas  3 linhas para 4 colunas
               
       notasalunos[0][0] = 10;
       notasalunos[0][1] = 7;              
       notasalunos[0][2] = 9;
       notasalunos[0][3] = 9.5;
       
       notasalunos[1][0] = 9;
       notasalunos[1][1] = 8;              
       notasalunos[1][2] = 7;
       notasalunos[1][3] = 9;    
       
      notasalunos[2][0] = 8;
      notasalunos[2][1] = 9;              
      notasalunos[2][2] = 10;
      notasalunos[2][3] = 7; 
       
       
      for(int i = 0; i<notasalunos.length;i++){
          
          for(int j=0; j<notasalunos[i].length;j++){
              System.out.print(notasalunos[i][j] +" - ");
          }
          System.out.println();
      }   
      
      notasalunos[1][3] = 8; // caso eu querer trocar a nota do aluno
      
        System.out.println(); 
      
      
      for(int i = 0; i<notasalunos.length;i++){
          
          for(int j=0; j<notasalunos[i].length;j++){
              System.out.print(notasalunos[i][j] +" - ");
          }
          System.out.println();
      }    
      
      //
        System.out.println("Calculando a media de cada aluno");
      
        
       double soma;
       for(int i = 0; i<notasalunos.length;i++){
           
           soma = 0;
          for(int j=0; j<notasalunos[i].length;j++){
             soma += notasalunos[i][j];
              
          }
           System.out.println("A media do aluno "+i+" é = "+ (soma/4));
      }   
        System.out.println("");
       
     //double[] notasalunos1 =  {7,8,9,10};
      
     double[][] notasalunos2 = {{7, 8, 9, 10}, {8, 6, 7, 10}}; // iniciar matrizes de uma vez 
     
        System.out.println("Output da matriz notaAlunos 2");
     for(int i = 0; i<notasalunos2.length;i++){
          
          for(int j=0; j<notasalunos2[i].length;j++){
              System.out.print(notasalunos2[i][j] +" - ");
          }
          System.out.println();
      }    
       
    }
    
}
