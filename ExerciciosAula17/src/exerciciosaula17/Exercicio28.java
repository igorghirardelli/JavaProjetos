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
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Entre com um numero");
        int num = teclado.nextInt();
        boolean primo = true;
       
        for(int i = 2; i < num; i++){
            if(num %i == 0){
                System.out.println("Não é primo - divisivel por " +i);
                
                primo = false;
                 
            }
            
            
        }
            if(primo){
            System.out.println("É numero primo");
                     }    
        
    }
    }

