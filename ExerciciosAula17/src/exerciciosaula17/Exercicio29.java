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
public class Exercicio29 {
    public static void main(String[] args) {
        //numeros primos
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com um numero");
        int num  = teclado.nextInt();
        boolean primo = true;
        
        for(int i = 1; i <=num; i++){
            
             primo = true;
       
        for(int j = 2; j < i; j++){
            if(i %j == 0){
                
                
                primo = false;
                 
            }
            
            
        }
            if(primo){
            System.out.println(i);
                     }    
        
            
            
            
        }
   
    }
}
