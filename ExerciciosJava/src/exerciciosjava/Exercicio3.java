/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double reais;
        double dolar;
        
        System.out.println("Quantos reais eu tenho ?");
        reais = teclado.nextDouble();
        
        dolar = reais/5;
        
        System.out.println("Posso ter US$"+dolar);
        
        
        
    }
}
