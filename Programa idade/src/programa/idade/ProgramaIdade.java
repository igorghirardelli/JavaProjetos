/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.idade;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        System.out.println("Entre com o seu nome: ");
        String nome =  teclado.nextLine();
        
        System.out.println("Entre com a sua idade: ");
        int idade = teclado.nextInt();
        
        
        
        
        if(idade <=0){
            System.out.println("Idade invalida");
        }
        if(idade >= 18 && idade <70){
            System.out.println("Ola "+nome);
            System.out.println("Maior de idade");
        } else if (idade >= 70 ) {
            System.out.println("Ola "+nome);
            System.out.println("Terceira idade");           
        } else if (idade >= 1) {
            System.out.println("Ola "+nome);
            System.out.println("Menor de idade");
            } 
        


        
        
    }
        
        
        
    }
   
