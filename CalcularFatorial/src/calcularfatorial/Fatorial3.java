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
public class Fatorial3 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int numero ;
      long fatorial = 1;
      int i =1;
        System.out.println("Informe um numero pra calcular o fatorial: ");
        numero = teclado.nextInt();
      
        while(i<=numero){
            fatorial *= i;
            i++;
        }
        
        System.out.println("O fatorial de " +numero+" é "+fatorial);
    }
}
