
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class Exercicio11 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com um numero inteiro");
        int numero1 = teclado.nextInt();
        
        System.out.println("Entre com o segundo numero inteiro");
        int numero2 = teclado.nextInt();
        
        System.out.println("Entre com um numero real:");
        Double numero3 = teclado.nextDouble();
        
        int resultado1 = (numero1 *2) * (numero2 / 2);
        Double resultado2 =  (numero1 *3) +(numero3);
        Double resultado3 = Math.pow(numero3, 3);
        
        System.out.println("Resultado1: " +numero1);
        System.out.println("Resultado2: " +numero2);
        System.out.println("Resultado3: " +numero3);
        
        
   
    }
 
    
    
  
}
