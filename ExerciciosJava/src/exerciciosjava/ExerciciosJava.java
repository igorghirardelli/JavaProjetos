/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class ExerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int atual;
        int nasc;
        int total;
        
        System.out.println("Digite o ano a do nascimento: ");
        nasc = teclado.nextInt();
        
        System.out.println("Digite o ano que estamos: ");
        atual = teclado.nextInt();
        
        total = nasc - atual;
        
        System.out.println("Sua idade atual é: "+total);
        
        
        
        
    }
    
}
