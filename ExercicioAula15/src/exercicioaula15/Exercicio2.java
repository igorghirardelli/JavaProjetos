
package exercicioaula15;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um valor: ");
        Double valor = scan.nextDouble();
        
        if(valor >= 0){
            System.out.println("O valor é positivo");
        } else {
            System.out.println("O valor é negativo");
        }
        
        
        
        
        
    }
    
}
