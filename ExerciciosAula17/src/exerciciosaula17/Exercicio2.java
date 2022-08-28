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
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean infovalido = false;
        String nome;
        String senha;
        do {
            
            System.out.println("Informe seu usuario: ");
            nome = teclado.next();
            
            System.out.println("Informe a sua senha: ");
            senha =  teclado.next();
            
           if(nome.equalsIgnoreCase(senha)){
               infovalido = false;
               System.out.println("Senha igual do usuario, digite novamente");
           } else {
               infovalido = true;
               System.out.println("Senha e usuario validos");
           }
            
         
        } while (infovalido == false);
        
          
    }
}
