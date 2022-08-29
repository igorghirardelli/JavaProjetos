
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com o numero de CDs: ");
        int cds  = teclado.nextInt();
        
        double preco;
        double soma = 0;
        
        
        for(int i =1; i<= cds; i++){
            
            System.out.println("Informe o valor do cd" +i);
            preco = teclado.nextDouble();
            
            soma+=preco;
            
        }
        double media = soma / cds;
        
        System.out.println("Media gasta com cada CD"+media);
        
        
    }
}
