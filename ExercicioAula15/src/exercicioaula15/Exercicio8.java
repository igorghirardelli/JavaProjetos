
package exercicioaula15;

import java.util.Scanner;


public class Exercicio8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o preço do primeiro produto:");
        Double p1 = scan.nextDouble();
        System.out.println("Insira o preço do segundo produto");
        Double p2 = scan.nextDouble();
        System.out.println("Insira o preço do terceiro produto");
        Double p3 = scan.nextDouble();
        
        
        if(p1 <= p2 && p1 <= p3){
            System.out.println("preço 1 é o menor");
        }
        else if(p2 <= p1 && p2 <=p3){
            System.out.println("preço 2 é o menor");
        }
        else if (p3 <= p1 && p3 <= p2){
            System.out.println("preço 3 é o menor ");
        }
        
        
        
        
        
    }
}
