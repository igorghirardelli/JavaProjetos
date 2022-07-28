
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        int numero2 = teclado.nextInt();
       
        int res = numero1 + numero2;
        
        System.out.println("o resultado da soma é: " +res);
        
    }
}
