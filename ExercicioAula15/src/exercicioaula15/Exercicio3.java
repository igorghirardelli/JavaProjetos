
package exercicioaula15;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com uma letra(F ou M)");
        String input = scan.next();
        
        if ("f".equals(input) ){
            System.out.println("F - feminino");
        }else if("m".equals(input)){
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo invalido");
        }
        
        
        
        
        
    }
}
