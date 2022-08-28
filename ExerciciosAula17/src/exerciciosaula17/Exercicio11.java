
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio11 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       
        System.out.println("Entre com o primeiro numero:");
        int num1 = teclado.nextInt();
        
        System.out.println("Entre com o segundo numero:");
        int num2 = teclado.nextInt();
        
        int soma = 0;
        
        for(int i = num1; i <= num2; i++){
            
            soma += i;
    }
        System.out.println("Soma: " +soma);
        
    }
}
