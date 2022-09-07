/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula19;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int [] vetorA = new int [5];
        
        for(int i =0; i<vetorA.length;i++){
            System.out.println("Informe o valor da posição: "+i);
            vetorA[i] = teclado.nextInt();
        }
        boolean primo;
        String msg;
        
        for(int i = 0; i<vetorA.length;i++){
            
            primo = true;
            for(int j = 2; j<vetorA[i];j++){
                if(vetorA[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            msg = "";
            if (primo){
                msg  = " primo ";
            } else{
                msg = " nao é primo ";
            }
            System.out.println(vetorA[i] + msg); 
        }    
    }
}
