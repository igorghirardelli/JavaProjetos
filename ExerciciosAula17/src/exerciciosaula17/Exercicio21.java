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
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com o numero de turmas");
        int numturmas = teclado.nextInt();
        
        int numalunos;
        int soma = 0;
        boolean invalido = true;
        
        for(int i=1; i<=numturmas; i++){
            invalido = true;
            do {
                System.out.println("Entre com o numero de alunos da turma "+ i);
                numalunos = teclado.nextInt();
            
                if(numalunos <= 40 ){
                    invalido = false;
                } else{
                    System.out.println("Numero invalido. Digite novamente");
                }
            }while(invalido);
            
            soma += numalunos;
            
        }
        double media = soma / numturmas;
        System.out.println("Média: "+media);
       
    }
}
