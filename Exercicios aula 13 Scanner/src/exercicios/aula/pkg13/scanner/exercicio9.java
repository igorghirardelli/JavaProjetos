
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Farenheint");
        Double f = teclado.nextDouble();
        
        Double c = (5 * (f-32) /9);
        
        System.out.println("A temperatura"+f+ "F é igual a " +c+"C");
        
        
    }
    
}
