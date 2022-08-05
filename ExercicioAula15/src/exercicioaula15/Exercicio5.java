
package exercicioaula15;

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a nota1: ");
        Double n1 = scan.nextDouble();
        
        System.out.println("Entre com a nota2: ");
        Double n2 = scan.nextDouble();
        
        Double res = (n1 + n2) /2;
        
        System.out.println("A media e: " +res);
        
        if(res == 10){
            System.out.println("Aprovado com distinção");
        }
        else if (res >= 7){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
                
                
                
                
    }
}
