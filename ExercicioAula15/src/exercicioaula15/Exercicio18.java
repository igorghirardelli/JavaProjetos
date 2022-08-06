
package exercicioaula15;

import java.util.Scanner;


public class Exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com um numero");
        int num = teclado.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        
        
        
        
    }
}
