
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Preço do pao: R$0.18");
        System.out.println("Panificadora de pão de ontem - tabela de preços");
        
        for(int i = 1; i<=50; i++){
            System.out.println(i+ "R$ - " + (0.18*i));
            
        }  
    }
}
