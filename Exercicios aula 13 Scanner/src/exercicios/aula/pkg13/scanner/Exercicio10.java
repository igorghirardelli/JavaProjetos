
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Celsius");
        Double c = teclado.nextDouble();
       
        double f = (c * 1.8) + 32;
        
        System.out.println("A temperatura"+c+ "C é igual a " +f+"F");
        
        
       
    
}
}