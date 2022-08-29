
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int num = teclado.nextInt();
        
        System.out.println("Fatorial de " +num);
        
        System.out.print(num + "! = ");
        
        int fatorial = 1;
        for(int i=num; i > 1; i-- ){
            fatorial *= i;
            System.out.print(i + " . ");
        }
         System.out.print(" 1 = " +fatorial);
         
        
        
        
        
        
        
        
    }
}
