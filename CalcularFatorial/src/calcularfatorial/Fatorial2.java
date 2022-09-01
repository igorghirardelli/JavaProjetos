/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularfatorial;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Fatorial2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int num = teclado.nextInt();
        
        System.out.println("Fatorial de " +num);
        
        System.out.print(num + "! = ");
        
        int fatorial = 1;
        for(int i=num; i > 1; i-- ){
            fatorial *= i;
            System.out.print(i + " . ");
        }
         System.out.print(" 1 = " +fatorial);
    }
}
