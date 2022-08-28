
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        
        System.out.println("Entre com o numero para gerar a tabuada");
        int num = teclado.nextInt();
        
        
        System.out.println("Tabuada de num " +num+ ":");
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num+ "x" +i+ "=" + (num*i)); 
        }
        
    }
}
