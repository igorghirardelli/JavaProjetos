
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com a base ");
        int base = teclado.nextInt();
        
        System.out.println("Entre com a potencia");
        int pot = teclado.nextInt();
        
        int resultado = base;
        
        for(int i = 1; i <pot ; i++){
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
