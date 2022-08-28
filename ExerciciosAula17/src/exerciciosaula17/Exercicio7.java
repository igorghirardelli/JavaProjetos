
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;
        
        
        for(int i=0; i<5; i++){
            System.out.println("Entre com um numero:");
            num = teclado.nextInt();
            
            if(num > maior){
                maior = num;
                System.out.println("O numero maior mudou: "+maior);
            }
    }       
        System.out.println("O maior numero digitado foi: " +maior);
        
        
    }
}
