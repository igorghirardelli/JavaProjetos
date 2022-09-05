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
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        int atual;
        int nasc;
        int idade;
        String estado;
        String braco;
        
        System.out.println("Digite seu nome :");
        nome = teclado.nextLine();
        
        System.out.println("Digite o ano atual: ");
        atual = teclado.nextInt();
        
        System.out.println("Digite o ano do seu nascimento: ");
        nasc = teclado.nextInt();
        
        System.out.println("Qual estado voce mora?  ");
        estado = teclado.next();
        
        System.out.println("Voce é destro ou canhoto? ");
        braco = teclado.next();
        
        
        idade = atual - nasc;
        
        if(idade >= 18){
            System.out.println("----------STATUS--------");
            System.out.println(nome);
            System.out.println("idade: "+idade);
            System.out.println("Naturalidade: "+estado);
            System.out.println(braco);
            
            System.out.println("---------------------------");
            System.out.println("Ola " +nome+ " voce tem "+idade+" e pode tirar sua carteira de motorista ");
            
        } else {
            System.out.println("Ola " +nome+ " voce tem "+idade+"portanto não pode tirar sua carteira de motorista");
        }
        
        
    }
}
