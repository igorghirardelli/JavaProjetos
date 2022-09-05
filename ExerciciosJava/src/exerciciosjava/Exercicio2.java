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
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano;
        int nasc;
        int idade;
        System.out.println("Em qual ano estamos? ");
        ano = teclado.nextInt();
        System.out.println("O ano do seu nascimento? ");
        nasc = teclado.nextInt();
        
        idade = ano - nasc;
        
        if(idade >= 18){
            System.out.println("Em "+ano+" voce tera " +idade+ "anos ");
            System.out.println("E voce ja tera atingido a maior idade ");
        }else{
            System.out.println("Em " +ano+ "voce tera "+idade+ "anos ");
            System.out.println("E voce ainda será menor de idade ");
        }
        
        
    }
}
