
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Entre com o valor/hora ");
        Double valorhora = teclado.nextDouble();
        
        System.out.println("Entre com o valor de horas trabalhadas no mês: ");
        Double horatrab = teclado.nextDouble();
        
        Double salario =  valorhora * horatrab;
        
        System.out.println("O seu salario desse mês é: "+salario);
        
        
    }
    
}
