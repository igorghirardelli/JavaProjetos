
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int popA = 80000;
        int popB = 200000;
        
        int cont = 0;
        
        while(popA < popB){
            popA += (popA/100) *3;
            popB +=(popB/100) *1.5;
            cont++;
        }
        
        System.out.println("PopulaçãoA: "+popA);
        System.out.println("PopulaçãoB: "+popB);
        System.out.println("Quantidade de anos: "+cont);
    }
}
